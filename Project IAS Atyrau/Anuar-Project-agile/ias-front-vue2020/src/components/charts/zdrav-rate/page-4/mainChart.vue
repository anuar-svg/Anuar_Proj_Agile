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
            <div class="col-6">
                <p style="text-align: center; font-size: .7rem">ВИДЫ ПРОФЕССИЙ, человек</p>
                <div style="max-height: 60vh; overflow: scroll; font-size: .8rem">
                <table class="table">
                    <tr style="font-size: .7rem">
                        <th>Район</th>
                        <th>Самостоятельно занятое население</th>
                    </tr>
                    <tr v-for="item in Object.keys(candidates)">
                        <td>{{ item }}</td>
                        <td>{{ candidates[item] }}</td>
                    </tr>
                </table>
                </div>
            </div>
            <div class="col-6">
                <BarChart
                :height="250"
                :chartData="[before5, from5to10, from10to15, after15]"
                :chartLabels="['0-5 лет', '5-10 лет', '10-15 лет', '15+ лет']"
                :chartColors="regionsChartColors"
                label="ДИНАМИК ПОТРЕБНОСТИ СПЕЦИАЛИСТОВ ПО ГОДАМ, человек"/>
                <BarChart
                :height="250"
                :chartData="[before5, from5to10, from10to15, after15]"
                :chartLabels="['0-5 лет', '5-10 лет', '10-15 лет', '15+ лет']"
                :chartColors="regionsChartColors"
                label="ДИНАМИК ПОТРЕБНОСТИ СПЕЦИАЛИСТОВ ПО ГОДАМ, человек"/>
            </div>
        </div>
        <ul class="pagination pagination-sm d-flex justify-center">
            <v-card class="page-link" to="1">1</v-card>
            <v-card class="page-link" to="2">2</v-card>
            <v-card class="page-link" to="3">3</v-card>
            <v-card class="page-link disabled" to="4">4</v-card>
            <v-card class="page-link" to="5">5</v-card>
            <v-card class="page-link" to="6">6</v-card>
            <v-card class="page-link" to="7">7</v-card>
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
      htmlYears: '2018',
      htmlRegions: new Set(),
      years: ['2018'],
      districts: [],
      checkBoxRegion: '0',
      checkBoxDistrict: '0',
      checkBoxSchool: '0',
      candidates: {},
      schools : {},
      numCandidates: 0,
      withHighEducation: 0,
      withCollegeEducation: 0,
      before30: 0,
      from30to39: 0,
      from40to49: 0,
      from50to59: 0,
      after59: 0,
      before5: 0,
      from5to10: 0,
      from10to15: 0,
      after15: 0,
      numberOfTeachers: 0
    };
  },
  methods: {
    updateStatistics(arrRegions) {
        let regions = arrRegions.data.map(d => d.region)
        this.htmlRegions = new Set(regions)
        this.districts = new Set(arrRegions.data.map(d => d.district))
        this.schools = arrRegions.data.map(d => d.name)

        this.numCandidates = 0
        this.withHighEducation = 0
        this.withCollegeEducation = 0
        this.before30 = 0
        this.from30to39 = 0
        this.from40to49 = 0
        this.from50to59 = 0
        this.after59 = 0
        this.before5 = 0
        this.from5to10 = 0
        this.from10to15 = 0
        this.after15 = 0
        this.numberOfTeachers = 0

        arrRegions.data.map(d => {
            this.numCandidates += d.numberOfTeachers
            this.withHighEducation += d.withHighEducation
            this.withCollegeEducation += d.withCollegeEducation
            this.before30 += d.before30
            this.from30to39 += d.from30to39
            this.from40to49 += d.from40to49
            this.from50to59 += d.from50to59
            this.after59 += d.after59
            this.before5 += d.before5
            this.from5to10 += d.from5to10
            this.from10to15 += d.from10to15
            this.after15 += d.after15
            this.numberOfTeachers += d.numberOfTeachers
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
        axios.get('http://localhost:8070/api/statistics/edu/preschool-teachers', {
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
        axios.get('http://localhost:8070/api/statistics/edu/preschool-teachers', {
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
        axios.get('http://localhost:8070/api/statistics/edu/preschool-teachers', {
            params: {
                year: this.htmlYears
            }
        }).then(d => {
            this.updateStatistics(d)
        }).catch(err => console.log(err));
    },
    viewSchool(school) {
        axios.get('http://localhost:8070/api/statistics/edu/preschool-teachers', {
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
    axios.get('http://localhost:8070/api/statistics/edu/preschool-teachers', {
        params: {
            year: this.htmlYears
        }
    })
    .then((arrRegions) => {
        this.updateStatistics(arrRegions)
    })
    .catch(error => console.log(error))

    axios.get('http://localhost:8070/api/statistics/edu/preschool-organizations/years')
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