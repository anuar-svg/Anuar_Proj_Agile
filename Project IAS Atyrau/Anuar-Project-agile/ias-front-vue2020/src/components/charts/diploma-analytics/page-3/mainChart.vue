<template>
  <div class="container-fluid" v-if="regions.length > 0">
        <div class="row" style="max-height: 80vh; overflow: scroll;">
            <table class="table">
            <tr style="position: sticky">
                <th>Наименование школы</th>
                <th>Адрес</th>
                <th>Год постройки</th>
                <th>Рабочее время(с)</th>
                <th>Рабочее время(до)</th>
                <th>Контактный номер</th>
                <th>Фамилия</th>
                <th>Имя</th>
                <th>Отчество</th>
            </tr>
            <tr v-for="item in arrTable">
                <td>{{ item.name }}</td>
                <td>{{ item.address }}</td>
                <td>{{ item.yearOfConstruction }}</td>
                <td>{{ item.workingTimeFrom }}</td>
                <td>{{ item.workingTimeTo }}</td>
                <td>{{ item.contactNumber }}</td>
                <td>{{ item.surname }}</td>
                <td>{{ item.firstName }}</td>
                <td>{{ item.patronymic }}</td>
            </tr>
            </table>
        </div>
        <ul class="pagination pagination-sm d-flex justify-center">
            <v-card class="page-link" to="1">1</v-card>
            <v-card class="page-link" to="2">2</v-card>
            <v-card class="page-link disabled" to="3">3</v-card>
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
      regions: [],
      years: [],
      arrTable: [],
      checkBoxValue: '0',
      numberOfSchools: {}
    };
  },
  methods: {
    viewRegion(i) {
        if (this.checkBoxValue == i) {
            this.checkBoxValue = '0'

            axios.get('http://localhost:8070/api/statistics/edu/schools', {
                params: {
                    year: this.htmlYears
                }
            }).then(d => {
                d.data.map(d => {
                    this.numberOfSchools = {}
                    if (this.numberOfSchools[d.region]) {
                        this.numberOfSchools[d.region] += 1
                    } else {
                        this.numberOfSchools[d.region] = 1
                    }
                })
                this.arrTable = d.data
            }).catch(err => console.log(err));
        } else {
            this.checkBoxValue = i
            axios.get('http://localhost:8070/api/statistics/edu/schools', {
                params: {
                    year: this.htmlYears,
                    region: i
                }
            }).then(d => {
                this.arrTable = d.data
            }).catch(err => console.log(err));
        }
    },
    viewYear(year) {
        this.htmlYears = year
        
        axios.get('http://localhost:8070/api/statistics/edu/schools', {
            params: {
                year: this.htmlYears
            }
        }).then(d => {
            this.arrTable = d.data
            this.checkBoxValue = '0'
            this.numberOfSchools = {}

            d.data.map(d => {
                    if (this.numberOfSchools[d.region]) {
                        this.numberOfSchools[d.region] += 1
                    } else {
                        this.numberOfSchools[d.region] = 1
                    }
                })
        }).catch(err => console.log(err));
    },
  },
  created() {
    axios.get('http://localhost:8070/api/statistics/edu/schools', {
        params: {
            year: this.htmlYears
        }
    })
    .then((arrRegions) => {
        this.regions = Array.from(new Set(arrRegions.data.map(d => d.region)))
        this.htmlRegions = this.regions
        
        this.arrTable = arrRegions.data
        this.numberOfSchools = {}

        arrRegions.data.map(d => {
            if (this.numberOfSchools[d.region]) {
                this.numberOfSchools[d.region] += 1
            } else {
                this.numberOfSchools[d.region] = 1
            }
        })
    })
    .catch(error => console.log(error))

    axios.get('http://localhost:8070/api/statistics/edu/schools/years')
    .then((arrRegions) => {
        this.years = arrRegions.data.sort()
    })
    .catch(error => console.log(error))
  }
};
</script>

<style scoped>
table {
  font-family: arial, sans-serif;
  border-collapse: collapse;
  width: 100%;
  font-size: .8rem;
}

td, th {
  border: 1px solid #ffd000;
  text-align: left;
  padding: 8px;
}

th {
  background-color: #ffd000;
}

tr:nth-child(even) {
  background-color: #dddddd;
}

    .page-link {
        color: blue
    }

    .disabled {
        color: black
    }
</style>