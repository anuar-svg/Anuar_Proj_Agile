<template>
  <div class="container-fluid" style="width: 60vw;" v-if="htmlYears.length > 0">
    <h5 class="text-center">Сведения о трудоустройстве безработных и направлении на профессиональное обучение</h5>
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
            <div class="col-12 d-flex">
                <div class="col-4">
                    <HorizontalBar
                    :height="350"
                    :chartData="Object.values(this.numberOfPersonnel)"
                    :chartLabels="Object.keys(this.numberOfPersonnel)"
                    :chartColors="regionsChartColors"
                    label="КОЛ-ВО КАДРОВ, человек"
                    />
                </div>
                <div class="col-4">
                    <HorizontalBar
                    :height="350"
                    :chartData="Object.values(this.needForPersonnel)"
                    :chartLabels="Object.keys(this.needForPersonnel)"
                    :chartColors="regionsChartColors"
                    label="ПОТРЕБНОСТЬ КАДРОВ, человек"
                    />
                </div>
                <div class="col-4">
                    <HorizontalBar
                    :height="350"
                    :chartData="Object.values(this.needForPersonnel)"
                    :chartLabels="Object.keys(this.needForPersonnel)"
                    :chartColors="regionsChartColors"
                    label="ПОТРЕБНОСТЬ КАДРОВ, человек"
                    />
                </div>
            </div>
            <div class="row">
                <div class="col-5 offset-1">
                    <BarChart
                    :height="260"
                    :chartData="Object.values(this.numberOfAcceptedStudents)"
                    :chartLabels="Object.keys(this.numberOfAcceptedStudents)"
                    :chartColors="regionsChartColors"
                    label="ПРИНЯТЫЕ СТУДЕНТЫ, человек"
                    />
                </div>
                <div class="col-5">
                    <BarChart
                    :height="260"
                    :chartData="Object.values(this.numberOfGraduates)"
                    :chartLabels="Object.keys(this.numberOfGraduates)"
                    :chartColors="regionsChartColors"
                    label="ВЫПУСКНИКИ, человек"
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
            <v-card class="page-link" to="6">6</v-card>
            <v-card class="page-link" to="7">7</v-card>
            <v-card class="page-link disabled" to="8">8</v-card>
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
      numberOfPersonnel: {},
      needForPersonnel: {},
      numberOfAcceptedStudents: {},
      numberOfGraduates: {},
      numberOfDesignCapacity: {}
    };
  },
  methods: {
    updateStatistics(arrRegions) {
        this.numberOfPersonnel = {}
        this.needForPersonnel = {}
        this.numberOfAcceptedStudents = {}
        this.numberOfGraduates = {}
        this.numberOfDesignCapacity = {}

        arrRegions.data.map(d => {
            if (d.region in this.numberOfPersonnel) {
                this.numberOfPersonnel[d.region] += d.numberOfPersonnel
            } else {
                this.numberOfPersonnel[d.region] = d.numberOfPersonnel
            }

            if (d.region in this.needForPersonnel) {
                this.needForPersonnel[d.region] += d.needForPersonnel
            } else {
                this.needForPersonnel[d.region] = d.needForPersonnel
            }
            
            if (d.region in this.numberOfAcceptedStudents) {
                this.numberOfAcceptedStudents[d.region] += d.numberOfAcceptedStudents
            } else {
                this.numberOfAcceptedStudents[d.region] = d.numberOfAcceptedStudents
            }
            
            if (d.region in this.numberOfGraduates) {
                this.numberOfGraduates[d.region] += d.numberOfGraduates
            } else {
                this.numberOfGraduates[d.region] = d.numberOfGraduates
            }
            
            if (d.region in this.numberOfDesignCapacity) {
                this.numberOfDesignCapacity[d.region] += d.numberOfDesignCapacity
            } else {
                this.numberOfDesignCapacity[d.region] = d.numberOfDesignCapacity
            }
        })
    },
    viewYear(year) {
        this.htmlYears = year
        axios.get('http://localhost:8070/api/statistics/edu/colleges', {
            params: {
                year: year
            }
        }).then(d => {
            this.updateStatistics(d)
        }).catch(err => console.log(err));
    }
  },
  created() {
    axios.get('http://localhost:8070/api/statistics/edu/colleges', {
        params: {
            year: '2018-2019'
        }
    })
    .then((arrRegions) => {
        this.updateStatistics(arrRegions)
    })
    .catch(error => console.log(error))

    axios.get('http://localhost:8070/api/statistics/edu/colleges/years')
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