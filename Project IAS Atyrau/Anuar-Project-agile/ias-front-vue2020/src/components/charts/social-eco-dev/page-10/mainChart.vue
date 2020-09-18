<template>
  <div class="container-fluid" style="width: 60vw;" v-if="allData">
      <div class="d-flex">
        <v-card style="width: 0px" to="/main/social-eco-dev"><svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 24 24" fill="black" width="20px" height="18px"><path d="M0 0h24v24H0z" fill="none"/><path d="M21 11H6.83l3.58-3.59L9 6l-6 6 6 6 1.41-1.41L6.83 13H21z"/></svg></v-card>
        <h3 class="offset-4">Здравоохранение</h3>
      </div>
    <div class="row d-flex">
            <div class="dropdown col-5" v-if="MQIndicator">
                <p>Показатель</p>
                <button style="font-size: .7rem; max-width: 20vw; overflow-x: hidden" class="btn btn-primary dropdown-toggle" type="button" id="dropdownMenuButton" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false" >
                    {{ htmlIndex }}
                </button>
                <div class="dropdown-menu" aria-labelledby="dropdownMenuButton" style="max-height: 200px; overflow-x: hidden;">
                    <a style="font-size: .7rem" @click="changeIndicator(i)" v-for="i in Object.keys(indicators)" :key="i" class="dropdown-item">{{ i }}</a>
                </div>
            </div>
            <div class="dropdown col-5" v-if="yearsIndicator">
                <p>Показатель</p>
                <button style="font-size: .7rem; max-width: 20vw; overflow-x: hidden" class="btn btn-primary dropdown-toggle" type="button" id="dropdownMenuButton" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false" >
                    {{ htmlIndex }}
                </button>
                <div class="dropdown-menu" aria-labelledby="dropdownMenuButton" style="max-height: 200px; overflow-x: hidden;">
                    <a style="font-size: .7rem" @click="changeIndicatorToYears(i)" v-for="i in Object.keys(indicators)" :key="i" class="dropdown-item">{{ i }}</a>
                </div>
            </div>
            <button class="btn btn-primary col-2" style="font-size: .7rem; margin-top: 40px; margin-right: 20px" @click="changeMonthes()">Ежемесячные</button>
            <button class="btn btn-primary col-2" style="font-size: .7rem; margin-top: 40px; margin-right: 20px" @click="changeQuarters()">Квартальные</button>
            <button class="btn btn-primary col-1" style="font-size: .7rem; margin-top: 40px; margin-right: 20px" @click="changeYears()"
            >Годовые</button>
            <div class="dropdown col-1" v-if="yearsBtn1">
                <p>Год</p>
                <button style="font-size: .7rem" class="btn btn-primary dropdown-toggle" type="button" id="dropdownMenuButton" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                    {{ htmlYears }}
                </button>
                <div class="dropdown-menu" aria-labelledby="dropdownMenuButton">
                    <a style="font-size: .7rem" @click="changeYearByMonthes(i)" v-for="i in years" :key="i" class="dropdown-item">{{ i }}</a>
                </div>
            </div>
            <div class="dropdown col-1" v-if="yearsBtn2">
                <p>Год</p>
                <button style="font-size: .7rem" class="btn btn-primary dropdown-toggle" type="button" id="dropdownMenuButton" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                    {{ htmlYears }}
                </button>
                <div class="dropdown-menu" aria-labelledby="dropdownMenuButton">
                    <a style="font-size: .7rem" @click="changeYearByQuarters(i)" v-for="i in years" :key="i" class="dropdown-item">{{ i }}</a>
                </div>
            </div>
    </div>
        <div class="row">
            <div class="col-12" v-if="MQChart">
                <HorizontalBar
                :height="200"
                :chartData="Object.values(changeData)"
                :chartLabels="Object.keys(changeData)"
                :chartColors="regionsChartColors"
                :label="htmlIndex"
                />
            </div>
            <div class="col-12" v-if="yearsChart">
                <HorizontalBar
                :height="200"
                :chartData="changeData"
                :chartLabels="byYearsFromYears"
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
      htmlIndex: 'Кол-во санитарных машин, единиц',
      regions: [],
      years: [],
      allData: [],
      changeData: [],
      indicators: {},
      indicatorsByMonthes: {'Из них бытовые травмы, единиц':'domesticInjuries', 'Из них взрослые, единиц':'adults', 'Из них дети, единиц':'children', 'Из них довезенные в больницу, единиц':'takenByHospital', 'Из них ДТП, единиц':'numberOfDTP', 'Из них ожоги, единиц':'burns', 'Из них помещенные в больницу, единиц':'placedToHospital', 'Из них производственные травмы, единиц':'industrialInjuries', 'Кол-во бригад скорой помощи ССМП, единиц':'ambulanceCrews', 'Кол-во вызовов по станции скорой помощи, единиц':'callsToAmbulance', 'Кол-во санитарных машин, единиц':'ambulances'},

      indicatorsByQuarters: {'Артериальная гипертензия, на 100 тыс. человек':'morbidityFromArterialHypertension', 'врачебные, единиц':'medical', 'Детская смертность(до 5 лет), на 1 тыс. человек':'childMortality', 'Естественный прирост населения, на 1 тыс. человек':'naturalPopulationGrowth', 'Заболеваемость от болезней системы кровообращения (Ишемическая болезнь сердца), на 100 тыс. человек':'morbidityFromCoronaryHeartDisease', 'Заболеваемость от болезенй системы кровообращения, 100 тыс. человек':'circulatoryMortality', 'Заболеваемость от онкологических заболеваний, на 100 тыс. человек':'incidenceOfCancer', 'Заболеваемость от психическиъ расстройств и расстройств поведения, на 100 тыс. человек':'morbidityFromMentalDisorders', 'Заболеваемость от психическиъ расстройств и расстройств поведения с употреблением психоактивных веществ, на 100 тыс. человек':'morbidityFromMentalDisordersWithSubstanceUse', 'Заболеваемость от травм, отравлений м других внешних причин, на 100 тыс. человек':'morbidityFromInjuries', 'Заболеваемость туберкулезом, на 100 тыс. человек':'incidenceTuberculosis', 'Ишемическая болезнь сердца, на 100 тыс. человек':'heartDiseaseMortality', 'Количество амбулаторно-поликлинических организаций, имеющие койки дневного стационара, единиц':'numberOfPolyclinicsWithDayHospitalBeds', 'Общее количество коек двевного пребывания в больничных организациях (система МЗ), единиц':'totalNumberOfDayBedsInHospitalOrganizations', 'Количество бригад СМП, единиц':'numberOfEmergencyBrigades', 'Количество выполненных выездов бригад СМП, единиц':'numberOfcompletedEmergencyVisits', 'Количество обращений к врачам  АПО (система МЗ), на 1 жителя, посещений в смену на 1 человек':'VisitDoctorsFor1', 'Количество обращений к врачам  АПО (система МЗ), на 1000 населения':'numberOfVisitDoctorsFor1000', 'Количество обслуженных лиц, при выездах бригадами СМП, на 1 тыс. человек':'numberOfServedPersonsByEmergencyDepartments', 'Количество организаций, оказывающих амбулаторно-поликлиническую помощь (все ведомства), единиц':'numberOfOrganizationsWithPatientPolyclinicHelp', 'Количество организаций, оказывающих амбулаторно-поликлиническую помощь (Другие ведомства), единиц':'numberOfOrganizationsWithPatientPolyclinicHelpOthers', 'Количество организаций, оказывающих амбулаторно-поликлиническую помощь (система МЗ), единиц':'numberOfOrganizationsWithPatientPolyclinicHelpSystemMZ', 'Количество организаций оказывающие стационарную помощь: системв МЗ, единиц':'numberOfProvidingInpatientCareFromSystemMZ', 'Количество организаций оказывающие стационарную помощь, единиц':'numberOfProvidingInpatientCare', 'Количество отделении СМП, единиц':'numberOfEmergencyDepartments', 'Количество поступивших жителей в больничные организации (в государственные), тыс. человек':'numberOfResidentsState', 'Количество поступивших жителей в больничные организации (в частные), тыс. человек':'numberOfResidentsPrivate', 'Количество поступивших жителей в больничные организации (система МЗ), тыс. человек':'numberOfResidentsSystemMZ', 'Количество самостоятельных станций скорой медицинской помощи: системв МЗ, единиц':'numberOfSelfSupportingSystemMZ', 'Материнская смертность, на 100 тыс. человек':'maternalMortality', 'Младенческая смертность, на 1 тыс. человек':'infantMortality', 'Обеспеченность населения больничными койками(все ведомства)(системв МЗ), на 10 тыс. человек':'provisionOfHospitalBedsSystemMZ', 'Обеспеченность населения больничными койками, на 10 тыс. человек':'provisionOfHospitalBeds', 'Обеспеченность начеления врачами(все ведомства)(система МЗ), на 100 тыс. человек':'provisionOfDoctorsFromSystemMZ', 'Обеспеченность начеления врачами(все ведомства), на 100 тыс. человек':'provisionOfDoctorsFromAllDepartments', 'Обеспеченность начеления средним медперсоналом(все ведомства)(система МЗ), на 10 тыс. человек':'provisionOfNursesFromSystemMZ', 'Обеспеченность начеления средним медперсоналом (все ведомства), на 10 тыс. человек':'provisionOfNursesFromAllDepartments', 'Общая заболеваемость населения(зарегистрированные впервые в жизни), на 100 тыс. человек':'totalMorbidityOfPopulation', 'Общее количество больничных коек (система МЗ), единиц':'numberOfHospitalBedsFromSystemMZ', 'Общее количество больничных коек, единиц':'totalNumberOfHospitalBeds', 'Общее количество коек дневного пребывания АПО(система М3), единиц':'totalNumberDayPoliclinicBeds', 'Общее количество коек двевного пребывания в больничных организациях(система МЗ), единиц':'totalNumberOfDayBedsInHospitalOrganizations', 'Ожидаемая продолжительность жизни при рождении, лет':'lifeExpectancyAtBirth', 'Острый инфаркт миокарда, на 100 тыс. человек':'morbidityFromAcuteMyocardialInfarction', 'Педиатрические, единиц':'pediatric', 'Смертность от болезенй системы кровообращения, на 100 тыс. человек':'circulatoryMortality', 'Смертность от травм, отравлений и других внешних причин, на 100 тыс. человек':'injuriesMortality', 'Уровень смертности от онкологических заболеваний, на 100 тыс. человек':'cancerMortality', 'Уровень сиортности от туберкулеза, на 100 тыс. человек':'tuberculosisMortalityRate', 'Уровень смертности, на 1 тыс. человек':'mortalityRate', 'Фельдшерские, единиц':'paramedics', 'Хозрасчетные в системе МЗ, единиц':'numberOfSelfSupportingSystemMZ', 'Частные организации, единиц':'numberOfPrivateOrganizations', 'Численность врачей (все ведомства)(система МЗ)':'numberOfDoctorsFromSystemMZ  ', 'Численность врачей (все ведомства), человек':'numberOfDoctorsFromAllDepartments', 'Численность среднего медперсонала(система МЗ)':'numberOfNursesFromSystemMZ', 'Численность среднего медперсонала (все ведомства)':'numberOfNursesFromAllDepartments'},

      indicatorsByYears: {'Уровень смертности, на 1 тыс. человек':'mortalityRate', 'Материнская смертность, человек на 100 тыс. человек':'maternalMortality', 'Младенческая смертность, человек на 1 тыс. человек':'infantMortality', 'Заболеваемость туберкулезом, человек на 100 тыс. человек':'incidenceTuberculosis', 'Ожидаемая продолжительность жизни при рождении, лет':'lifeExpectancyAtBirth', 'Детская смертность, человек на 1 тыс. человек':'childMortality', 'Уровень сиортности от туберкулеза, человек на 100 тыс. человек':'tuberculosisMortalityRate', 'Заболеваемость от болезенй системы кровообращения, человек на 100 тыс. человек':'circulatoryMortality', 'Уровень смортности от онкологических заболеваний, человек на 100 тыс. человек':'cancerMortality', 'Естественный прирост населения, человек на 1 тыс. человек':'naturalPopulationGrowth', 'Ишемическая болезнь сердца, человек на 100 тыс. человек':'heartDiseaseMortality', 'Смертность от травм, отравлений и других внешних причин, человек на 100 тыс. человек':'injuriesMortality', 'Численность врачей (все ведомства), человек':'numberOfDoctorsFromAllDepartments', 'Численность врачей (все ведомства): системв МЗ, человек':'numberOfDoctorsFromSystemMZ', 'Обеспеченность начеления врачами все ведомства, человек на 100 тыс. человек':'provisionOfDoctorsFromAllDepartments', 'Обеспеченность начеления врачами все ведомства: системв МЗ, человек на 100 тыс. человек':'provisionOfDoctorsFromSystemMZUnit', 'Численность среднего медперсонала (все ведомства), человек':'numberOfNursesFromAllDepartments', 'Численность среднего медперсонала: системв МЗ, человек':'numberOfNursesFromSystemMZ', 'Обеспеченность начеления средним медперсоналом (все ведомства), человек на 10 тыс. человек':'provisionOfNursesFromAllDepartments', 'Обеспеченность начеления средним медперсоналом: системв МЗ, человек на 10 тыс. человек':'provisionOfNursesFromSystemMZ', 'Количество организаций оказывающие стационарную помощь, единиц':'numberOfProvidingInpatientCare', 'Количество организаций оказывающие стационарную помощь: системв МЗ, единиц':'numberOfProvidingInpatientCareFromSystemMZ', 'Общее количество больничных коек, единиц':'totalNumberOfHospitalBeds', 'Общее количество больничных коек (система МЗ), единиц':'numberOfHospitalBedsFromSystemMZ', 'Количество самостоятельных станций скорой медицинской помощи: системв МЗ, единиц':'numberOfSelfSupportingSystemMZ', 'Частные организации, единиц':'numberOfPrivateOrganizations', 'Обеспеченность населения больничными койками, человек на 10 тыс. человек':'provisionOfHospitalBeds', 'Обеспеченность населения больничными койками (Система МЗ), человек на 10 тыс. человек':'provisionOfHospitalBedsSystemMZ', 'Количество поступивших жителей в больничные организации (система МЗ), тыс. человек':'numberOfResidentsSystemMZ', 'Количество поступивших жителей в больничные организации (в государственные), тыс. человек':'numberOfResidentsState', 'Количество поступивших жителей в больничные организации (в частные), тыс. человек':'numberOfResidentsPrivate', 'Количество организаций, имеющих койки дневного стационара, единиц':'numberOfOrganizationsWithDayHospitalBeds', 'Общее количество коек двевного пребывания в больничных организациях (система МЗ), единиц':'totalNumberOfDayBedsInHospitalOrganizations', 'Количество организаций, оказывающих амбулаторно-поликлиническую помощь (все ведомства), единиц':'numberOfOrganizationsWithPatientPolyclinicHelp', 'Количество организаций, оказывающих амбулаторно-поликлиническую помощь (система МЗ), единиц':'numberOfOrganizationsWithPatientPolyclinicHelpSystemMZ', 'Количество организаций, оказывающих амбулаторно-поликлиническую помощь (другие ведомства), единиц':'numberOfOrganizationsWithPatientPolyclinicHelpOthers', 'Количество организаций, оказывающих амбулаторно-поликлиническую помощь (частные организации), единиц':'numberOfOrganizationsWithPatientPolyclinicHelpPrivate', 'Количество обращений к врачам  АПО (система МЗ), на 1000 населения, на 1000 населения':'numberOfVisitDoctorsFor1000', 'Количество обращений к врачам  АПО (система МЗ), на 1 жителя, на 1 жителя':'numberOfVisitDoctorsFor1', 'Количество амбулаторно-поликлинических организаций, имеющие койки дневного стационара, единиц':'numberOfPolyclinicsWithDayHospitalBeds', 'Общее количество коек дневного пребывания АПО, единиц':'totalNumberDayPoliclinicBeds', 'Общая заболеваемость населения, человек на 100 тыс. человек':'totalMorbidityOfPopulation', 'Заболеваемость от онкологических заболеваний, человек на 100 тыс. человек':'incidenceOfCancer', 'Заболеваемость от психическиъ расстройств и расстройств поведения, человек на 100 тыс. человек':'morbidityFromMentalDisorders', 'Заболеваемость от психическиъ расстройств и расстройств поведения с употреблением психоактивных веществ, человек на 100 тыс. человек':'morbidityFromMentalDisordersWithSubstanceUse', 'Заболеваемость от травм, отравлений м других внешних причин, человек на 100 тыс. человек':'morbidityFromInjuries', 'Заболеваемость от болезней системы кровообращения, человек на 100 тыс. человек':'morbidityFromBloodCirculation', 'Артериальная гипертензия, человек на 100 тыс. человек':'morbidityFromArterialHypertension', 'Заболеваемость от болезней системы кровообращения (Ишемическая болезнь сердца), человек на 100 тыс. человек':'morbidityFromCoronaryHeartDisease', 'Острый инфоркт миокарда, человек на 100 тыс. человек':'morbidityFromAcuteMyocardialInfarction', 'Количество самостоятельных станций, единиц':'numberOfIndependentStations', 'Количество отделении СМП, единиц':'numberOfEmergencyDepartments', 'Количество бригад СМП, единиц':'numberOfEmergencyBrigades', 'Врачебные, единиц':'medical', 'Педиатрические, единиц':'pediatric', 'фельдшерские, единиц':'paramedics', 'Количество выполненных выездов бригад СМП, единиц':'numberOfcompletedEmergencyVisits', 'Количество обслуженных лиц, при выездах бригадами СМП, человек на 1 тыс.человек':'numberOfServedPersonsByEmergencyDepartments', 'Рождаемость, на 1 тыс. человек':'fertility', 'Распространенность ВИЧ-инфекции, %':'prevalenceOfInfection', 'Количество врачей (в частных организациях), человек':'numberOfDoctorsInPrivateOrganizations', 'Укомплектованность врачебными кадрами, %':'medicalStaffing', 'Количество врачебных штатных должностей, единиц':'numberOfMedicalStaffPositions', 'Количество врачебных занятых должностей, единиц':'numberMedicalPositionsHeld', 'Численность среднего медперсонала (в частных организациях), человек':'numberOfNursesInPrivateOrganizations', 'Количество организаций, оказывающих стационарную помощь (другие ведомства), единиц':'numberOfProvidingInpatientCareOthers', 'Количество больных, состоящих в "Д" учете на конец года, человек на 100 тыс. человек':'numberOfPatientsInTheD', 'Количество больных 0-14 лет':'numberOfPatientsFrom0TO14', 'Количество больных 15-17 лет, человек на 100 тыс. человек':'numberOfPatientsFrom15To17', 'Количество больных с 18 лет, человек на 100 тыс. человек':'numberOfPatientsAfter18', 'Общее количество аптек, единиц':'totalNumberOfPharmacies', 'Государственные аптеки, единиц':'numberOfStatePharmacies', 'Частные аптеки, единиц':'numberOfPrivatePharmacies'},
      indicators: {},
      yearsBtn1: true,
      yearsBtn2: false,
      yearsIndicator: false,
      MQIndicator: true,
      MQChart: true,
      yearsChart: false,
      byYearsFromYears: [],
      test: {}
    };
  },
  methods: {
    updateStatistics(update, index) {
        // this.allData = update.data
        let allDatas = update.data
        let key = index[this.htmlIndex]
        this.changeData = allDatas[key]
    },
    changeYears() {
        this.yearsBtn1 = false
        this.yearsBtn2 = false
        this.MQIndicator = false
        this.MQChart = false
        this.yearsIndicator = true
        this.yearsChart = true
        this.htmlIndex = 'Частные аптеки, единиц'
        this.indicators = this.indicatorsByYears

        axios.get('http://localhost:8070/api/statistics/monitoring-sed/healthcare', {
            params: {
                byYears: true
            }
        })
        .then(arrMonths => {
            this.allData = arrMonths.data
            this.byYearsFromYears = []
            arrMonths.data.map(n => this.byYearsFromYears.push(n.year))
            let key = this.indicators[this.htmlIndex]
            this.changeData = arrMonths.data.map(d=>d[key])
            // this.updateStatistics(arrMonths, this.indicators)
        })
        .catch(error => console.log(error))
    },
    changeQuarters() {
        this.yearsBtn1 = false
        this.yearsBtn2 = true
        this.MQIndicator = true
        this.MQChart = true
        this.yearsIndicator = false
        this.yearsChart = false
        this.htmlIndex = 'Артериальная гипертензия, на 100 тыс. человек'

        axios.get('http://localhost:8070/api/statistics/monitoring-sed/healthcare/years')
        .then(arrYears => {
            this.years = arrYears.data["Года мониторинга Здравохранения по кварталам"].sort()
            this.htmlYears = this.years[this.years.length - 1]
        })
        .catch(error => console.log(error))

        axios.get('http://localhost:8070/api/statistics/monitoring-sed/healthcare', {
            params: {
                year: this.htmlYears,
                byQuarters: true
            }
        })
        .then(arrMonths => {
            this.allData = arrMonths.data
            this.indicators = this.indicatorsByQuarters
            this.updateStatistics(arrMonths, this.indicators)
        })
        .catch(error => console.log(error))
    },
    changeMonthes() {
        this.yearsBtn1 = true
        this.yearsBtn2 = false
        this.MQIndicator = true
        this.MQChart = true
        this.yearsIndicator = false
        this.yearsChart = false
        this.htmlIndex = 'Кол-во санитарных машин, единиц'

        axios.get('http://localhost:8070/api/statistics/monitoring-sed/healthcare/years')
        .then(arrYears => {
            this.years = arrYears.data["Года мониторинга Здравохранения по месяцам"].sort()
            this.htmlYears = this.years[this.years.length - 1]
        })
        .catch(error => console.log(error))

        axios.get('http://localhost:8070/api/statistics/monitoring-sed/healthcare', {
            params: {
                year: this.htmlYears,
                byMonthes: true
            }
        })
        .then(arrMonths => {
            this.indicators = this.indicatorsByMonthes 
            this.allData = arrMonths.data
            this.updateStatistics(arrMonths, this.indicators)
        })
        .catch(error => console.log(error))
    },
    changeIndicator(i) {
        this.htmlIndex = i
        let key = this.indicators[this.htmlIndex]
        this.changeData = this.allData[key]
    },
    changeIndicatorToYears(i) {
        this.htmlIndex = i
        let key = this.indicators[this.htmlIndex]
        this.changeData = this.allData.map(d=>d[key])
    },
    changeYearByMonthes(year) {
        this.htmlYears = year
        console.log(year)
        axios.get('http://localhost:8070/api/statistics/monitoring-sed/healthcare', {
            params: {
                year: year,
                byMonthes: true
            }
        }).then(d => {
            this.indicators = this.indicatorsByMonthes
            this.updateStatistics(d, this.indicators)
        }).catch(err => console.log(err));
    },
    changeYearByQuarters(year) {
        this.htmlYears = year
        axios.get('http://localhost:8070/api/statistics/monitoring-sed/healthcare', {
            params: {
                year: year,
                byQuarters: true
            }
        }).then(d => {
            this.indicators = this.indicatorsByQuarters
            this.updateStatistics(d, this.indicators)
        }).catch(err => console.log(err));
    }
  },
  created() {
        axios.get('http://localhost:8070/api/statistics/monitoring-sed/healthcare/years')
        .then(arrYears => {
            this.years = arrYears.data["Года мониторинга Здравохранения по месяцам"]
        })
        .catch(error => console.log(error))

        axios.get('http://localhost:8070/api/statistics/monitoring-sed/healthcare', {
            params: {
                year: this.htmlYears,
                byMonthes: true
            }
        })
        .then(arrMonths => {            
            this.indicators = this.indicatorsByMonthes
            this.htmlIndex = 'Кол-во санитарных машин, единиц'
            this.updateStatistics(arrMonths, this.indicators)
            this.allData = arrMonths.data
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