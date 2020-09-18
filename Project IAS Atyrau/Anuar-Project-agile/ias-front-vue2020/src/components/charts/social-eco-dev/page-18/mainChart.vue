<template>
  <div class="container-fluid" style="width: 60vw;" v-if="years">
      <div class="d-flex">
        <v-card style="width: 0px" to="/main/social-eco-dev"><svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 24 24" fill="black" width="20px" height="18px"><path d="M0 0h24v24H0z" fill="none"/><path d="M21 11H6.83l3.58-3.59L9 6l-6 6 6 6 1.41-1.41L6.83 13H21z"/></svg></v-card>
        <h3 class="mx-auto">Бюджет</h3>
      </div>
    <div class="row">
        <div class="dropdown">
            <p>Показатель</p>
            <button style="font-size: .7rem" class="btn btn-primary dropdown-toggle" type="button" id="dropdownMenuIndex" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                {{ htmlIndex }}
            </button>
            <div class="dropdown-menu" aria-labelledby="dropdownMenuIndex">
                <a style="font-size: .7rem" @click="changeIndicator(i)" v-for="i in Object.keys(budgetIndicator)" :key="i" class="dropdown-item">{{ i }}</a>
            </div>
        </div>
    </div>
        <div class="row">
            <div class="col-12">
                <HorizontalBar
                :height="200"
                :chartData="changeData"
                :chartLabels="years"
                :chartColors="regionsChartColors"
                :label="htmlIndex"
                />
            </div>
        </div>
  </div>
</template>

<script>
import axios from "axios";

import HorizontalBar from "./HorizontalBar";

export default {
  components: {
    HorizontalBar
  },
  data() {
    return {
      regionsChartColors: {
        borderColor: "#077187",
        pointBorderColor: "#0E1428",
        pointBackgroundColor: "#AFD6AC",
        backgroundColor: "rgb(98, 153, 235)",
        pointHitRadius: 10
      },
      htmlIndex: 'Исполнение бюджета, %',
      budgetIndicator: {'Исполнение бюджета, %':'budgetExecution', 'Освоение средств республиканского бюджета, %':'disbursementOfRepublicanBudget', 'Освоение средств местного бюджета, %':'disbursementOfLocalBudget', 'Обьем бюджета области, тыс. тенге':'regionalBudget', 'Бюджет развития, тыс. тенге':'developmentBudget', 'Текущий бюджет, тыс. тенге':'currentBudget'},
      years: [],
      allData: {},
      changeData: {}
    };
  },
  methods: {
    changeIndicator(i) {
        this.htmlIndex = i
        let key = this.budgetIndicator[this.htmlIndex]
        this.changeData = this.allData.map(d => d[key])
    },
  },
  created() {
        axios.get('http://localhost:8070/api/statistics/monitoring-sed/budget')
        .then(arrMonths => {
            this.years = arrMonths.data.map(d => d.year)
            this.allData = arrMonths.data
            let key = this.budgetIndicator[this.htmlIndex]
            this.changeData = this.allData.map(d => d[key])
            // this.updateStatistics(arrMonths)
        })
        .catch(error => console.log(error))
  }
};
</script>

<style scoped>
    .nav-link{
        font-size: .7rem;
    }
</style>