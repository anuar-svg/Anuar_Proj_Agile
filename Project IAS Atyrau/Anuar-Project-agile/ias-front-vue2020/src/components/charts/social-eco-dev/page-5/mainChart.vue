<template>
  <div class="container-fluid" style="width: 60vw;" v-if="allData">
      <div class="d-flex">
        <v-card style="width: 0px" to="/main/social-eco-dev"><svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 24 24" fill="black" width="20px" height="18px"><path d="M0 0h24v24H0z" fill="none"/><path d="M21 11H6.83l3.58-3.59L9 6l-6 6 6 6 1.41-1.41L6.83 13H21z"/></svg></v-card>
        <h3 class="mx-auto">Государственная инспекция труда</h3>
      </div>
    <div class="row d-flex">
            <div class="dropdown col-7">
                <p>Показатель</p>
                <button style="font-size: .7rem" class="btn btn-primary dropdown-toggle" type="button" id="dropdownMenuIndex" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                    {{ htmlIndex }}
                </button>
                <div class="dropdown-menu" aria-labelledby="dropdownMenuIndex" style="max-height: 200px; overflow-x: hidden;">
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
                :chartData="changeData"
                :chartLabels="monthes"
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
      htmlIndex: 'Количество несчастных случаев, единиц',
      regions: [],
      years: [],
      allData: [],
      changeData: [],
      indicators: {'Количество несчастных случаев, единиц':'numberOfAccidents', 'Количество несчастных случаев (Из них групповых), единиц':'numberOfTeamAccidents', 'Количество пострадавших, человек':'numberOfVictims', 'Количество пострадавших (Из них погибших), человек':'numberOfVictimsDead', 'Мониторинг коллективных договоров, единиц':'monitoringOfCollectiveAgreements', 'Наложено администратиынфх штрафов, единиц':'administrativeFinesImposed', 'Выявление фактов несвоевременной выплаты заработной платы, человек':'untimelyPayments', 'Социальная напряженность в трудовых коллективах, единиц':'socialTension'},
      monthes: []
    };
  },
  methods: {
    changeIndicator(i) {
        this.htmlIndex = i
        let key = this.indicators[this.htmlIndex]
        this.changeData = this.allData.map(d => d[key])
    },
    changeYear(year) {
        this.htmlYears = year
        axios.get('http://localhost:8070/api/statistics/monitoring-sed/state-labor-inspectorate', {
            params: {
                year: year
            }
        }).then(d => {
            this.allData = d.data
            this.monthes = d.data.map(e => e.month)
            let key = this.indicators[this.htmlIndex]
            this.changeData = this.allData.map(d => d[key])
        }).catch(err => console.log(err));
    }
  },
  created() {
        axios.get('http://localhost:8070/api/statistics/monitoring-sed/state-labor-inspectorate/years')
        .then(arrYears => {
            this.years = arrYears.data.sort()
        })
        .catch(error => console.log(error))

        axios.get('http://localhost:8070/api/statistics/monitoring-sed/state-labor-inspectorate', {
            params: {
                year: this.htmlYears
            }
        })
        .then(arrMonths => {
            this.monthes = arrMonths.data.map(d => d.month)
            this.allData = arrMonths.data   
            let key = this.indicators[this.htmlIndex]
            this.changeData = this.allData.map(d => d[key])
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