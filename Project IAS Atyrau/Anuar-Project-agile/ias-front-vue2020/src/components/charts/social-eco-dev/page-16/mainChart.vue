<template>
  <div class="container-fluid" style="width: 60vw;" v-if="years">
      <div class="d-flex">
        <v-card style="width: 0px" to="/main/social-eco-dev"><svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 24 24" fill="black" width="20px" height="18px"><path d="M0 0h24v24H0z" fill="none"/><path d="M21 11H6.83l3.58-3.59L9 6l-6 6 6 6 1.41-1.41L6.83 13H21z"/></svg></v-card>
        <h3 class="mx-auto">Образование</h3>
      </div>
    <div class="row">
        <div class="dropdown">
            <p>Показатель</p>
            <button style="font-size: .7rem" class="btn btn-primary dropdown-toggle" type="button" id="dropdownMenuIndex" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                {{ htmlIndex }}
            </button>
            <div class="dropdown-menu" aria-labelledby="dropdownMenuIndex" style="max-height: 200px; overflow-x: hidden;">
                <a style="font-size: .7rem" @click="changeIndicator(i)" v-for="i in Object.keys(eduIndicator)" :key="i" class="dropdown-item">{{ i }}</a>
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
      htmlIndex: 'Суицид до восемнодцати лет, человек',
      eduIndicator: {'Суицид до восемнодцати лет, человек':'suicideBefore18', 'Доля учащихся принявшие участие в ЕНТ от общего количества учащихся школ, %':'ENTParticipantsFromAllStudents', 'Количество участников ЕНТ в сравнении с прошлым годом, человек':'ENTParticipantsComparedToLastYear', 'Количество участников ЕНТ, человек':'numberOfENTParticipants', 'Средний балл ЕНТ в сравнении с прошлым годом, единиц':'averagENTScoreInComparedToLastYear', 'Средний балл по итогам ЕНТ, единиц':'averageENTScore', 'Количество претендентов "Алтын Белги" в сравнении с прошлым годом, человек':'AltynBelgiApplicantsComparedToLastYear', 'Количество претендентов Алтын Белги, человек':'AltynBelgiApplicants', 'Количество подтвердивших Алтын Белги, человек':'numberOfConfirmedAltynBelgi', 'Количество подтвердивших Алтын Белги в сравнении с общим количество претендентов, человек':'numberOfConfirmedAltynBelgiComparedToTotalNumber', 'Количество претендентов на Аттестат с отличием в сравнении с прошлым годом, человек':'certificateWithHonorsApplicantsComparedToLastYear', 'Количество подтвердивших Аттестат с отличием, человек':'numberOfConfirmedCertificateWithHonors', 'Количество выпускников, набравших результат "неудовлетворительно", человек':'graduatesWithUnsatisfactoryResult', 'Количество выпускников, набравших результаты ниже порогового уровня, человек':'graduatesWithBelowTheThreshold', 'Охват детей дошкольников воспитанием и обучением с 1 до 6 лет, %':'coverageChildrenWithEducationFrom1To6', 'Охват детей дошкольников воспитанием и обучением с 3 до 6 лет, %':'coverageChildrenWithEducationFrom3To6', 'Обеспечение дошкольным образованием в городской и сельской местности, %':'providingPreschoolEducationInUrbanAndRuralAreas', 'Доля трудоустроенных выпускников технического и профессионального образование по специальости от общего количества выпускников, %':'shareOfEmployedGraduatesFromTotal', 'Количество выпускников всего, человек':'totalNumberOfGraduates', 'Количесвто выпускников в сравнении с прошлым годом, человек':'numberOfGraduatesComparedToLasttYear', 'Количество обьектов образования, единиц':'numberOfEducationalFacilities', 'Количество школ, единиц':'numbrOfSchools', 'Количество детских садов, единиц':'numberOfKindergartens', 'Количество аварийных обьектов, единиц':'numberOfEmergencyFaciliies', 'Количество аварийных детских садов, единиц':'numberOfEmergencyKindrgartens', 'Количество аварийных школ, единиц':'numberOfEmergencySchools', 'Охват детей дополнительным образованием, %':'overageOfChildrenWithAdditionalEducation', 'Данные об организации горячего питания обучающихся общеобразовательных школ области, единиц':'organizationsOfHotMealsForPupils'},
      years: [],
      allData: {},
      changeData: {}
    };
  },
  methods: {
    changeIndicator(i) {
        this.htmlIndex = i
        console.log(i)
        let key = this.eduIndicator[this.htmlIndex]
        this.changeData = this.allData.map(d => d[key])
    },
  },
  created() {
        axios.get('http://localhost:8070/api/statistics/monitoring-sed/education')
        .then(arrMonths => {
            this.years = arrMonths.data.map(d => d.year)
            this.allData = arrMonths.data
            let key = this.eduIndicator[this.htmlIndex]
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