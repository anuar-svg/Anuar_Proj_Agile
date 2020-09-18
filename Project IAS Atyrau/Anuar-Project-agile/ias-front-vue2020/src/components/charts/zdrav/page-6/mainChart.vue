<template>
  <div class="container-fluid" style="width: 60vw;" v-if="regions.length > 0">
        <div class="row col-12">
            <div class="dropdown col-3">
            <button style="font-size: .7rem" class="btn btn-primary dropdown-toggle" type="button" id="dropdownMenuButton" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                {{ htmlYears }}
            </button>
            <div class="dropdown-menu" aria-labelledby="dropdownMenuButton">
                <a style="font-size: .7rem" @click="viewYear(i)" v-for="i in years" :key="i" class="dropdown-item">{{ i }}</a>
            </div>
            </div>
            <div class="dropdown col-3 offset-6">
            <button style="font-size: .7rem" class="btn btn-primary dropdown-toggle" type="button" id="dropdownMenuButton" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                {{ htmlRegions }}
            </button>
            <div class="dropdown-menu" aria-labelledby="dropdownMenuButton">
                <a style="font-size: .7rem" v-for="i in regions" :key="i" @click="viewRegion(i)" class="dropdown-item">{{ i == '' ? '-' : i }}</a>
            </div>
        </div>
        </div>
        <div class="row">
            <div class="col-6" v-if="regions.length > 0">
                <PieChart
                :chartData="[averageMedProvision[htmlYears], doctorsProvision[htmlYears]]"
                :chartLabels="provisionLabels"
                :chartColors="regionsChartColors"
                />
            </div>
            <div class="col-6" v-if="regions.length > 0">
                <PieChartDoc
                :chartData="[heldPositions[htmlYears], staffPositions[htmlYears]]"
                :chartLabels="positionsLabels"
                :chartColors="regionsChartColors"
                />
            </div>
        </div>
        <ul class="pagination pagination-sm offset-4">
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

import PieChart from "./PieChart";

import PieChartDoc from "./PieChartDoc";

export default {
  components: {
    PieChart,
    PieChartDoc
  },
  data() {
    return {
      regionsChartColors: {
        borderColor: "#2ab7ca",
        backgroundColor: "rgb(1, 184, 170)",
        pointHitRadius: 10
      },
      htmlYears: '2017',
      htmlRegions: 'Атырауская область',
      regions: [],
      years: [],
      provisionLabels: ["Обеспеченность населения средним медперсоналом", "Обеспеченность населения врачами"],
      positionsLabels: ["Кол-во врачебных занятых должностей SK", "Кол-во врачебных штатных занятых должностей SK"],
      averageMedProvision: {},
      doctorsProvision: [],
      heldPositions: [],
      staffPositions: []
    };
  },
  methods: {
    updateStatistics(arrYears) {
        this.averageMedProvision = {}
        this.doctorsProvision = {}
        this.heldPositions = {}
        this.staffPositions = {}
        for (let i of arrYears.data) {
            this.averageMedProvision[i.year] = i.provisionOfAverageMedicalStaff
            this.doctorsProvision[i.year] = i.provisionOfDoctors
            this.heldPositions[i.year] = i.numberOfHeldMedicalPositions
            this.staffPositions[i.year] = i.numberOfMedicalStaffPositions
        }
    },
    viewRegion(i) {
        this.htmlRegions = i == '' ? 'Атырауская область' : i
        axios.get('http://localhost:8070/api/statistics/zdrav-kpi/personnel', {
            params: {
                region: i
            }
        }).then(e => {
            this.updateStatistics(e)
        }).catch(err => console.log(err));
    },
    viewYear(year) {
        this.htmlYears = year
    }
  },
  created() {
        axios.all([
        axios.get('http://localhost:8070/api/statistics/zdrav-kpi/personnel', {
            params: {
                year: this.htmlYears
            }
        }),
        axios.get('http://localhost:8070/api/statistics/zdrav-kpi/personnel', {
            params: {
                region: ''
            }
        })
      ])
    .then(axios.spread((arrRegions, arrYears) => {
        this.years = arrYears.data.map(e => e.year)
        this.regions = arrRegions.data.map(e => e.region)

        this.updateStatistics(arrYears)
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