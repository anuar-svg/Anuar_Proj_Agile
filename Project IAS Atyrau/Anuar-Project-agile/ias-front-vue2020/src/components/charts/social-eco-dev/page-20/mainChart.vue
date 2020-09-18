<template>
  <div class="container-fluid" style="width: 60vw;" v-if="allData">
      <div class="d-flex">
        <v-card style="width: 0px" to="/main/social-eco-dev"><svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 24 24" fill="black" width="20px" height="18px"><path d="M0 0h24v24H0z" fill="none"/><path d="M21 11H6.83l3.58-3.59L9 6l-6 6 6 6 1.41-1.41L6.83 13H21z"/></svg></v-card>
        <h3 class="mx-auto">Религия</h3>
      </div>
    <div class="row d-flex">
            <div class="dropdown col-7">
                <p>Показатель</p>
                <button style="font-size: .7rem" class="btn btn-primary dropdown-toggle" type="button" id="dropdownMenuIndex" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                    {{ htmlIndex }}
                </button>
                <div class="dropdown-menu" aria-labelledby="dropdownMenuIndex" style="max-height: 200px; overflow-x: hidden;">
                    <a style="font-size: .7rem" @click="changeIndicator(i)" v-for="i in Object.keys(indicators)" :key="i" class="dropdown-item">{{ i }}</a>
                </div>
            </div>
            <div class="dropdown col-2 offset-3">
                <p>Год</p>
                <button style="font-size: .7rem" class="btn btn-primary dropdown-toggle" type="button" id="dropdownMenuButton" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                    {{ htmlYears }}
                </button>
                <div class="dropdown-menu" aria-labelledby="dropdownMenuButton">
                    <a style="font-size: .7rem" @click="changeYear(i)" v-for="i in years" :key="i" class="dropdown-item">{{ i }}</a>
                </div>
            </div>
    </div>
        <div class="row">
            <div class="col-12">
                <HorizontalBar
                :height="200"
                :chartData="changeData"
                :chartLabels="monthes"
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
      htmlYears: '2018',
      htmlIndex: 'Количество религиозных обьединений, единиц',
      regions: [],
      years: [],
      allData: [],
      changeData: [],
      indicators: {'Количество религиозных обьединений, единиц':'numberOfReligiousAssociations', 'Количество религиозных обьединений (Ислам), единиц':'numberOfIslamicReligiousAssociations', 'Количество религиозных обьединений (Православный), единиц':'numberOfOrthodoxReligiousAssociations', 'Количество религиозных обьединений (Католический)':'numberOfCatholicReligiousAssociations', 'Количество религиозных обьединений (Протестантский), единиц':'numberOfProtestantReligiousAssociations', 'Количество культовых сооружений, единиц':'numberOfReligiousBuildings', 'Количество культовых сооружений (Ислам), единиц':'numberOfIslamicReligiousBuildings', 'Количество культовых сооружений (Православный), единиц':'numberOfOrthodoxReligiousBuildings', 'Количество культовых сооружений (Католический), единиц':'numberOfCatholicReligiousBuildings', 'Количество культовых сооружений (Протестантский), единиц':'numberOfProtestantReligiousBuildings', 'Количество миссионеров религиозных обьединений, единиц':'numberOfMissionaries', 'Количество миссионеров религиозных обьединений (Ислам), единиц':'numberOfIslamicMissionaries', 'Количество миссионеров религиозных обьединений (Православный), единиц':'numberOfOrthodoxMissionaries', 'Количество миссионеров религиозных обьединений (Католический), единиц':'numberOfCatholicMissionaries', 'Количество миссионеров религиозных обьединений (Протестантский),единиц':'numberOfProtestantMissionaries', 'Информационно-разьяснительные мероприятрия, единиц':'informationAndExplanatoryEvents', 'Конференции, единиц':'conferences', 'Семинары, единиц':'seminars', 'Лекции, единиц':'lectures', 'Круглые столы, единиц':'roundTables', 'Брифинги, единиц':'briefings', 'Акции, единиц':'stocks', 'Форумы, единиц':'forums', 'Другие мероприятия':'otherEvents', 'Индивидуальные встречи, единиц':'individualMeeting', 'Количество охваченных людей, единиц':'numberOfCoveredPeople', 'Количество охваченных людей (Ислам), единиц':'numberOfCoveredPeopleIslam', 'Количество охваченных людей (Православный), единиц':'numberOfCoveredPeopleOrthodox', 'Количество охваченных людей (Католический), единиц':'numberOfCoveredPeopleCatholic', 'Количество охваченных людей (протестантский), единиц':'numberOfCoveredPeopleProtestant', 'Количество профилактических работ по адресам, единиц':'numberOfMaintenanceWork', 'Количество профилактических работ по адресам (Ислам), единиц':'numberOfMaintenanceWorkIslam', 'Количество профилактических работ по адресам (Православный), единиц':'numberOfMaintenanceWorkOrthodox', 'Количество профилактических работ по адресам (Католический), единиц':'numberOfMaintenanceWorkCatholic', 'Количество профилактических работ по адресам (Протестантский), единиц':'numberOfMaintenanceWorkProtestant', 'Встречи, единиц':'meetings', 'Встречи с молодежью, единиц':'meetingsWithYouth', 'Встречи с населением аульных округов, единиц':'meetingsWithAulDistricts', 'Социальные опросы, единиц':'socialPolls', 'Работа со СМИ, единиц':'workingWithMedia', 'Статья, единиц':'article', 'Интервью, единиц':'interview', 'Информационные новости, единиц':'InformationNews', 'Интернет материалы, единиц':'internetMaterials', 'Передача "Иман Нуры", единиц':'programImanNury', 'Распространение информационно-методических материалов, единиц':'disseminationOfMethodologicalMaterials', 'Экспертиза по сайтам, единиц':'expertiseOnSites'},
      monthes: []
    };
  },
  methods: {
    changeIndicator(i) {
        this.htmlIndex = i
        let key = this.indicators[this.htmlIndex]
        this.changeData = this.allData.map(d => d[key])
    },
    changeYear(year) {
        this.htmlYears = year
        axios.get('http://localhost:8070/api/statistics/monitoring-sed/religion', {
            params: {
                year: year
            }
        }).then(d => {
            this.allData = d.data
            this.monthes = d.data.map(e => e.quarter)
            let key = this.indicators[this.htmlIndex]
            this.changeData = this.allData.map(e => e[key])
        }).catch(err => console.log(err));
    }
  },
  created() {
        axios.get('http://localhost:8070/api/statistics/monitoring-sed/religion/years')
        .then(arrYears => {
            this.years = arrYears.data.sort()
        })
        .catch(error => console.log(error))

        axios.get('http://localhost:8070/api/statistics/monitoring-sed/religion', {
            params: {
                year: this.htmlYears
            }
        })
        .then(arrMonths => {
            this.allData = arrMonths.data
            this.monthes = arrMonths.data.map(d => d.quarter)
            let key = this.indicators[this.htmlIndex]
            this.changeData = this.allData.map(d => d[key])
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