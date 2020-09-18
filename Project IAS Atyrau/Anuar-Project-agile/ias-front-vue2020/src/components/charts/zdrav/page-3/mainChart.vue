<template>
  <div class="container-fluid" style="width: 100vw;" v-if="arrRegions.length > 0">
    <div class="row">
            <div class="dropdown offset-10">
            <button style="font-size: .7rem" class="btn btn-primary dropdown-toggle" type="button" id="dropdownMenuButton" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                {{ htmlYears }}
            </button>
            <div class="dropdown-menu" aria-labelledby="dropdownMenuButton">
                <a style="font-size: .7rem" @click="viewYear(i.year)" v-for="i in arrYears" :key="i.year" class="dropdown-item">{{ i.year }}</a>
            </div>
            </div>
    </div>
        <div class="row">
            <div class="col-10 mx-auto" v-if="arrRegions.length > 0">
                <GeneralMorbidity
                :height="100"
                :chartData="arrRegions"
                :chartColors="regionsChartColors"
                label="ОБЩАЯ ЗАБОЛЕВАЕМОСТЬ ЧЕЛОВЕКА"
                />
            </div>
            <div class="d-flex col-12">
                <!-- <button  v-for="item in arrRegions" :key="item.region">{{ item.region }}</button> -->
                <div class="dropdown col-6">
                <button style="font-size: .7rem" class="btn btn-primary dropdown-toggle" type="button" id="dropdownMenuButton" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                    {{ htmlRegions }}
                </button>
                <div class="dropdown-menu" aria-labelledby="dropdownMenuButton">
                    <a style="font-size: .7rem" v-for="i in arrRegions" :key="i.region" @click="viewRegion(i)" class="dropdown-item">{{ i.region === '' ? i.area : i.region }}</a>
                </div>
                </div>
                <div class="dropdown col-2">
                <button style="font-size: .7rem" class="btn btn-success dropdown-toggle" type="button" id="dropdownMenuButton" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                    {{ htmlType }}
                </button>
                <div class="dropdown-menu" aria-labelledby="dropdownMenuButton">
                    <a style="font-size: .7rem" v-for="i in Object.keys(types)" :key="i"  @click="viewMortality(types[i], i)" class="dropdown-item">{{ i }}</a>
                </div>
            </div>
            </div>
        </div>
        <div class="row" v-if="arrYears.length > 0" >
            <div class="col-6">
                <mortalityTypesLine
                :height="100"
                :chartData="ills"
                :chartLabels="years"
                :chartColors="regionsChartColors"
                :label="htmlType"
                />
            </div>
            <div class="col-6" v-if="arrRegions.length > 0">
                <!-- PopulationYears -->
                <mortalityTypesBar
                :height="100"
                :chartData="ills"
                :chartLabels="years"
                :chartColors="regionsChartColors"
                label="Человек на 100 тыс"
                />
            </div>
        </div>
        <ul class="pagination pagination-sm d-flex justify-center">
            <v-card class="page-link" to="1">1</v-card>
            <v-card class="page-link" to="2">2</v-card>
            <v-card class="page-link disabled" to="3">3</v-card>
            <v-card class="page-link" to="4">4</v-card>
            <v-card class="page-link" to="5">5</v-card>
            <v-card class="page-link" to="6">6</v-card>
        </ul>
  </div>
</template>

<script>
import axios from "axios";

import GeneralMorbidity from "./GeneralMorbidity";

import mortalityTypesBar from "./mortalityTypesBar";
import mortalityTypesLine from "./mortalityTypesLine";

export default {
  components: {
    GeneralMorbidity,
    mortalityTypesBar,
    mortalityTypesLine
  },
  data() {
    return {
      arrRegions: [],
      regionsChartColors: {
        borderColor: "#077187",
        pointBorderColor: "#0E1428",
        pointBackgroundColor: "#AFD6AC",
        backgroundColor: "rgb(1, 184, 170)"
      },
      years: [],
      regions: [],
      arrYears: [],
      arrExpectancy: [],
      page: 1,
      ills: {},
      types: {},
      htmlYears: '2016',
      htmlRegions: 'Атырауская область',
      htmlType: 'Заболеваемость от ишемических болезней сердца'
    }; 
  },
  methods: {
    viewRegion(i) {
        // console.log(region)
        axios.get('http://localhost:8070/api/statistics/zdrav-kpi/morbidities', {
            params: {
                region: i.region
            }
        }).then(d => {
            this.types['Заболеваемость от болезней системы кровообращения'] = d.data.map(a => a.bloodCirculation)
            this.types['Заболеваемость от болезней системы кровообращения Артериальная гипертензия'] = d.data.map(a => a.arterialhypertension)
            this.types['Заболеваемость от ишемических болезней сердца'] = d.data.map(a => a.coronaryHeartDisease)
            this.types['Заболеваемость от болезней системы кровообращения Острый инфаркт миокарда'] = d.data.map(a => a.acuteMyocardialInfarction)
            this.types['Заболеваемость от онкологических заболеваний'] = d.data.map(a => a.cancer)
            this.types['Заболеваемость от психических растройств и растройств поведения'] = d.data.map(a => a.mbd)
            this.types['Заболеваемость от психических растройств и растройств поведения, с употреблением психоактивных веществ'] = d.data.map(a => a.mbdSu)
            this.types['Заболеваемость от травм, отравлений и т.д'] = d.data.map(a => a.injuries)
            this.types['Заболеваемость туберкулёзом'] = d.data.map(a => a.tuberculosis)
            this.types['Распространенность ВИЧ-инфекций в возрастной группе 15-49 лет'] = d.data.map(a => a.hiv)
            
            this.ills = this.types[this.htmlType]
            }).catch(err => console.log(err));
        // console.log(test)
        // console.log(this.arrYears)
        this.htmlRegions = i.region === '' ? i.area : i.region
    },
    viewYear(year) {
        // console.log(year)
        axios.get('http://localhost:8070/api/statistics/zdrav-kpi/morbidities', {
            params: {
                year: year
            }
        }).then(d => {
            this.arrRegions = d.data
            }).catch(err => console.log(err));

        axios.get('http://localhost:8070/api/statistics/zdrav-kpi/morbidities', {
            params: {
                year: year
            }
        }).then(d => {
            this.types['Заболеваемость от болезней системы кровообращения'] = d.data.map(a => a.bloodCirculation)
            this.types['Заболеваемость от болезней системы кровообращения Артериальная гипертензия'] = d.data.map(a => a.arterialhypertension)
            this.types['Заболеваемость от ишемических болезней сердца'] = d.data.map(a => a.coronaryHeartDisease)
            this.types['Заболеваемость от болезней системы кровообращения Острый инфаркт миокарда'] = d.data.map(a => a.acuteMyocardialInfarction)
            this.types['Заболеваемость от онкологических заболеваний'] = d.data.map(a => a.cancer)
            this.types['Заболеваемость от психических растройств и растройств поведения'] = d.data.map(a => a.mbd)
            this.types['Заболеваемость от психических растройств и растройств поведения, с употреблением психоактивных веществ'] = d.data.map(a => a.mbdSu)
            this.types['Заболеваемость от травм, отравлений и т.д'] = d.data.map(a => a.injuries)
            this.types['Заболеваемость туберкулёзом'] = d.data.map(a => a.tuberculosis)
            this.types['Распространенность ВИЧ-инфекций в возрастной группе 15-49 лет'] = d.data.map(a => a.hiv)
            
            this.ills = this.types[this.htmlType]
        });
        this.htmlYears = year
    },
    viewMortality(array, name){
        this.ills = array
        this.htmlType = name

    }
  },
  created() {
    axios.all([
        axios.get('http://localhost:8070/api/statistics/zdrav-kpi/morbidities', {
            params: {
                year: '2016'
            }
        }),
        axios.get('http://localhost:8070/api/statistics/zdrav-kpi/morbidities', {
            params: {
                region: ''
            }
        })
      ])
    .then(axios.spread((arrRegions, arrYears) => {
        this.arrRegions = arrRegions.data
        this.types['Заболеваемость от болезней системы кровообращения'] = arrRegions.data.map(a => a.bloodCirculation)
        this.types['Заболеваемость от болезней системы кровообращения Артериальная гипертензия'] = arrRegions.data.map(a => a.arterialhypertension)
        this.types['Заболеваемость от ишемических болезней сердца'] = arrRegions.data.map(a => a.coronaryHeartDisease)
        this.types['Заболеваемость от болезней системы кровообращения Острый инфаркт миокарда'] = arrRegions.data.map(a => a.acuteMyocardialInfarction)
        this.types['Заболеваемость от онкологических заболеваний'] = arrRegions.data.map(a => a.cancer)
        this.types['Заболеваемость от психических растройств и растройств поведения'] = arrRegions.data.map(a => a.mbd)
        this.types['Заболеваемость от психических растройств и растройств поведения, с употреблением психоактивных веществ'] = arrRegions.data.map(a => a.mbdSu)
        this.types['Заболеваемость от травм, отравлений и т.д'] = arrRegions.data.map(a => a.injuries)
        this.types['Заболеваемость туберкулёзом'] = arrRegions.data.map(a => a.tuberculosis)
        this.types['Распространенность ВИЧ-инфекций в возрастной группе 15-49 лет'] = arrRegions.data.map(a => a.hiv)

        this.regions = arrRegions.data.map(a => a.region === '' ? a.area : a.region)
        this.ills = this.types[this.htmlType]
        this.years = arrYears.data.map(a => a.year)

        this.arrYears = arrYears.data
    }))
    .catch(error => console.log(error))
  }
};
</script>

<style scoped>
    .nav-link{
        font-size: .7rem;
    }

    .page-link {
        color: blue
    }

    .disabled {
        color: black
    }
</style>