<template>
  <div class="container-fluid" style="width: 60vw;" v-if="htmlRegions.length > 0">
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
                <HorizontalBar
                :chartData="Object.values(this.numberOfPersonnel)"
                :chartLabels="Object.keys(this.numberOfPersonnel)"
                :chartColors="regionsChartColors"
                label="КОЛ-ВО КАДРОВ, человек"
                />
            </div>
        </div>
        <div class="row">
            <div class="col-12 d-flex">
                <div class="col-6">
                    <BarChart
                    :height="250"
                    :chartData="[highestCategory, firstCategory, secondCategory, 
                                    magistracy, doctorOfTechnicalSciences, withoutCategory]"
                    :chartLabels="['Высшая категория', 'Первая категория', 'Вторая категория', 
                                    'Магистр', 'Доктор технических наук', 'Без категорий']"
                    :chartColors="regionsChartColors"
                    label="КОЛ-ВО КАДРОВ ПО КАТЕГОРИЯМ, человек"
                    />
                </div>
                <div class="col-6">
                    <BarChart
                    :height="250"
                    :chartData="[withHighEducation, withGeneralSecondaryEducation, withCollegeEducation]"
                    :chartLabels="['Имеет высшее образование', 'Общее среднее образование', 'ССУЗ']"
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
            <v-card class="page-link disabled" to="9">9</v-card>
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
        backgroundColor: "orange",
        pointHitRadius: 10
      },
      page: 1,
      htmlYears: '2017-2018',
      htmlRegions: [''],
      filterRegions: new Set(),
      years: [],
      checkBoxRegion: '',
      checkBoxCollege: '',
      firstCategory: 0,
      secondCategory: 0,
      highestCategory: 0,
      magistracy: 0,
      doctorOfTechnicalSciences: 0,
      withoutCategory: 0,
      withHighEducation: 0,
      withGeneralSecondaryEducation: 0,
      withCollegeEducation: 0,
      colleges: [],
      currentRegion: '',
      numberOfPersonnel: {}
    };
  },
  methods: {
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

                this.firstCategory = 0
                this.secondCategory = 0
                this.highestCategory = 0
                this.magistracy = 0
                this.doctorOfTechnicalSciences = 0
                this.withoutCategory = 0
                this.withHighEducation = 0
                this.withGeneralSecondaryEducation = 0
                this.withCollegeEducation = 0

                this.filterRegions = new Set(arrRegions.data.map(d => d.region))
                arrRegions.data.map(d => this.firstCategory += d.firstCategory)
                arrRegions.data.map(d => this.secondCategory += d.secondCategory)
                arrRegions.data.map(d => this.highestCategory += d.highestCategory)
                arrRegions.data.map(d => this.magistracy += d.magistracy)
                arrRegions.data.map(d => this.doctorOfTechnicalSciences += d.doctorOfTechnicalSciences)
                arrRegions.data.map(d => this.withoutCategory += d.withoutCategory)
                
                arrRegions.data.map(d => this.withHighEducation += d.withHighEducation)
                arrRegions.data.map(d => this.withGeneralSecondaryEducation += d.withGeneralSecondaryEducation)
                arrRegions.data.map(d => this.withCollegeEducation += d.withCollegeEducation)
          
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

                this.filterRegions = [d.data[0].region]
                
                this.firstCategory = 0
                this.secondCategory = 0
                this.highestCategory = 0
                this.magistracy = 0
                this.doctorOfTechnicalSciences = 0
                this.withoutCategory = 0
                this.withHighEducation = 0
                this.withGeneralSecondaryEducation = 0
                this.withCollegeEducation = 0

                d.data.map(a => this.firstCategory += a.firstCategory)
                d.data.map(a => this.secondCategory += a.secondCategory)
                d.data.map(a => this.highestCategory += a.highestCategory)
                d.data.map(a => this.magistracy += a.magistracy)
                d.data.map(a => this.doctorOfTechnicalSciences += a.doctorOfTechnicalSciences)
                d.data.map(a => this.withoutCategory += a.withoutCategory)

                d.data.map(a => this.withHighEducation += a.withHighEducation)
                d.data.map(a => this.withGeneralSecondaryEducation += a.withGeneralSecondaryEducation)
                d.data.map(a => this.withCollegeEducation += a.withCollegeEducation)


                this.colleges = d.data.map(a => a.name)
            }).catch(err => console.log(err));
        }
    },
    viewCollege(college){
        if (college == this.checkBoxCollege) {
            this.checkBoxCollege = ''

            axios.get('http://localhost:8070/api/statistics/edu/colleges', {
                params: {
                    year: this.htmlYears
                }
            })
            .then((arrRegions) => {
                this.firstCategory = 0
                this.secondCategory = 0
                this.highestCategory = 0
                this.magistracy = 0
                this.doctorOfTechnicalSciences = 0
                this.withoutCategory = 0
                this.withHighEducation = 0
                this.withGeneralSecondaryEducation = 0
                this.withCollegeEducation = 0

                this.checkBoxRegion = ''
                this.filterRegions = new Set(arrRegions.data.map(d => d.region))
                arrRegions.data.map(d => this.firstCategory += d.firstCategory)
                arrRegions.data.map(d => this.secondCategory += d.secondCategory)
                arrRegions.data.map(d => this.highestCategory += d.highestCategory)
                arrRegions.data.map(d => this.magistracy += d.magistracy)
                arrRegions.data.map(d => this.doctorOfTechnicalSciences += d.doctorOfTechnicalSciences)
                arrRegions.data.map(d => this.withoutCategory += d.withoutCategory)

                arrRegions.data.map(d => this.withHighEducation += d.withHighEducation)
                arrRegions.data.map(d => this.withGeneralSecondaryEducation += d.withGeneralSecondaryEducation)
                arrRegions.data.map(d => this.withCollegeEducation += d.withCollegeEducation)
            })
            .catch(error => console.log(error))
        } else {
            this.checkBoxCollege = college
            axios.get('http://localhost:8070/api/statistics/edu/colleges', {
                params: {
                    year: this.htmlYears,
                    name: this.checkBoxCollege
                }
            }).then(d => {
                this.filterRegions = [d.data[0].region]
                this.checkBoxRegion = this.filterRegions
                    
                this.firstCategory = 0
                this.secondCategory = 0
                this.highestCategory = 0
                this.magistracy = 0
                this.doctorOfTechnicalSciences = 0
                this.withoutCategory = 0
                this.withHighEducation = 0
                this.withGeneralSecondaryEducation = 0
                this.withCollegeEducation = 0

                d.data.map(a => this.firstCategory += a.firstCategory)
                d.data.map(a => this.secondCategory += a.secondCategory)
                d.data.map(a => this.highestCategory += a.highestCategory)
                d.data.map(a => this.magistracy += a.magistracy)
                d.data.map(a => this.doctorOfTechnicalSciences += a.doctorOfTechnicalSciences)
                d.data.map(a => this.withoutCategory += a.withoutCategory)

                d.data.map(a => this.withHighEducation += a.withHighEducation)
                d.data.map(a => this.withGeneralSecondaryEducation += a.withGeneralSecondaryEducation)
                d.data.map(a => this.withCollegeEducation += a.withCollegeEducation)
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
                this.checkBoxCollege = ''
                this.checkBoxRegion = ''
                
                this.viewRegion(this.currentRegion)

                this.numberOfPersonnel = {}
                d.data.map(d => {
                    if (d.region in this.numberOfPersonnel) {
                        this.numberOfPersonnel[d.region] += d.numberOfPersonnel
                    } else {
                        this.numberOfPersonnel[d.region] = d.numberOfPersonnel
                    }
                })
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
        this.htmlRegions = arrRegions.data.map(d => d.region)
        this.filterRegions = new Set(arrRegions.data.map(d => d.region))
        this.colleges = arrRegions.data.map(e => e.name)
        arrRegions.data.map(d => {
            if (d.region in this.numberOfPersonnel) {
                 this.numberOfPersonnel[d.region] += d.numberOfPersonnel
            } else {
                 this.numberOfPersonnel[d.region] = d.numberOfPersonnel
            }
        })
        
        this.firstCategory = 0
        this.secondCategory = 0
        this.highestCategory = 0
        this.magistracy = 0
        this.doctorOfTechnicalSciences = 0
        this.withoutCategory = 0
        this.withHighEducation = 0
        this.withGeneralSecondaryEducation = 0
        this.withCollegeEducation = 0

        arrRegions.data.map(d => this.firstCategory += d.firstCategory)
        arrRegions.data.map(d => this.secondCategory += d.secondCategory)
        arrRegions.data.map(d => this.highestCategory += d.highestCategory)
        arrRegions.data.map(d => this.magistracy += d.magistracy)
        arrRegions.data.map(d => this.doctorOfTechnicalSciences += d.doctorOfTechnicalSciences)
        arrRegions.data.map(d => this.withoutCategory += d.withoutCategory)

        arrRegions.data.map(d => this.withHighEducation += d.withHighEducation)
        arrRegions.data.map(d => this.withGeneralSecondaryEducation += d.withGeneralSecondaryEducation)
        arrRegions.data.map(d => this.withCollegeEducation += d.withCollegeEducation)
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