<template>
  <div class="container-fluid" style="width: 60vw;" v-if="regions.length > 0">
    <div class="row d-flex">
            <div class="dropdown col-1">
                <button style="font-size: .7rem" class="btn btn-primary dropdown-toggle" type="button" id="dropdownMenuButton" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                    {{ htmlYears }}
                </button>
                <div class="dropdown-menu" aria-labelledby="dropdownMenuButton">
                    <a style="font-size: .7rem" @click="viewYear(i)" v-for="i in years" :key="i" class="dropdown-item">{{ i }}</a>
                </div>
            </div>
            <div class="dropdown col-1">
                <button style="font-size: .7rem" class="btn btn-primary dropdown-toggle" type="button" id="dropdownMenuButton" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                    {{ htmlRegions }}
                </button>
                <div class="dropdown-menu" aria-labelledby="dropdownMenuButton">
                    <a style="font-size: .7rem" v-for="i in regions" :key="i" @click="viewRegion(i)" class="dropdown-item">{{ i === '' ? 'Атырауская область' : i }}</a>
                </div>
            </div>
    </div>
        <div class="row">
            <div class="col-12" v-if="regions.length > 0">
                <BarChart
                :height="100"
                :chartData="numberOfPersonnel"
                :chartLabels="regions"
                :chartColors="regionsChartColors"
                label="КОЛ-ВО КАДРОВ В ДДО, человек"
                />
            </div>
        </div>
        <div class="row">
            <div class="col-6" v-if="regions.length > 0">
                <HorizontalBar
                :height="200"
                :chartData="numberOfChildren"
                :chartLabels="regions"
                :chartColors="regionsChartColors"
                label="КОЛ-ВО ДЕТЕЙ В ДДО, человек"
                />
            </div>
            <div class="col-6" v-if="regions.length > 0">
                <HorizontalBar
                :height="200"
                :chartData="numberOfChildren"
                :chartLabels="regions"
                :chartColors="regionsChartColors"
                label="КОЛ-ВО ДЕТЕЙ В ДДО, человек"
                />
            </div>
        </div>
            
        <ul class="pagination pagination-sm d-flex justify-center">
            <v-card class="page-link" to="1">1</v-card>
            <v-card class="page-link" to="2">2</v-card>
            <v-card class="page-link" to="3">3</v-card>
            <v-card class="page-link" to="4">4</v-card>
            <v-card class="page-link" to="5">5</v-card>
            <v-card class="page-link disabled" to="6">6</v-card>
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
      htmlRegions: 'Атырауская область',
      regions: [],
      years: [2016, 2017, 2018],
      numberOFKindergartens: [],
      numberOfChildren: [],
      numberOfPersonnel: [],
      numberOfPlaces: [],
    };
  },
  methods: {
    updateStatistics(arrRegions) {
        this.regions = arrRegions.data.map(d => d.region)
        this.numberOFKindergartens = arrRegions.data.map(d => d.kindergartens.length)
        this.numberOfChildren = arrRegions.data.map(d => d.numberOfChildren)
        this.numberOfPersonnel = arrRegions.data.map(d => d.numberOfPersonnel)
        this.numberOfPlaces = arrRegions.data.map(d => d.numberOfPlaces)
        console.log(this.kindergartens)
    },
    viewYear(year) {
        this.htmlYears = year
        axios.get('http://localhost:8070/api/statistics/edu/preschool-organizations', {
            params: {
                year: year
            }
        }).then(d => {
            this.updateStatistics(d)
        }).catch(err => console.log(err));
    }
  },
  created() {
    axios.get('http://localhost:8070/api/statistics/edu/preschool-organizations', {
        params: {
            year: '2018'
        }
    })
    .then((arrRegions) => {
        this.updateStatistics(arrRegions)
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