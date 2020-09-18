<template>
  <div class="container-fluid" style="width: 60vw;" v-if="allData">
      <div class="d-flex">
        <v-card style="width: 0px" to="/main/social-eco-dev"><svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 24 24" fill="black" width="20px" height="18px"><path d="M0 0h24v24H0z" fill="none"/><path d="M21 11H6.83l3.58-3.59L9 6l-6 6 6 6 1.41-1.41L6.83 13H21z"/></svg></v-card>
        <h3 class="mx-auto">Транспорт и автомобильные дороги</h3>
      </div>
    <div class="row d-flex">
            <div class="dropdown col-5" v-if="MQIndicator">
                <p>Показатель</p>
                <button style="font-size: .7rem; max-width: 20vw; overflow-x: hidden" class="btn btn-primary dropdown-toggle" type="button" id="dropdownMenuButton" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false" >
                    {{ htmlIndex }}
                </button>
                <div class="dropdown-menu" aria-labelledby="dropdownMenuButton" style="max-height: 200px; overflow-x: hidden;">
                    <a style="font-size: .7rem" @click="changeIndicator(i)" v-for="i in Object.keys(indicators)" :key="i" class="dropdown-item">{{ i }}</a>
                </div>
            </div>
            <div class="dropdown col-5" v-if="yearsIndicator">
                <p>Показатель</p>
                <button style="font-size: .7rem; max-width: 20vw; overflow-x: hidden" class="btn btn-primary dropdown-toggle" type="button" id="dropdownMenuButton" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false" >
                    {{ htmlIndex }}
                </button>
                <div class="dropdown-menu" aria-labelledby="dropdownMenuButton" style="max-height: 200px; overflow-x: hidden;">
                    <a style="font-size: .7rem" @click="changeIndicatorToYears(i)" v-for="i in Object.keys(indicators)" :key="i" class="dropdown-item">{{ i }}</a>
                </div>
            </div>
            <button class="btn btn-primary col-2" style="font-size: .7rem; margin-top: 40px; margin-right: 20px" @click="changeMonthes()">Ежемесячные</button>
            <button class="btn btn-primary col-1" style="font-size: .7rem; margin-top: 40px; margin-right: 20px" @click="changeYears()"
            >Годовые</button>
            <div class="dropdown col-1" v-if="yearsBtn1">
                <p>Год</p>
                <button style="font-size: .7rem" class="btn btn-primary dropdown-toggle" type="button" id="dropdownMenuButton" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                    {{ htmlYears }}
                </button>
                <div class="dropdown-menu" aria-labelledby="dropdownMenuButton">
                    <a style="font-size: .7rem" @click="changeYearByMonthes(i)" v-for="i in years" :key="i" class="dropdown-item">{{ i }}</a>
                </div>
            </div>
            <div class="dropdown col-1" v-if="yearsBtn2">
                <p>Год</p>
                <button style="font-size: .7rem" class="btn btn-primary dropdown-toggle" type="button" id="dropdownMenuButton" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                    {{ htmlYears }}
                </button>
                <div class="dropdown-menu" aria-labelledby="dropdownMenuButton">
                    <a style="font-size: .7rem" @click="changeYearByQuarters(i)" v-for="i in years" :key="i" class="dropdown-item">{{ i }}</a>
                </div>
            </div>
    </div>
        <div class="row">
            <div class="col-12" v-if="MQChart">
                <HorizontalBar
                :height="200"
                :chartData="changeData"
                :chartLabels="months"
                :chartColors="regionsChartColors"
                :label="htmlIndex"
                />
            </div>
            <div class="col-12" v-if="yearsChart">
                <HorizontalBar
                :height="200"
                :chartData="changeData"
                :chartLabels="byYearsFromYears"
                :chartColors="regionsChartColors"
                :label="htmlIndex"
                />
            </div>
        </div>
  </div>
</template>

<script>
import axios from "axios";

import HorizontalBar from "./HorizontalBar";

export default {
  components: {
    HorizontalBar
  },
  data() {
    return {
      regionsChartColors: {
        borderColor: "#077187",
        pointBorderColor: "#0E1428",
        pointBackgroundColor: "#AFD6AC",
        backgroundColor: "rgb(98, 153, 235)",
        pointHitRadius: 10
      },
      htmlYears: '2018',
      htmlIndex: 'Строительство дороги, млрд. тг',
      regions: [],
      years: [],
      allData: [],
      changeData: [],
      indicators: {},
      indicatorsByMonthes: {'Строительство дороги, млрд. тг':'roadBuilding', 'Строительство мостов, единиц':'constructionOfBridges', 'Перевозка грузов всеми видами транспорта, единиц':'transportationByAllTypes', 'Обьем грузооборота, единиц':'turnoverVolume', 'Пассажирооборот, единиц':'passengerTurnover', 'Перевезено пассажиров автотранспортом, единиц':'passengersTransportedByRoad'},

      indicatorsByYears: {'Общая протяженность дорог областного и районного значения, км':'totalLengthOfRoads', 'Доля автомобильных дорог местного значения':'percentageOfHighways', 'Протяженность дорог областого и районного значения':'lengthOfRoadsOfRegionalSignificance', 'Отреконструированные и отремонтированны дороги':'reconstructedRoads'},
      indicators: {},
      yearsBtn1: true,
      yearsBtn2: false,
      yearsIndicator: false,
      MQIndicator: true,
      MQChart: true,
      yearsChart: false,
      byYearsFromYears: [],
      months: []
    };
  },
  methods: {
    changeMonthes() {
        this.yearsBtn1 = true
        this.yearsBtn2 = false
        this.MQIndicator = true
        this.MQChart = true
        this.yearsIndicator = false
        this.yearsChart = false
        this.htmlIndex = 'Строительство дороги, млрд. тг'

        axios.get('http://localhost:8070/api/statistics/monitoring-sed/transport/years')
        .then(arrYears => {
            this.years = arrYears.data.sort()
            this.htmlYears = this.years[this.years.length - 1]
        })
        .catch(error => console.log(error))

        axios.get('http://localhost:8070/api/statistics/monitoring-sed/transport', {
            params: {
                year: this.htmlYears,
                byMonthes: true
            }
        })
        .then(arrMonths => {
            this.indicators = this.indicatorsByMonthes 
            this.allData = arrMonths.data
            let key = this.indicators[this.htmlIndex]
            this.changeData = this.allData.map(d=>d[key])
        })
        .catch(error => console.log(error))
    },
    changeYears() {
        this.yearsBtn1 = false
        this.yearsBtn2 = false
        this.MQIndicator = false
        this.MQChart = false
        this.yearsIndicator = true
        this.yearsChart = true
        this.htmlIndex = 'Общая протяженность дорог областного и районного значения, км'
        this.indicators = this.indicatorsByYears

        axios.get('http://localhost:8070/api/statistics/monitoring-sed/transport', {
            params: {
                byYears: true
            }
        })
        .then(arrMonths => {
            this.allData = arrMonths.data
            this.byYearsFromYears = []
            arrMonths.data.map(n => this.byYearsFromYears.push(n.year))
            let key = this.indicators[this.htmlIndex]
            this.changeData = arrMonths.data.map(d=>d[key])
            // this.updateStatistics(arrMonths, this.indicators)
        })
        .catch(error => console.log(error))
    },
    changeIndicator(i) {
        this.htmlIndex = i
        let key = this.indicators[this.htmlIndex]
        this.changeData = this.allData.map(d=>d[key])
    },
    changeIndicatorToYears(i) {
        this.htmlIndex = i
        let key = this.indicators[this.htmlIndex]
        this.changeData = this.allData.map(d=>d[key])
    },
    changeYearByMonthes(year) {
        this.htmlYears = year
        axios.get('http://localhost:8070/api/statistics/monitoring-sed/transport', {
            params: {
                year: year,
                byMonthes: true
            }
        }).then(d => {
            this.indicators = this.indicatorsByMonthes
            this.allData = d.data
            let key = this.indicators[this.htmlIndex]
            this.changeData = this.allData.map(e=>e[key])
        }).catch(err => console.log(err));
    },
  },
  created() {
        axios.get('http://localhost:8070/api/statistics/monitoring-sed/transport/years')
        .then(arrYears => {
            this.years = arrYears.data.sort()
            this.htmlYears = this.years[this.years.length - 1]
        })
        .catch(error => console.log(error))

        axios.get('http://localhost:8070/api/statistics/monitoring-sed/transport', {
            params: {
                year: this.htmlYears,
                byMonthes: true
            }
        })
        .then(arrMonths => {
            this.months = arrMonths.data.map(e => e.month)
            this.indicators = this.indicatorsByMonthes
            this.allData = arrMonths.data
            let key = this.indicators[this.htmlIndex]
            this.changeData = arrMonths.data.map(d=>d[key])
        })
        .catch(error => console.log(error))
  }
};
</script>

<style scoped>
    .nav-link{
        font-size: .7rem;
    }
</style>