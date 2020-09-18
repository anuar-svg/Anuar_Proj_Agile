<template>
  <div class="container-fluid" style="width: 60vw;" v-if="arrRegions.length > 0">
    <div class="row">
            <div class="dropdown col-3">
            <button style="font-size: .7rem" class="btn btn-primary dropdown-toggle" type="button" id="dropdownMenuButton" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                {{ htmlYears }}
            </button>
            <div class="dropdown-menu" aria-labelledby="dropdownMenuButton">
                <a style="font-size: .7rem" @click="viewYear(i.year)" v-for="i in arrYears" :key="i.year" class="dropdown-item">{{ i.year }}</a>
            </div>
            </div>
    </div>
        <div class="row">
            <div class="col-6" v-if="arrRegions.length > 0">
                <maternalMortalityBar
                :height="200"
                :chartData="arrRegions"
                :chartColors="regionsChartColors"
                label="МАТЕРИНСКАЯ СМЕРТНОСТЬ"
                />
            </div>
            <div class="col-6" v-if="arrRegions.length > 0">
                <infantMortalityBar
                :height="200"
                :chartData="arrRegions"
                :chartColors="regionsChartColors"
                label="МЛАДЕНЧЕСКАЯ СМЕРТНОСТЬ"
                />
            </div>
            <div class="col-8">
                <!-- <button  v-for="item in arrRegions" :key="item.region">{{ item.region }}</button> -->
                <div class="dropdown">
                <button style="font-size: .7rem" class="btn btn-primary dropdown-toggle" type="button" id="dropdownMenuButton" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                    {{ htmlRegions }}
                </button>
                <div class="dropdown-menu" aria-labelledby="dropdownMenuButton">
                    <a style="font-size: .7rem" v-for="i in arrRegions" :key="i.region" @click="viewRegion(i)" class="dropdown-item">{{ i.region === '' ? i.area : i.region }}</a>
                </div>
                </div>
            </div>
            <div class="col-2">
                <!-- mortalityTypesBar -->
                <div class="dropdown">
                <button style="font-size: .7rem" class="btn btn-success dropdown-toggle" type="button" id="dropdownMenuButton" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                    {{ htmlType }}
                </button>
                <div class="dropdown-menu" aria-labelledby="dropdownMenuButton">
                    <a style="font-size: .7rem" v-for="i in Object.keys(types)" :key="i"  @click="viewMortality(types[i], i)" class="dropdown-item">{{ i }}</a>
                </div>
            </div>
            </div>
            <div style="width: 55vw" class="d-flex tab-pane fade show active" id="All" role="tabpanel" aria-labelledby="nav-home-tabs">
                <div class="col-4" v-if="arrYears.length > 0">
                    <maternalMortalityLine
                    :height="250"
                    :chartData="arrYears"
                    :chartColors="regionsChartColors"
                    label="Материнская смертность"
                    />
                </div>
                <div class="col-4" v-if="arrYears.length > 0">
                    <infantMortalityLine
                    :height="250"
                    :chartData="arrYears"
                    :chartColors="regionsChartColors"
                    label="Младенческая смертность"
                    />
                </div>
                <div class="col-4" v-if="arrRegions.length > 0">
                    <!-- PopulationYears -->
                    <mortalityTypesBar
                    :height="250"
                    :chartData="ills"
                    :chartColors="regionsChartColors"
                    :chartRegions="arrRegions"
                    label="Человек на 100 тыс"
                    />
                </div>
            </div>
        </div>
        <div class="row" v-if="arrYears.length > 0" >
            <div class="col-12">
                <mortalityTypesLine
                :height="100"
                :chartData="ills"
                :chartColors="regionsChartColors"
                :label="htmlType"
                />
            </div>
        </div>
        <ul class="pagination pagination-sm offset-4">
            <v-card class="page-link" to="1">1</v-card>
            <v-card class="page-link disabled" to="2">2</v-card>
            <v-card class="page-link" to="3">3</v-card>
            <v-card class="page-link" to="4">4</v-card>
            <v-card class="page-link" to="5">5</v-card>
            <v-card class="page-link" to="6">6</v-card>
        </ul>
  </div>
</template>

<script>
import axios from "axios";

import maternalMortalityBar from "./maternalMortalityBar";
import infantMortalityBar from "./infantMortalityBar";

import maternalMortalityLine from "./maternalMortalityLine";
import infantMortalityLine from "./infantMortalityLine";

import mortalityTypesBar from "./mortalityTypesBar";
import mortalityTypesLine from "./mortalityTypesLine";

export default {
  components: {
    maternalMortalityBar,
    infantMortalityBar,
    maternalMortalityLine,
    infantMortalityLine,
    mortalityTypesBar,
    mortalityTypesLine
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
      arrYears: [],
      arrExpectancy: [],
      page: 1,
      ills: {},
      types: {},
      htmlYears: '2016',
      htmlRegions: 'Атырауская область',
      htmlType: 'Смертность от ишемических болезней сердца'
    }; 
  },
  methods: {
    viewRegion(i) {
        // console.log(region)
        axios.get('http://localhost:8070/api/statistics/zdrav-kpi/mortalities', {
            params: {
                region: i.region
            }
        }).then(d => {
            this.arrYears = d.data
            }).catch(err => console.log(err));
        // console.log(test)
        // console.log(this.arrYears)
        this.htmlRegions = i.region === '' ? i.area : i.region
    },
    viewYear(year) {
        // console.log(year)
        axios.get('http://localhost:8070/api/statistics/zdrav-kpi/mortalities', {
            params: {
                year: year
            }
        }).then(d => {
            this.arrRegions = d.data
            }).catch(err => console.log(err));

        axios.get('http://localhost:8070/api/statistics/zdrav-kpi/mortalities', {
            params: {
                year: year
            }
        }).then(d => {
            this.types['Смертность от болезней системы кровообращения'] = d.data.map(a => a.circulatoryDiseaseMortality)
            this.types['Смертность от ишемических болезней сердца'] = d.data.map(a => a.heartDiseaseMortality)
            this.types['Смертность от онкологических заболеваний'] = d.data.map(a => a.cancerMortality)
            this.types['Смертность от травм, отравлений и т.д'] = d.data.map(a => a.injuresMortality)
            this.types['Смертность от туберкулёза'] = d.data.map(a => a.tuberculosisMortality)
            
            this.ills = {
                        'regions': this.ills['regions'],
                        'ills': this.types[this.htmlType]
                        }
        });
        this.htmlYears = year
    },
    viewMortality(array, name){
        this.ills = {
                    'regions': this.ills['regions'],
                    'ills': array
                    }
        this.htmlType = name

    }
  },
  created() {
    axios.all([
        axios.get('http://localhost:8070/api/statistics/zdrav-kpi/mortalities', {
            params: {
                year: '2016'
            }
        }),
        axios.get('http://localhost:8070/api/statistics/zdrav-kpi/mortalities', {
            params: {
                region: ''
            }
        })
      ])
    .then(axios.spread((arrRegions, arrYears) => {
        this.arrRegions = arrRegions.data
        this.types['Смертность от болезней системы кровообращения'] = arrRegions.data.map(a => a.circulatoryDiseaseMortality)
        this.types['Смертность от ишемических болезней сердца'] = arrRegions.data.map(a => a.heartDiseaseMortality)
        this.types['Смертность от онкологических заболеваний'] = arrRegions.data.map(a => a.cancerMortality)
        this.types['Смертность от травм, отравлений и т.д'] = arrRegions.data.map(a => a.injuresMortality)
        this.types['Смертность от туберкулёза'] = arrRegions.data.map(a => a.tuberculosisMortality)
        this.ills['regions'] = arrRegions.data.map(a => a.region === '' ? a.area : a.region)
        this.ills['ills'] = this.types[this.htmlType]
        // console.log("chin" + this.types)

        this.arrYears = arrYears.data
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