<template>
  <div class="container-fluid" style="width: 60vw;" v-if="htmlYears.length > 0">
    <h5 class="text-center">Иностранная рабочая сила</h5>
    <div class="row">
            <div class="dropdown offset-11">
            <button style="font-size: .7rem" class="btn btn-primary dropdown-toggle" type="button" id="dropdownMenuButton" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                {{ htmlYears }}
            </button>
            <div class="dropdown-menu" aria-labelledby="dropdownMenuButton">
                <a style="font-size: .7rem" @click="viewYear(i)" v-for="i in years" :key="i" class="dropdown-item">{{ i }}</a>
            </div>
            </div>
    </div>
        <div class="row">
            <div class="col-12">
                <HorizontalBar
                :height="100"
                :chartData="Object.values(numberOfSchools)"
                :chartLabels="Object.keys(numberOfSchools)"
                :chartColors="regionsChartColors"
                label="КОЛ-ВО ШКОЛ, ЕДИНИЦ"
                />
            </div>
            <div class="col-12">
                <BarChart
                :height="100"
                :chartData="Object.values(numberOfPlacesInSchool)"
                :chartLabels="Object.keys(numberOfPlacesInSchool)"
                :chartColors="regionsChartColors"
                label="КОЛ-ВО МЕСТ В ШКОЛЕ, единиц"
                />
            </div>
        </div>
        <ul class="pagination pagination-sm offset-4">
            <v-card class="page-link" to="1">1</v-card>
            <v-card class="page-link" to="2">2</v-card>
            <v-card class="page-link" to="3">3</v-card>
            <v-card class="page-link" to="4">4</v-card>
            <v-card class="page-link" to="5">5</v-card>
            <v-card class="page-link" to="6">6</v-card>
            <v-card class="page-link disabled" to="7">7</v-card>
            <v-card class="page-link" to="8">8</v-card>
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
        backgroundColor: "orange",
        pointHitRadius: 10
      },
      page: 1,
      htmlYears: '2018-2019',
      htmlRegions: 'Атырауская область',
      regions: [],
      years: [],
      numberOfSchools: {},
      numberOfPlacesInSchool: {},
      numberOfStudents: {},
      numberOfTeachers: {}
    };
  },
  methods: {
    updateStatistics(arrRegions) {
        this.numberOfSchools = {}
        this.numberOfPlacesInSchool = {}
        this.numberOfStudents = {}
        this.numberOfTeachers = {}

        arrRegions.data.map(d => {

            if (this.numberOfPlacesInSchool[d.region]) {
                this.numberOfPlacesInSchool[d.region] += d.numberOfPlacesInSchool
            } else {
                this.numberOfPlacesInSchool[d.region] = d.numberOfPlacesInSchool
            }

            if (this.numberOfStudents[d.region]) {
                this.numberOfStudents[d.region] += d.numberOfStudents
            } else {
                this.numberOfStudents[d.region] = d.numberOfStudents
            }

            if (this.numberOfTeachers[d.region]) {
                this.numberOfTeachers[d.region] += d.numberOfTeachers
            } else {
                this.numberOfTeachers[d.region] = d.numberOfTeachers
            }

            if (this.numberOfSchools[d.region]) {
                this.numberOfSchools[d.region] += 1
            } else {
                this.numberOfSchools[d.region] = 1
            }
         })
    },
    viewYear(year) {
        this.htmlYears = year
        axios.get('http://localhost:8070/api/statistics/edu/schools', {
            params: {
                year: year
            }
        }).then(d => {
            this.updateStatistics(d)
        }).catch(err => console.log(err));
    }
  },
  created() {
    axios.get('http://localhost:8070/api/statistics/edu/schools', {
        params: {
            year: '2018-2019'
        }
    })
    .then((arrRegions) => {
        this.updateStatistics(arrRegions)
    })
    .catch(error => console.log(error))
    axios.get('http://localhost:8070/api/statistics/edu/schools/years')
    .then((arrRegions) => {
        this.years = arrRegions.data.sort()
    })
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