<template>
  <div class="container-fluid" style="width: 60vw;" v-if="regions.length > 0">
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
                        <div  v-for="i in htmlRegions" @click="viewRegion(i)">
                            <input type="checkbox" :checked="i == checkBoxValue"> {{ i }}
                        </div>
                    </div>
                    <div class="col" style="overflow: scroll; max-height: 25vh">
                        <div  v-for="i in districts" @click="viewDistrict(i)">
                            <button class="btn btn-primary" style="font-size: .7rem; margin-top: 5px; width: 100%;">
                                {{ i }}
                            </button>
                        </div>
                    </div>
                </div>
                <div class="row">
                    <div class="col" style="overflow: scroll; max-height: 25vh">
                        <div  v-for="i in kindergartens" @click="viewKindergarten(i)">
                            <button class="btn btn-primary" style="font-size: .7rem; margin-top: 5px; width: 100%;">
                                {{ i }}
                            </button>
                        </div>
                    </div>
                </div>
            </div>
            <div class="col-5" v-if="regions.length > 0">
                <BarChart
                :chartData="numberOfChildren"
                :chartLabels="htmlRegions"
                :chartColors="regionsChartColors"
                label="КОЛ-ВО ДЕТЕЙ В ДДО, человек"
                />
            </div>
        </div>
        <div class="row">
            <div class="col-12 d-flex">
                <div class="col-4" v-if="regions.length > 0">
                    <HorizontalBar
                    :chartData="numberOfKindergartens"
                    :chartLabels="htmlRegions"
                    :chartColors="regionsChartColors"
                    label="КОЛ-ВО САДИКОВ, ЕДИНИЦ"
                    />
                </div>
                <div class="col-4" v-if="regions.length > 0">
                    <HorizontalBar
                    :chartData="numberOfPlaces"
                    :chartLabels="htmlRegions"
                    :chartColors="regionsChartColors"
                    label="КОЛ-ВО МЕСТ В ДДО, человек"
                    />
                </div>
                <div class="col-4" v-if="regions.length > 0">
                    <HorizontalBar
                    :chartData="numberOfWaiters"
                    :chartLabels="htmlRegions"
                    :chartColors="regionsChartColors"
                    label="КОЛ-ВО ОЧЕРЕДНИКОВ, человек"
                    />
                </div>
            </div>
        </div>
        <ul class="pagination pagination-sm offset-4">
            <v-card class="page-link" to="1">1</v-card>
            <v-card class="page-link disabled" to="2">2</v-card>
            <v-card class="page-link" to="3">3</v-card>
            <v-card class="page-link" to="4">4</v-card>
            <v-card class="page-link" to="5">5</v-card>
            <v-card class="page-link" to="6">6</v-card>
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
        backgroundColor: "orange",
        pointHitRadius: 10
      },
      page: 1,
      htmlYears: '2018',
      htmlRegions: [''],
      htmlDistrict: '',
      htmlKindergarten: '',
      regions: [],
      years: [2016, 2017, 2018],
      kindergartens: [],
      numberOfKindergartens: [],
      numberOfChildren: [],
      numberOfWaiters: [],
      numberOfPlaces: [],
      districts: [],
      checkBoxValue: ''
    };
  },
  methods: {
    updateStatistics(arrRegions) {
        this.numberOfChildren = arrRegions.data.map(d => d.numberOfChildren)
        // this.numberOfWaiters = arrRegions.data.map(d => d.numberOfWaiters)
        this.numberOfPlaces = arrRegions.data.map(d => d.numberOfPlaces)

        this.districts = [];
        this.kindergartens = [];

        arrRegions.data.map(d => {
                for (let a of d.districts) {
                    this.districts.push(a)
                }
            })
        arrRegions.data.map(d => {
                for (let a of d.kindergartens) {
                    this.kindergartens.push(a)
                }
            })
    },
    viewRegion(i) {
        this.checkBoxValue = i
        axios.get('http://localhost:8070/api/statistics/edu/preschool-organizations', {
            params: {
                region: i,
                year: this.htmlYears
            }
        }).then(d => {
            if(this.htmlRegions.length == 1 && this.htmlRegions[0] == i) {
                this.checkBoxValue = ''
                this.htmlRegions = this.regions
                this.viewYear(this.htmlYears)   
            } else {
                this.htmlRegions = [i]
                this.updateStatistics(d)
            }
        }).catch(err => console.log(err));
    },
    viewDistrict(i) {
        this.htmlDistrict = i
        axios.get('http://localhost:8070/api/statistics/edu/preschool-organizations', {
            params: {
                district: i,
                year: this.htmlYears
            }
        }).then(d => {
        this.htmlRegions = [d.data[0].region]
        this.checkBoxValue = this.htmlRegions
        this.numberOfChildren = d.data.map(a => a.numberOfChildren)
        // this.numberOfWaiters = d.data.map(a => a.numberOfWaiters)
        this.numberOfPlaces = d.data.map(a => a.numberOfPlaces)

        this.kindergartens = [];

        // this.htmlRegions = d.data.region
        
        d.data.map(k => {
                for (let a of k.kindergartens) {
                    this.kindergartens.push(a)
                }
            })

        this.numberOfKindergartens = [this.kindergartens.length]
        }).catch(err => console.log(err));
    },
    viewYear(year) {
        this.htmlYears = year
        axios.get('http://localhost:8070/api/statistics/edu/preschool-organizations', {
            params: {
                year: this.htmlYears
            }
        }).then(d => {
            this.numberOfWaiters = d.data.map(a => a.numberOfWaiters)
            this.updateStatistics(d)

        }).catch(err => console.log(err));
    },
    viewKindergarten(kindergarten) {
        axios.get('http://localhost:8070/api/statistics/edu/preschool-organizations', {
            params: {
                year: this.htmlYears,
                kindergarten: kindergarten
            }
        }).then(d => {
            this.htmlRegions = [d.data[0].region]
            this.checkBoxValue = this.htmlRegions
            // this.htmlDistrict = d.data.districts[0]
            
            this.numberOfChildren = d.data.map(a => a.numberOfChildren)
            // this.numberOfWaiters = d.data.map(a => a.numberOfWaiters)
            this.numberOfPlaces = d.data.map(a => a.numberOfPlaces)
        }).catch(err => console.log(err));
    }
  },
  created() {
    axios.get('http://localhost:8070/api/statistics/edu/preschool-organizations/years')
        .then(d => this.years = d.data)
        .catch(err => console.log(err))

    axios.get('http://localhost:8070/api/statistics/edu/preschool-organizations', {
        params: {
            year: this.htmlYears
        }
    })
    .then((arrRegions) => {
        this.regions = arrRegions.data.map(d => d.region)
        this.htmlRegions = this.regions

        this.numberOfChildren = arrRegions.data.map(d => d.numberOfChildren)
        this.numberOfWaiters = arrRegions.data.map(d => d.numberOfWaiters)
        this.numberOfPlaces = arrRegions.data.map(d => d.numberOfPlaces)

        this.districts = [];
        this.kindergartens = [];

        arrRegions.data.map(d => {
                for (let a of d.districts) {
                    this.districts.push(a)
                }
            })
        arrRegions.data.map(d => {
                for (let a of d.kindergartens) {
                    this.kindergartens.push(a)
                    this.numberOfKindergartens.push(a.length)
                }
            })
    })
    .catch(error => console.log(error))

  }
};
</script>

<style scoped>
    .page-link {
        color: blue;
    }

    .disabled {
        color: black;
    }
</style>