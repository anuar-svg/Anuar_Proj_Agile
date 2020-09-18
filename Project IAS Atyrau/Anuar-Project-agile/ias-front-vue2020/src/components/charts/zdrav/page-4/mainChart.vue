<template>
  <div class="container-fluid" style="width: 100vw;" v-if="arrRegions.length > 0">
    <div class="row">
            <div class="dropdown offset-1">
            <button style="font-size: .7rem" class="btn btn-primary dropdown-toggle" type="button" id="dropdownMenuButton" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                {{ htmlYears }}
            </button>
            <div class="dropdown-menu" aria-labelledby="dropdownMenuButton">
                <a style="font-size: .7rem" @click="viewYear(i.year)" v-for="i in arrYears" :key="i.year" class="dropdown-item">{{ i.year }}</a>
            </div>
            </div>
    </div>
        <div class="row offset-1">
            <div class="col-3 offset-1" v-if="arrRegions.length > 0">
                <inpatientCare
                :height="300"
                :chartData="arrRegions"
                :chartColors="regionsChartColors"
                label="КОЛ-ВО ОРГАНИЗАЦИЙ, ОКАЗЫВАЮЩИХ СТАЦИОНАРНУЮ ПОМОЩЬ"
                />
            </div>
            <div class="col-3" v-if="arrRegions.length > 0">
                <patientPolyclinicHelp
                :height="300"
                :chartData="arrRegions"
                :chartColors="regionsChartColors"
                label="КОЛ-ВО ОРГАНИЗАЦИЙ, ОКАЗЫВАЮЩИХ АМБУЛАТОРНО-ПОЛИКЛИНИЧЕСКУЮ ПОМОЩЬ"
                />
            </div>
            <div class="col-3" v-if="arrRegions.length > 0">
                <!-- PopulationYears -->
                <totalNumberOfHospitalBeds
                :height="300"
                :chartData="arrRegions"
                :chartColors="regionsChartColors"
                :chartRegions="arrRegions"
                label="ОБЩЕЕ КОЛ-ВО БОЛЬНИЧНЫХ КОЕК"
                />
            </div>
            <div style="width: 90vw" class="d-flex tab-pane fade show active col-12" id="All" role="tabpanel" aria-labelledby="nav-home-tabs">
                <div class="col-8" v-if="arrRegions.length > 0">
                    <patientPolyclinicsWithBeds
                    :height="75"
                    :chartData="arrRegions"
                    :chartColors="regionsChartColors"
                    label="Кол-во амбулаторно-поликлинических организаций, имеющих койки дневного стационара"
                    />
                    <hospitalOrganizationsWithBeds
                    :height="75"
                    :chartData="arrRegions"
                    :chartColors="regionsChartColors"
                    label="Кол-во больничных организаций, имеющих койки дневного стационара (система М3)"
                    />
                </div>
                <div class="col-3" v-if="arrRegions.length > 0">
                    <Provision
                    :chartData="arrRegions"
                    :chartColors="regionsChartColors"
                    label="Обеспеченность населения больничными койками"
                    />
                </div>
            </div>
        </div>
        <ul class="pagination pagination-sm d-flex justify-center">
            <v-card class="page-link" to="1">1</v-card>
            <v-card class="page-link" to="2">2</v-card>
            <v-card class="page-link" to="3">3</v-card>
            <v-card class="page-link disabled" to="4">4</v-card>
            <v-card class="page-link" to="5">5</v-card>
            <v-card class="page-link" to="6">6</v-card>
        </ul>
  </div>
</template>

<script>
import axios from "axios";

import inpatientCare from "./inpatientCare";
import patientPolyclinicHelp from "./patientPolyclinicHelp";

import patientPolyclinicsWithBeds from "./patientPolyclinicsWithBeds";
import Provision from "./Provision";

import totalNumberOfHospitalBeds from "./totalNumberOfHospitalBeds";
import hospitalOrganizationsWithBeds from "./hospitalOrganizationsWithBeds";

export default {
  components: {
    inpatientCare,
    patientPolyclinicHelp,
    patientPolyclinicsWithBeds,
    Provision,
    totalNumberOfHospitalBeds,
    hospitalOrganizationsWithBeds
  },
  data() {
    return {
      arrRegions: [],
      regionsChartColors: {
        borderColor: "#077187",
        pointBorderColor: "#0E1428",
        pointBackgroundColor: "#AFD6AC",
        backgroundColor: "rgb(1, 184, 170)"
      },
      htmlYears: '2016',
      htmlRegions: 'Атырауская область'
    }; 
  },
  methods: {
    viewYear(year) {
        // console.log(year)
        this.htmlYears = year
        axios.get('http://localhost:8070/api/statistics/zdrav-kpi/organizations', {
            params: {
                year: year
            }
        }).then(d => {
            this.arrRegions = d.data
        }).catch(err => console.log(err));
    }
  },
  created() {
    // axios.get('http://localhost:8070/api/statistics/zdrav-kpi/organizations', {
    //             params: {
    //                 year: '2016'
    //             }
    //         }).then(d => {
    //             this.arrRegions = d.data
    //         }).catch(err => console.log(err));
    axios.all([
        axios.get('http://localhost:8070/api/statistics/zdrav-kpi/organizations', {
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
        this.arrRegions = arrRegions.data
        this.arrYears = arrYears.data
        // this.arrExpectancy = arrExpectancy.data
    }))
    .catch(error => console.log(error))
    }}
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