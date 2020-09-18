<template>
  <div class="container-fluid" style="width: 60vw;" v-if="allData">
      <div class="d-flex">
        <v-card style="width: 0px" to="/main/social-eco-dev"><svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 24 24" fill="black" width="20px" height="18px"><path d="M0 0h24v24H0z" fill="none"/><path d="M21 11H6.83l3.58-3.59L9 6l-6 6 6 6 1.41-1.41L6.83 13H21z"/></svg></v-card>
        <h3 class="mx-auto">Экономика</h3>
      </div>
    <div class="row d-flex">
            <div class="dropdown col-5">
                <p>Показатель</p>
                <button style="font-size: .7rem; max-width: 20vw; overflow-x: hidden" class="btn btn-primary dropdown-toggle" type="button" id="dropdownMenuButton" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false" >
                    {{ htmlIndex }}
                </button>
                <div class="dropdown-menu" aria-labelledby="dropdownMenuButton" style="max-height: 200px; overflow-x: hidden;">
                    <a style="font-size: .7rem" @click="changeIndicator(i)" v-for="i in Object.keys(indicators)" :key="i" class="dropdown-item">{{ i }}</a>
                </div>
            </div>
            <button class="btn btn-primary col-2" style="font-size: .7rem; margin-top: 40px; margin-right: 20px" @click="changeMonthes()">Ежемесячные</button>
            <button class="btn btn-primary col-2" style="font-size: .7rem; margin-top: 40px; margin-right: 20px" @click="changeQuarters()">Квартальные</button>
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
            <div class="col-12">
                <HorizontalBar
                :height="200"
                :chartData="changeData"
                :chartLabels="months"
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
      htmlYears: '2019',
      htmlIndex: 'Индекс потребительских цен',
      regions: [],
      years: [],
      allData: [],
      changeData: [],
      indicators: {},
      indicatorsByMonthes: {'Индекс потребительских цен':'consumerPriceIndex', 'Индекс потребительских цен (продовольственные товары)':'consumerPriceIndexArticleOfFood', 'Индекс потребительских цен (непродовольственные товары)':'consumerPriceIndexNonFood', 'Индекс потребительских цен (платные услуги)':'consumerPriceIndexNonFoodPaidService', 'Поступление налогов и других платежей':'receiptOfTaxesAndOtherPayments', '% к прогнозу РБ':'forecastOfRB', '% к прогнозу МБ':'forecastOfMB', 'Национальный фонд':'nationalFund', 'Налоговые поступления':'taxRevenue', 'Неналоговые поступления':'nonTaxReceipts', 'Поступления от продажи':'proceedsFromTheSale', 'Рост налоговых и ненологовых поступлений':'growthOfTaxAndNonTaxRevenues', 'Мировая цена на нефть':'worldPriceOfOil', 'РБ, млн. тенге':'rb', 'МБ, млн.тенге':'mb'},

      indicatorsByQuarters: {'ВРП на душу населения, тыс. тг':'grpperCapita', 'Обьем ВРП, млрд. тг':'grpvolume'},
      indicators: {},
      yearsBtn1: true,
      yearsBtn2: false,
      byYearsFromYears: [],
      months: []
    };
  },
  methods: {
    changeMonthes() {
        this.yearsBtn1 = true
        this.yearsBtn2 = false
        this.htmlIndex = 'Индекс потребительских цен'
        this.htmlYears = this.years[this.years.length - 1]

        axios.get('http://localhost:8070/api/statistics/monitoring-sed/economy/years')
        .then(arrYears => {
            this.years = arrYears.data["Года ежемесячной экономики"].sort()
        })
        .catch(error => console.log(error))

        axios.get('http://localhost:8070/api/statistics/monitoring-sed/economy', {
            params: {
                year: this.years[this.years.length - 1],
                byMonthes: true
            }
        })
        .then(arrMonths => {
            this.indicators = this.indicatorsByMonthes
            
            this.allData = arrMonths.data
            this.months = arrMonths.data.map(d => d.month)
            let key = this.indicators[this.htmlIndex]
            this.changeData = this.allData.map(d => d[key])
        })
        .catch(error => console.log(error))
    },
      changeQuarters() {
        this.yearsBtn1 = false
        this.yearsBtn2 = true
        this.htmlIndex = 'ВРП на душу населения, тыс. тг'
        this.htmlYears = this.years[this.years.length - 1]

        axios.get('http://localhost:8070/api/statistics/monitoring-sed/economy/years')
        .then(arrYears => {
            this.years = arrYears.data["Года ежеквартальной экономики"].sort()
        })
        .catch(error => console.log(error))

        axios.get('http://localhost:8070/api/statistics/monitoring-sed/economy', {
            params: {
                year: this.years[this.years.length - 1],
                byQuarters: true
            }
        })
        .then(arrMonths => {
            this.allData = arrMonths.data
            this.indicators = this.indicatorsByQuarters
            
            this.months = arrMonths.data.map(d => d.quarter)
            let key = this.indicators[this.htmlIndex]
            this.changeData = this.allData.map(d => d[key])
        })
        .catch(error => console.log(error))
    },
    changeIndicator(i) {
        this.htmlIndex = i
        let key = this.indicators[this.htmlIndex]
        this.changeData = this.allData.map(d => d[key])
    },
    changeYearByMonthes(year) {
        this.htmlYears = year
        console.log(year)
        axios.get('http://localhost:8070/api/statistics/monitoring-sed/economy', {
            params: {
                year: year,
                byMonthes: true
            }
        }).then(d => {
            this.allData = d.data
            this.months = d.data.map(e => e.month)
            let key = this.indicators[this.htmlIndex]
            this.changeData = this.allData.map(e => e[key])
        }).catch(err => console.log(err));
    },
    changeYearByQuarters(year) {
        this.htmlYears = year
        axios.get('http://localhost:8070/api/statistics/monitoring-sed/economy', {
            params: {
                year: year,
                byQuarters: true
            }
        }).then(d => {
            this.allData = d.data
            this.months = d.data.map(e => e.quarter)
            let key = this.indicators[this.htmlIndex]
            this.changeData = this.allData.map(e => e[key])
        }).catch(err => console.log(err));
    }
  },
  created() {
        axios.get('http://localhost:8070/api/statistics/monitoring-sed/economy/years')
        .then(arrYears => {
            this.years = arrYears.data["Года ежеквартальной экономики"].sort()
            this.htmlYears = this.years[this.years.length - 1]
        })
        .catch(error => console.log(error))

        axios.get('http://localhost:8070/api/statistics/monitoring-sed/economy', {
            params: {
                year: this.htmlYears,
                byMonthes: true
            }
        })
        .then(arrMonths => {            
            this.indicators = this.indicatorsByMonthes
            this.htmlIndex = 'Индекс потребительских цен'

            this.allData = arrMonths.data
            this.months = arrMonths.data.map(d => d.month)
            let key = this.indicators[this.htmlIndex]
            this.changeData = this.allData.map(d => d[key])
            // this.updateStatistics(arrMonths, this.indicators)
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