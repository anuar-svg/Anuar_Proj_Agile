<template>
  <div class="container-fluid" style="width: 60vw;" v-if="htmlYears">
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
                <div class="row">
                    <div class="col" style="overflow: scroll; max-height: 25vh">
                        <div  v-for="i in filterRegions" @click="viewRegion(i)">
                            <input type="checkbox" :checked="i == checkBoxRegion"> {{ i }}
                        </div>
                    </div>
                </div>
                <div class="row">
                    <div class="col" style="overflow: scroll; max-height: 25vh">
                        <div  v-for="i in colleges" @click="viewCollege(i)">
                            <input type="checkbox" :checked="i == checkBoxCollege"> {{ i }}
                        </div>
                    </div>
                </div>
            </div>
            <div class="col-5">
                <BarChart
                :chartData="Object.values(this.numberOfAcceptedStudents)"
                :chartLabels="Object.keys(this.numberOfAcceptedStudents)"
                :chartColors="regionsChartColors"
                label="ПРИНЯТЫЕ СТУДЕНТЫ, человек"
                />
            </div>
        </div>
        <div class="row">
            <div class="col-12 d-flex">
                <div class="col-4">
                    <BarChart
                    :chartData="Object.values(this.numberOfReleasedStudents)"
                    :chartLabels="Object.keys(this.numberOfReleasedStudents)"
                    :chartColors="regionsChartColors"
                    label="КОЛ-ВО КАДРОВ ПО КАТЕГОРИЯМ, человек"
                    />
                </div>
                <div class="col-4">
                    <BarChart
                    :chartData="Object.values(this.numberOfGraduates)"
                    :chartLabels="Object.keys(this.numberOfGraduates)"
                    :chartColors="regionsChartColors"
                    label="КОЛ-ВО КАДРОВ ПО ОБРАЗОВАНИЕ, человек"
                    />
                </div>
                <div class="col-4">
                    <BarChart
                    :chartData="Object.values(this.numberOfDesignCapacity)"
                    :chartLabels="Object.keys(this.numberOfDesignCapacity)"
                    :chartColors="regionsChartColors"
                    label="КОЛ-ВО КАДРОВ ПО ОБРАЗОВАНИЕ, человек"
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
            <v-card class="page-link" to="8">8</v-card>
            <v-card class="page-link" to="9">9</v-card>
            <v-card class="page-link disabled" to="10">10</v-card>
        </ul>
  </div>
</template>

<script>
import axios from "axios";

import BarChart from "./BarChart";

export default {
  components: {
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
      htmlRegions: [''],
      filterRegions: new Set(),
      years: [],
      checkBoxRegion: '',
      checkBoxCollege: '',
      colleges: [],
      numberOfPersonnel: {},
      numberOfReleasedStudents: {},
      numberOfAcceptedStudents: {},
      numberOfGraduates: {},
      numberOfDesignCapacity: {}
    };
  },
  methods: {
    fillData(datas) {
        this.filterRegions = new Set(datas.data.map(d => d.region))
        this.colleges = datas.data.map(d => d.name)

        this.numberOfPersonnel = {}
        this.numberOfReleasedStudents = {}
        this.numberOfAcceptedStudents = {}
        this.numberOfGraduates = {}
        this.numberOfDesignCapacity = {}

        datas.data.map(d => {
            if (d.region in this.numberOfPersonnel) {
                this.numberOfPersonnel[d.region] += d.numberOfPersonnel
            } else {
                this.numberOfPersonnel[d.region] = d.numberOfPersonnel
            }

            if (d.region in this.numberOfReleasedStudents) {
                this.numberOfReleasedStudents[d.region] += d.numberOfReleasedStudents
            } else {
                this.numberOfReleasedStudents[d.region] = d.numberOfReleasedStudents
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
    viewRegion(i) {
        this.currentRegion = i
        if (this.checkBoxRegion == i) {
            this.checkBoxRegion = ''
            this.checkBoxCollege = ''

            axios.get('http://localhost:8070/api/statistics/edu/colleges', {
                params: {
                    year: this.htmlYears
                }
            })
            .then((arrRegions) => {
                this.fillData(arrRegions)
                this.colleges = arrRegions.data.map(a => a.name)
            })
            .catch(error => console.log(error))
        } else {
            this.checkBoxRegion = i
            axios.get('http://localhost:8070/api/statistics/edu/colleges', {
                params: {
                    region: i,
                    year: this.htmlYears
                }
            }).then(d => {
                this.fillData(d)
                this.colleges = d.data.map(a => a.name)
            }).catch(err => console.log(err));
        }
    },
    viewCollege(college){
        if (college == this.checkBoxCollege) {
            this.checkBoxCollege = ''
            this.checkBoxRegion = ''
            axios.get('http://localhost:8070/api/statistics/edu/colleges', {
                params: {
                    year: this.htmlYears
                }
            })
            .then((arrRegions) => {
                this.fillData(arrRegions)
            })
            .catch(error => console.log(error))
        } else {
            this.checkBoxCollege = college
            axios.get('http://localhost:8070/api/statistics/edu/colleges', {
                params: {
                    year: this.htmlYears,
                    name: college
                }
            }).then(d => {
                this.fillData(d)
                // this.filterRegions = new Set(d.data.map(d => d.region))
                this.checkBoxRegion = d.data[0].region
            }).catch(err => console.log(err));
        }
    },
    viewYear(year) {
        this.htmlYears = year
        axios.get('http://localhost:8070/api/statistics/edu/colleges', {
            params: {
                year: this.htmlYears
            }
        }).then(d => {
                this.currentRegion = ''
                this.checkBoxRegion = ''
                this.checkBoxCollege = ''
                this.fillData(d)
        }).catch(err => console.log(err));
    },
  },
  created() {
    axios.get('http://localhost:8070/api/statistics/edu/colleges/years')
    .then((arrRegions) => {
        this.years = arrRegions.data.sort()
    })
    .catch(error => console.log(error))

    axios.get('http://localhost:8070/api/statistics/edu/colleges', {
        params: {
            year: this.htmlYears
        }
    })
    .then((arrRegions) => {
        this.fillData(arrRegions)
    })
    .catch(error => console.log(error))
  }
};
</script>

<style scoped>
    .page-link {
        color: blue
    }

    .disabled {
        color: black
    }
</style>