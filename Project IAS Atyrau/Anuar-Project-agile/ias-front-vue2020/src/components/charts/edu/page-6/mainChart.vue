<template>
  <div class="container-fluid" style="width: 60vw;" v-if="htmlRegions">
            <div class="dropdown offset-11">
            <button style="font-size: .7rem" class="btn btn-primary dropdown-toggle" type="button" id="dropdownMenuButton" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                {{ htmlYears }}
            </button>
            <div class="dropdown-menu" aria-labelledby="dropdownMenuButton">
                <a style="font-size: .7rem" @click="viewYear(i)" v-for="i in years" :key="i" class="dropdown-item">{{ i }}</a>
            </div>
            </div>
        <div class="row">
            <div class="col-4">
                <div class="row">
                    <div class="col" style="overflow: scroll; max-height: 25vh">
                        <div v-for="i in htmlRegions" @click="viewRegion(i)" style="font-size: .6rem">
                            <input type="checkbox" :checked="i == checkBoxRegion"> {{ i }}
                        </div>
                    </div>
                    <div class="col" style="overflow: scroll; max-height: 25vh">
                        <div v-for="i in districts" @click="viewDistrict(i)" style="font-size: .6rem">
                            <input type="checkbox" :checked="i == checkBoxDistrict"> {{ i }}
                        </div>
                    </div>
                </div>
                <div class="row">
                    <div class="col" style="overflow: scroll; max-height: 25vh">
                        <div  v-for="i in schools" @click="viewSchool(i)" style="font-size: .6rem">
                            <input type="checkbox" :checked="i == checkBoxSchool"> {{ i }}
                        </div>
                    </div>
                </div>
            </div>
            <div class="col-4">
                <HorizontalBar
                :chartData="[numberOfSchools]"
                :chartLabels="[htmlYears]"
                :chartColors="regionsChartColors"
                label="КОЛ-ВО ШКОЛ, единиц"
                />
            </div>
            <div class="col-4">
                <HorizontalBar
                :chartData="[numberOfPlacesInSchool, numberOfStudents]"
                :chartLabels="['КОЛ-ВО МЕСТ', 'КОЛ-ВО УЧЕНИКОВ']"
                :chartColors="regionsChartColors"
                label="КОЛ-ВО МЕСТ И УЧЕНИКОВ, единиц"
                />
            </div>
        </div>
        <div class="row">
            <div class="col-12 d-flex">
                <div class="col-6">
                    <HorizontalBar
                    :height="250"
                    :chartData="[numberOfGraduates, participantsENT]"
                    :chartLabels="['ВЫПУСКНИКИ', 'УЧАСТНИКИ ЕНТ']"
                    :chartColors="regionsChartColors"
                    label="ВЫПУСКНИКИ И УЧАСТНИКИ ЕНТ, человек"
                    />
                </div>
                <div class="col-6">
                    <BarChart
                    :height="250"
                    :chartData="[withCertificateistinction, withGoldenMedal, withTheLowestRating, withUnsatisfactoryRating]"
                    :chartLabels="['АТЕСТАТ С ОТЛИЧИЕМ', 'ЗОЛОТАЯ МЕДАЛЬ', 'САМАЯ НИЗКАЯ ОЦЕНКА', 'С НЕУДОВЛЕТВОРИТЕЛЬНОЙ ОЦЕНКОЙ']"
                    :chartColors="regionsChartColors"
                    label="РЕЗУЛЬТАТЫ И УЧАСТНИКИ ЕНТ, человек"
                    />
                </div>
            </div>
        </div>
        <ul class="pagination pagination-sm offset-4">
            <v-card class="page-link" to="1">1</v-card>
            <v-card class="page-link" to="2">2</v-card>
            <v-card class="page-link" to="3">3</v-card>
            <v-card class="page-link" to="4">4</v-card>
            <v-card class="page-link" to="5">5</v-card>
            <v-card class="page-link disabled" to="6">6</v-card>
            <v-card class="page-link" to="7">7</v-card>
            <v-card class="page-link" to="8">8</v-card>
            <v-card class="page-link" to="9">9</v-card>
            <v-card class="page-link" to="10">10</v-card>
        </ul>
  </div>
</template>

<script>
import axios from "axios";

import HorizontalBar from "./HorizontalBar";

import BarChart from "./BarChart";

export default {
  components: {
    HorizontalBar,
    BarChart
  },
  data() {
    return {
      regionsChartColors: {
        borderColor: "#077187",
        pointBorderColor: "#0E1428",
        pointBackgroundColor: "#AFD6AC",
        backgroundColor: ["orange", "red", "blue", "green"],
        pointHitRadius: 10
      },
      htmlYears: '2018-2019',
      htmlRegions: new Set(),
      years: [2016, 2017, 2018],
      districts: [],
      checkBoxRegion: '0',
      checkBoxDistrict: '0',
      checkBoxSchool: '0',
      numberOfStudents: 0,
      numberOfPlacesInSchool: 0,
      numberOfGraduates: 0,
      participantsENT: 0,
      numberOfSchools: 0,
      withGoldenMedal: 0,
      withCertificateistinction: 0,
      withTheLowestRating: 0,
      withUnsatisfactoryRating: 0,
      schools: []
    };
  },
  methods: {
    updateStatistics(arrRegions) {
        let regions = arrRegions.data.map(d => d.region)
        this.htmlRegions = new Set(regions)
        this.numberOfSchools = arrRegions.data.length
        this.districts = arrRegions.data.map(d => d.district)
        this.districts = new Set(this.districts)
        this.schools = arrRegions.data.map(d => d.name)

        this.numberOfPlacesInSchool = 0
        this.numberOfStudents = 0
        this.numberOfGraduates = 0
        this.participantsENT = 0
        this.withGoldenMedal = 0
        this.withCertificateistinction = 0
        this.withTheLowestRating = 0
        this.withUnsatisfactoryRating = 0

        arrRegions.data.map(d => {
            this.numberOfPlacesInSchool += d.numberOfPlacesInSchool
            this.numberOfStudents += d.numberOfStudents
            this.numberOfGraduates += d.numberOfGraduates
            this.participantsENT += d.participantsENT
            this.withGoldenMedal += d.withGoldenMedal
            this.withCertificateistinction += d.withCertificateistinction
            this.withTheLowestRating += d.withTheLowestRating
            this.withUnsatisfactoryRating += d.withUnsatisfactoryRating
        })
    },
    viewRegion(i) {
        axios.get('http://localhost:8070/api/statistics/edu/schools', {
            params: {
                region: i,
                year: this.htmlYears
            }
        }).then(d => {
            if(this.checkBoxRegion == i){
                this.checkBoxRegion = '0'
                this.checkBoxDistrict = '0'
                this.checkBoxSchool = '0'
                this.viewYear(this.htmlYears)
            }else{
                this.checkBoxRegion = i
                this.updateStatistics(d)
            }
        }).catch(err => console.log(err));
    },
    viewDistrict(i) {
        axios.get('http://localhost:8070/api/statistics/edu/schools', {
            params: {
                district: i,
                year: this.htmlYears
            }
        }).then(d => {
            if(this.checkBoxDistrict == i){
                this.checkBoxDistrict = '0'
                this.checkBoxRegion = '0'
                this.checkBoxSchool = '0'
                this.viewYear(this.htmlYears)
            }else{
                this.checkBoxRegion = d.data[0].region
                this.checkBoxDistrict = i
                this.updateStatistics(d)
            }
        }).catch(err => console.log(err));
    },
    viewYear(year) {
        this.htmlYears = year
        this.checkBoxRegion = '0'
        this.checkBoxDistrict = '0'
        this.checkBoxSchool = '0'
        axios.get('http://localhost:8070/api/statistics/edu/schools', {
            params: {
                year: this.htmlYears
            }
        }).then(d => {
            this.updateStatistics(d)
        }).catch(err => console.log(err));
    },
    viewSchool(school) {
        axios.get('http://localhost:8070/api/statistics/edu/schools', {
            params: {
                year: this.htmlYears,
                name: school
            }
        }).then(d => {
            if(this.checkBoxSchool == school){
                this.checkBoxDistrict = '0'
                this.checkBoxRegion = '0'
                this.checkBoxSchool = '0'
                this.viewYear(this.htmlYears)
            }else{
                this.checkBoxSchool = d.data[0].name
                this.checkBoxRegion = d.data[0].region
                this.checkBoxDistrict = d.data[0].district
                this.updateStatistics(d)
            }
        }).catch(err => console.log(err));
    }
  },
  created() {
    axios.get('http://localhost:8070/api/statistics/edu/schools', {
        params: {
            year: this.htmlYears
        }
    })
    .then((arrRegions) => {
        this.updateStatistics(arrRegions)
    })
    .catch(error => console.log(error))
    axios.get('http://localhost:8070/api/statistics/edu/schools/years')
        .then(d => this.years = d.data.sort())
        .catch(err => console.log(err))


  }
};
</script>

<style scoped>
    body{
        font-size: .7rem;
    }

    .page-link {
        color: blue
    }

    .disabled {
        color: black
    }
</style>