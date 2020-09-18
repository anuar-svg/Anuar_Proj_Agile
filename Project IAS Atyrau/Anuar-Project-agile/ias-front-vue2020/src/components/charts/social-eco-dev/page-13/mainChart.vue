<template>
  <div class="container-fluid" style="width: 60vw;" v-if="allData">
      <div class="d-flex">
        <v-card style="width: 0px" to="/main/social-eco-dev"><svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 24 24" fill="black" width="20px" height="18px"><path d="M0 0h24v24H0z" fill="none"/><path d="M21 11H6.83l3.58-3.59L9 6l-6 6 6 6 1.41-1.41L6.83 13H21z"/></svg></v-card>
        <h3 class="mx-auto">Ветеринария</h3>
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
      htmlIndex: 'Бешенство крупного рогатого скота, тыс. голов',
      regions: [],
      years: [],
      allData: [],
      changeData: [],
      indicators: {'Бешенство крупного рогатого скота, тыс. голов':'rabiesOfCattle', 'Бешенство мелкого рогатого скота, тыс. голов':'rabiesOfSmallCattle', 'Бешенство лошади, тыс. голов':'rabiesOfHorse', 'Бешенство верблюдов, тыс. голов':'rabiesOfCamels', 'Бешенство собак, тыс. голов':'rabiesOfDogs', 'Бешенство кошек, тыс. голов':'rabiesOfCats', 'Сибирская язва крупного рогатого скота, тыс. голов':'anthraxOfCattle', 'Сибирская язва мелкого рогатого скота, тыс. голов':'anthraxOfSmallCattle', 'Сибирская язва лошодей, тыс. голов':'anthraxOfHorses', 'Сибирская язва свиней, тыс. голов':'anthraxOfPigs', 'Сибирская язва верблюдов, тыс. голов':'anthraxOfCamels', 'Туберкулинизация крупного рогатого скота, тыс. голов':'tuberculinizationOfCattle', 'Туберкулинизация верблюдов, тыс. голов':'tuberculinizationOfCamels', 'Эхинококкоз плотоядных, тыс. голов':'echinococcosisOfCarnivores', 'Вакцинация животных против особо опасных заболеваний, тыс. голов':'vaccinationOfAnimals', 'Пастереллез крупного рогатого скота, тыс. голов':'pasteurellosisOfCattle', 'Нодулярный дерматит, тыс. голов':'nodularDermatitis', 'Сап лошадей, тыс. голов':'sapofHorses', 'Высокопатогенный грипп птиц, тыс. голов':'highlyPathogenicAvianInfluenza', 'Эмфизематозного карбункул крупного рогатого, тыс. голов':'emphysematousBovineCarbuncle', 'Чума верблюдов, тыс. голов':'plagueOfCamels'},
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
        axios.get('http://localhost:8070/api/statistics/monitoring-sed/veterenary', {
            params: {
                year: year
            }
        }).then(d => {
            this.allData = d.data   
            let key = this.indicators[this.htmlIndex]
            this.changeData = this.allData.map(d => d[key])
        }).catch(err => console.log(err));
    }
  },
  created() {
        axios.get('http://localhost:8070/api/statistics/monitoring-sed/veterenary/years')
        .then(arrYears => {
            this.years = arrYears.data.sort()
        })
        .catch(error => console.log(error))

        axios.get('http://localhost:8070/api/statistics/monitoring-sed/veterenary', {
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