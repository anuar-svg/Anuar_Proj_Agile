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
            <div class="col-10">
                <BarChart
                :height="70"
                :chartData="[highestCategory, firstCategory, secondCategory, withoutCategory]"
                :chartLabels="['ВЫСШАЯ КАТЕГОРИЯ', 'ПЕРВАЯ КАТЕГОРИЯ', 'ВТОРАЯ КАТЕГОРИЯ', 'БЕЗ КАТЕГОРИИ']"
                :chartColors="regionsChartColors"
                label="КАДРЫ ПО КАТЕГОРЯМ, человек"
                />
            </div>
        </div>
        <div class="row">
            <div class="col-12 d-flex">
                <div class="col-6">
                    <p style="text-align: center; font-size: .7rem">ПЕДАГОГИ ПО ВОЗРАСТУ, человек</p>
                    <PieChart
                    :height="250"
                    :chartData="[before25, from25to34, from35to44, from45to54, from55to64, after65]"
                    :chartLabels="['ДО 25 ЛЕТ', 'ОТ 25 ДО 34 ЛЕТ', 'ОТ 35 ДО 44 ЛЕТ', 'ОТ 45 ДО 54 ЛЕТ', 'ОТ 55 ДО 64 ЛЕТ', 'В ПЕНСИОННЫЕ ВОЗРАСТЕ']"
                    :chartColors="regionsChartColors"
                    label="ПЕДАГОГИ ПО ВОЗРАСТУ, человек"
                    />
                </div>
                <div class="col-6">
                    <p style="text-align: center; font-size: .7rem">ПЕДАГОГИ ПО ВОЗРАСТУ, человек</p>
                    <PieChart
                    :height="250"
                    :chartData="[before25, from25to34, from35to44, from45to54, from55to64, after65]"
                    :chartLabels="['ДО 25 ЛЕТ', 'ОТ 25 ДО 34 ЛЕТ', 'ОТ 35 ДО 44 ЛЕТ', 'ОТ 45 ДО 54 ЛЕТ', 'ОТ 55 ДО 64 ЛЕТ', 'В ПЕНСИОННЫЕ ВОЗРАСТЕ']"
                    :chartColors="regionsChartColors"
                    label="ПЕДАГОГИ ПО ВОЗРАСТУ, человек"
                    />
                </div>
            </div>
        </div>
        <ul class="pagination pagination-sm d-flex justify-center">
            <v-card class="page-link disabled" to="1">1</v-card>
            <v-card class="page-link" to="2">2</v-card>
            <v-card class="page-link" to="3">3</v-card>
            <v-card class="page-link" to="4">4</v-card>
            <v-card class="page-link" to="5">5</v-card>
            <v-card class="page-link" to="6">6</v-card>
        </ul>
  </div>
</template>

<script>
import axios from "axios";

import HorizontalBar from "./HorizontalBar";

import BarChart from "./BarChart";

import PieChart from "./PieChart";

export default {
  components: {
    HorizontalBar,
    BarChart,
    PieChart
  },
  data() {
    return {
      regionsChartColors: {
        borderColor: "#077187",
        pointBorderColor: "#0E1428",
        pointBackgroundColor: "#AFD6AC",
        backgroundColor: ["orange", "red", "blue", "green", "tomato", "aqua"],
        pointHitRadius: 10
      },
      htmlYears: '2018-2019',
      htmlRegions: new Set(),
      years: ['2018-2019'],
      districts: [],
      checkBoxRegion: '0',
      checkBoxDistrict: '0',
      checkBoxSchool: '0',
      candidates: {},
      schools : {},
      numCandidates: 0,
      firstCategory: 0,
      secondCategory: 0,
      highestCategory: 0,
      withoutCategory: 0,
      withHighEducation: 0,
      withSecondaryEducation: 0,
      withCollegeEducationInteger: 0,
      before25: 0,
      from25to34: 0,
      from35to44: 0,
      from45to54: 0,
      from55to64: 0,
      after65: 0,
    };
  },
  methods: {
    updateStatistics(arrRegions) {
        let regions = arrRegions.data.map(d => d.region)
        this.htmlRegions = new Set(regions)
        this.districts = new Set(arrRegions.data.map(d => d.district))
        this.schools = arrRegions.data.map(d => d.nameOfSchool)

        this.highestCategory = 0
        this.firstCategory = 0
        this.secondCategory = 0
        this.withoutCategory = 0
        this.numCandidates = 0
        this.withHighEducation = 0
        this.withSecondaryEducation = 0
        this.withCollegeEducationInteger = 0
        this.before25 = 0
        this.from25to34 = 0
        this.from35to44 = 0
        this.from45to54 = 0
        this.from55to64 = 0
        this.after65 = 0

        arrRegions.data.map(d => {
            this.highestCategory += d.highestCategory
            this.firstCategory += d.firstCategory
            this.secondCategory += d.secondCategory
            this.withoutCategory += d.withoutCategory
            this.numCandidates += d.numberOfTeachers
            this.withHighEducation += d.withHighEducation
            this.withSecondaryEducation += d.withSecondaryEducation
            this.withCollegeEducationInteger += d.withCollegeEducationInteger
            this.before25 += d.before25
            this.from25to34 += d.from25to34
            this.from35to44 += d.from35to44
            this.from45to54 += d.from45to54
            this.from55to64 += d.from55to64
            this.after65 += d.after65
        })

        arrRegions.data.map(d => {
            for(let i of d.candidates){
                if (i in this.candidates) {
                    this.candidates[i] += 1
                } else {
                    this.candidates[i] = 1
                }
            }
        })
    },
    viewRegion(i) {
        axios.get('http://localhost:8070/api/statistics/edu/school-teachers', {
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
        axios.get('http://localhost:8070/api/statistics/edu/school-teachers', {
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
        axios.get('http://localhost:8070/api/statistics/edu/school-teachers', {
            params: {
                year: this.htmlYears
            }
        }).then(d => {
            this.updateStatistics(d)
        }).catch(err => console.log(err));
    },
    viewSchool(school) {
        axios.get('http://localhost:8070/api/statistics/edu/school-teachers', {
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
                this.checkBoxSchool = d.data[0].nameOfSchool
                this.checkBoxRegion = d.data[0].region
                this.checkBoxDistrict = d.data[0].district
                this.updateStatistics(d)
            }
        }).catch(err => console.log(err));
    }
  },
  created() {
    axios.get('http://localhost:8070/api/statistics/edu/school-teachers', {
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
    table {
        font-family: arial, sans-serif;
        border-collapse: collapse;
        width: 100%;
        font-size: .8rem;
    }

    td, th {
        border: 1px solid #ffd000;
        text-align: left;
        padding: 8px;
    }

    th {
        background-color: #ffd000;
    }

    tr:nth-child(even) {
        background-color: #dddddd;
    }

    .page-link {
        color: blue
    }

    .disabled {
        color: black
    }
</style>