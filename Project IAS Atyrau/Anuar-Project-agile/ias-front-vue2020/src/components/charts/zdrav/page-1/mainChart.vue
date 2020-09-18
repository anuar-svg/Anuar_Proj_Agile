<template>
  <div class="container-fluid" style="width: 60vw;" v-if="regions.length > 0">
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
            <div class="col-4" v-if="regions.length > 0">
                <HorizontalBar
                :height="300"
                :chartData="fertilityByRegions"
                :chartLabels="regions"
                :chartColors="regionsChartColors"
                label="РОЖДАЕМОСТЬ (на 1тыс)"
                />
            </div>
            <div class="col-4" v-if="regions.length > 0">
                <HorizontalBar
                :height="300"
                :chartData="mortalityByRegions"
                :chartLabels="regions"
                :chartColors="regionsChartColors"
                label="ОБЩИЙ УРОВЕНЬ СМЕРТНОСТИ (на 1тыс)"
                />
            </div>
            <div class="col-4" v-if="regions.length > 0">
                <HorizontalBar
                :height="300"
                :chartData="popGrowthByRegions"
                :chartLabels="regions"
                :chartColors="regionsChartColors"
                label="ПРИРОСТ НАСЕЛЕНИЯ"
                />
            </div>
            <div class="row col-12">
            <div class="dropdown  offset-11">
                <button style="font-size: .7rem" class="btn btn-primary dropdown-toggle" type="button" id="dropdownMenuButton" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                    {{ htmlRegions }}
                </button>
                <div class="dropdown-menu" aria-labelledby="dropdownMenuButton">
                    <a style="font-size: .7rem" v-for="i in regions" :key="i" @click="viewRegion(i)" class="dropdown-item">{{ i === '' ? 'Атырауская область' : i }}</a>
                </div>
            </div>
            </div>
            <div style="width: 55vw" class="d-flex tab-pane fade show active" id="All" role="tabpanel" aria-labelledby="nav-home-tabs">
                <div class="col-4" v-if="regions.length > 0">
                    <Line-chart
                    :height="300"
                    :chartData="fertilityByYears"
                    :chartLabels="years"
                    :chartColors="regionsChartColors"
                    label="РОЖДАЕМОСТЬ(на 1к)"
                    />
                </div>
                <div class="col-4" v-if="regions.length > 0">
                    <Line-chart
                    :height="300"
                    :chartData="mortalityByYears"
                    :chartLabels="years"
                    :chartColors="regionsChartColors"
                    label="ОБЩИЙ УРОВЕНЬ СМЕРТНОСТИ"
                    />
                </div>
                <div class="col-4" v-if="regions.length > 0">
                    <Line-chart
                    :height="300"
                    :chartData="popGrowthByYears"
                    :chartLabels="years"
                    :chartColors="regionsChartColors"
                    label="ПРИРОСТ НАСЕЛЕНИЯ"
                    />
                </div>
            </div>
        </div>
        <div class="row" v-if="years.length > 0" >
            <div class="col-12">
                <Line-chart
                :height="100"
                :chartData="lifeExpectancy"
                :chartLabels="years"
                :chartColors="regionsChartColors"
                label="ОЖИДАЕМАЯ ПРОДОЛЖИТЕЛЬНОСТЬ ЖИЗНИ"
                />
            </div>
        </div>
        <ul class="pagination pagination-sm offset-4">
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

import LineChart from "./Line-chart";

export default {
  components: {
    HorizontalBar,
    LineChart
  },
  data() {
    return {
      regionsChartColors: {
        borderColor: "#077187",
        pointBorderColor: "#0E1428",
        pointBackgroundColor: "#AFD6AC",
        backgroundColor: "rgb(1, 184, 170)",
        pointHitRadius: 10
      },
      page: 1,
      htmlYears: '2016',
      htmlRegions: 'Атырауская область',
      regions: [],
      years: [],
      fertilityByYears: [],
      mortalityByYears: [],
      popGrowthByYears: [],
      lifeExpectancy: [],
      fertilityByRegions: [],
      mortalityByRegions: [],
      popGrowthByRegions: [],
    };
  },
  methods: {
    updateStatistics(arrRegions, arrYears) {
        if (arrRegions) {
            this.regions = arrRegions.data.map(d => d.region)
            // this.lifeExpectancy = arrRegions.data.map(d => d.lifeExpectancy)
            this.fertilityByRegions = arrRegions.data.map(d => d.fertility)
            this.mortalityByRegions = arrRegions.data.map(d => d.overallMortalityRate)
            this.popGrowthByRegions = arrRegions.data.map(d => d.naturalPopulationGrowth)
        }

        if (arrYears) {
            this.years = arrYears.data.map(d => d.year)
            this.lifeExpectancy = arrYears.data.map(d => d.lifeExpectancy)
            this.fertilityByYears = arrYears.data.map(d => d.fertility)
            this.mortalityByYears = arrYears.data.map(d => d.overallMortalityRate)
            this.popGrowthByYears = arrYears.data.map(d => d.naturalPopulationGrowth)
        }
    },
    viewRegion(i) {
        this.htmlRegions = i == '' ? 'Атырауская область' : i
        axios.get('http://localhost:8070/api/statistics/zdrav-kpi/demographics', {
            params: {
                region: i
            }
        }).then(d => {
            this.updateStatistics(null, d)
            }).catch(err => console.log(err));
    },
    viewYear(year) {
        this.htmlYears = year
        axios.get('http://localhost:8070/api/statistics/zdrav-kpi/demographics', {
            params: {
                year: year
            }
        }).then(d => {
            this.updateStatistics(d, null)
            }).catch(err => console.log(err));
    }
  },
  created() {
    axios.all([
        axios.get('http://localhost:8070/api/statistics/zdrav-kpi/demographics', {
            params: {
                year: '2016'
            }
        }),
        axios.get('http://localhost:8070/api/statistics/zdrav-kpi/demographics', {
            params: {
                region: ''
            }
        })
      ])
    .then(axios.spread((arrRegions, arrYears) => {
        this.updateStatistics(arrRegions, arrYears)
    }))
    .catch(error => console.log(error))

    // console.log(this.fertilityByYears)
    // console.log(this.fertilityByRegions)
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