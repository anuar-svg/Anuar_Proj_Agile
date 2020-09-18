<template>
  <div class="container-fluid" style="width: 60vw;" v-if="allData">
      <div class="d-flex">
        <v-card style="width: 0px" to="/main/social-eco-dev"><svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 24 24" fill="black" width="20px" height="18px"><path d="M0 0h24v24H0z" fill="none"/><path d="M21 11H6.83l3.58-3.59L9 6l-6 6 6 6 1.41-1.41L6.83 13H21z"/></svg></v-card>
        <h3 class="offset-4">Здравоохранение</h3>
      </div>
    <div class="row d-flex">
            <div class="dropdown col-7">
                <p>Показатель</p>
                <button style="font-size: .7rem" class="btn btn-primary dropdown-toggle" type="button" id="dropdownMenuIndex" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                    {{ htmlIndex }}
                </button>
                <div class="dropdown-menu" aria-labelledby="dropdownMenuIndex">
                    <a style="font-size: .7rem" @click="changeIndicator(i)" v-for="i in Object.keys(indicators)" :key="i" class="dropdown-item">{{ i }}</a>
                </div>
            </div>
            <div class="dropdown col-2 offset-3">
                <p>Год</p>
                <button style="font-size: .7rem" class="btn btn-primary dropdown-toggle" type="button" id="dropdownMenuButton" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                    {{ htmlYears }}
                </button>
                <div class="dropdown-menu" aria-labelledby="dropdownMenuButton">
                    <a style="font-size: .7rem" @click="changeYear(i)" v-for="i in years" :key="i" class="dropdown-item">{{ i }}</a>
                </div>
            </div>
    </div>
        <div class="row">
            <div class="col-12">
                <HorizontalBar
                :height="200"
                :chartData="Object.values(changeData)"
                :chartLabels="Object.keys(changeData)"
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

import LineChart from "./Line-chart";

export default {
  components: {
    HorizontalBar,
    LineChart
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
      htmlYears: '2017',
      htmlIndex: 'Кол-во санитарных машин, единиц',
      regions: [],
      years: [],
      allData: [],
      changeData: [],
      indicators: {'Из них бытовые травмы, единиц':'domesticInjuries', 'Из них взрослые, единиц':'adults', 'Из них дети, единиц':'children', 'Из них довезенные в больницу, единиц':'takenByHospital', 'Из них ДТП, единиц':'numberOfDTP', 'Из них ожоги, единиц':'burns', 'Из них помещенные в больницу, единиц':'placedToHospital', 'Из них производственные травмы, единиц':'industrialInjuries', 'Кол-во бригад скорой помощи ССМП, единиц':'ambulanceCrews', 'Кол-во вызовов по станции скорой помощи, единиц':'callsToAmbulance', 'Кол-во санитарных машин, единиц':'ambulances'},
      indexKey: 'Кол-во санитарных машин, единиц'
    };
  },
  methods: {
    updateStatistics(update) {
        this.allData = update.data
        let key = this.indicators[this.htmlIndex]
        this.changeData = this.allData[key]
    },
    changeIndicator(i) {
        this.htmlIndex = i
        axios.get('http://localhost:8070/api/statistics/monitoring-sed/healthcare', {
            params: {
                year: this.htmlYears
            }
        })
        .then(arrMonths => {
            this.updateStatistics(arrMonths)
        })
        .catch(error => console.log(error))
    },
    changeYear(year) {
        this.htmlYears = year
        axios.get('http://localhost:8070/api/statistics/monitoring-sed/healthcare', {
            params: {
                year: year
            }
        }).then(d => {
            this.updateStatistics(d)
        }).catch(err => console.log(err));
    }
  },
  created() {
        axios.get('http://localhost:8070/api/statistics/monitoring-sed/healthcare/years')
        .then(arrYears => {
            this.years = arrYears.data
        })
        .catch(error => console.log(error))

        axios.get('http://localhost:8070/api/statistics/monitoring-sed/healthcare', {
            params: {
                year: this.htmlYears
            }
        })
        .then(arrMonths => {            
            this.updateStatistics(arrMonths)
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