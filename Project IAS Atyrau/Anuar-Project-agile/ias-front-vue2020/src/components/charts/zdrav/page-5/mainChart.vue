<template>
  <div class="container-fluid" style="width: 60vw;" v-if="arrRegions.length > 0">
    <div class="row">
            <div class="dropdown offset-11">
            <button style="font-size: .7rem" class="btn btn-primary dropdown-toggle" type="button" id="dropdownMenuButton" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                {{ htmlYears }}
            </button>
            <div class="dropdown-menu" aria-labelledby="dropdownMenuButton">
                <a style="font-size: .7rem" @click="viewYear(i.year)" v-for="i in arrYears" :key="i.year" class="dropdown-item">{{ i.year }}</a>
            </div>
            </div>
    </div>
        <div class="row">
            <div class="col-4" v-if="arrRegions.length > 0">
                <FertilityRegion
                :height="300"
                :chartData="arrRegions"
                :chartColors="regionsChartColors"
                label="УКОМПЛЕКТОВАННОСТЬ ВРАЧАМИ (%)"
                />
            </div>
            <div class="col-4" v-if="arrRegions.length > 0">
                <RegionMortality
                :height="300"
                :chartData="arrRegions"
                :chartColors="regionsChartColors"
                label="ЧИСЛЕННОСТЬ ВРАЧЕЙ"
                />
            </div>
            <div class="col-4" v-if="arrRegions.length > 0">
                <PopulationRegion
                :height="300"
                :chartData="arrRegions"
                :chartColors="regionsChartColors"
                label="ЧИСЛЕННОСТЬ СРЕДНЕГО МЕДПЕРСОНАЛА"
                />
            </div>
            <div class="row col-12">
                <!-- <button  v-for="item in arrRegions" :key="item.region">{{ item.region }}</button> -->
            <div class="dropdown  offset-11">
            <button style="font-size: .7rem" class="btn btn-primary dropdown-toggle" type="button" id="dropdownMenuButton" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                {{ htmlRegions }}
            </button>
            <div class="dropdown-menu" aria-labelledby="dropdownMenuButton">
                <a style="font-size: .7rem" v-for="i in arrRegions" :key="i.region" @click="viewRegion(i)" class="dropdown-item">{{ i.region === '' ? i.area : i.region }}</a>
            </div>
            </div>
            </div>
            <div style="width: 55vw" class="d-flex tab-pane fade show active" id="All" role="tabpanel" aria-labelledby="nav-home-tabs">
                <div class="col-4" v-if="arrYears.length > 0">
                    <FertilityYear
                    :height="300"
                    :chartData="arrYears"
                    :chartColors="regionsChartColors"
                    label="(%)"
                    />
                </div>
                <div class="col-4" v-if="arrYears.length > 0">
                    <MortalityYears
                    :height="300"
                    :chartData="arrYears"
                    :chartColors="regionsChartColors"
                    label="ЧЕЛОВЕК"
                    />
                </div>
                <div class="col-4" v-if="arrYears.length > 0">
                    <PopulationYears
                    :height="300"
                    :chartData="arrYears"
                    :chartColors="regionsChartColors"
                    label="ЧЕЛОВЕК"
                    />
                </div>
            </div>
        </div>
        <ul class="pagination pagination-sm offset-4">
            <v-card class="page-link" to="1">1</v-card>
            <v-card class="page-link" to="2">2</v-card>
            <v-card class="page-link" to="3">3</v-card>
            <v-card class="page-link" to="4">4</v-card>
            <v-card class="page-link disabled" to="5">5</v-card>
            <v-card class="page-link" to="6">6</v-card>
        </ul>
  </div>
</template>

<script>
import axios from "axios";

import RegionMortality from "./RegionMortality";
import MortalityYears from "./MortalityYears";

import FertilityRegion from "./FertilityRegion";
import FertilityYear from "./FertilityYears";

import PopulationRegion from "./PopulationRegion";
import PopulationYears from "./PopulationYears";

export default {
  components: {
    RegionMortality,
    MortalityYears,
    FertilityRegion,
    FertilityYear,
    PopulationRegion,
    PopulationYears
  },
  data() {
    return {
      arrRegions: [],
      regionsChartColors: {
        borderColor: "#077187",
        pointBorderColor: "#0E1428",
        pointBackgroundColor: "#AFD6AC",
        backgroundColor: "rgb(1, 184, 170)",
        pointHitRadius: 10
      },
      arrYears: [],
      arrExpectancy: [],
      htmlYears: '2016',
      htmlRegions: 'Атырауская область'
    };
  },
  methods: {
    viewRegion(i) {
        // console.log(i.region)
        this.htmlRegions = i.region == '' ? i.area : i.region
        axios.get('http://localhost:8070/api/statistics/zdrav-kpi/personnel', {
            params: {
                region: i.region
            }
        }).then(d => {
            this.arrYears = d.data
            }).catch(err => console.log(err));
        // console.log(test)
        // console.log(this.arrYears)
    },
    viewYear(year) {
        // console.log(year)
        this.htmlYears = year
        axios.get('http://localhost:8070/api/statistics/zdrav-kpi/personnel', {
            params: {
                year: year
            }
        }).then(d => {
            this.arrRegions = d.data
            }).catch(err => console.log(err));
        // console.log(test)
        // console.log(this.arrRegions)
    }
  },
  created() {
    axios.all([
        axios.get('http://localhost:8070/api/statistics/zdrav-kpi/personnel', {
            params: {
                year: '2016'
            }
        }),
        axios.get('http://localhost:8070/api/statistics/zdrav-kpi/personnel', {
            params: {
                region: ''
            }
        })
      ])
    .then(axios.spread((arrRegions, arrYears) => {
        this.arrRegions = arrRegions.data
        this.arrYears = arrYears.data
        // this.arrExpectancy = arrExpectancy.data
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