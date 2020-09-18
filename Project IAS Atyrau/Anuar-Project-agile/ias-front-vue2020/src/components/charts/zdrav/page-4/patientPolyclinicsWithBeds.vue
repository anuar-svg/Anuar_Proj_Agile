<script>
import { Bar } from "vue-chartjs";

Chart.defaults.global.legend.display = true;
Chart.defaults.global.defaultFontSize = 9
Chart.defaults.global.responsive = true;
Chart.defaults.global.maintainAspectRatio = true;

export default {
    extends: Bar,
    props: {
    label: {
        type: String
    },
    chartData: {
        type: Array
    },
    options: {
        type: Object
    },
    chartColors: {
        type: Object
    }
  },
  mounted() {
    // this.chartData.sort((a,b) => (a.year > b.year) ? 1 : ((b.year > a.year) ? -1 : 0));
    const regions = this.chartData.map(d => d.region === '' ? d.area : d.region);
    const hospitalOrganizationsWithBeds = this.chartData.map(d => d.patientPolyclinicsWithBeds);
    // console.log(this.chartData)

    const {
      borderColor,
      pointBorderColor,
      pointBackgroundColor,
      backgroundColor
    } = this.chartColors;

    this.renderChart(
      {
        labels: regions,
        datasets: [
          {
            label: this.label,
            data: hospitalOrganizationsWithBeds,
            borderColor: borderColor,
            pointBorderColor: pointBorderColor,
            pointBackgroundColor: pointBackgroundColor,
            backgroundColor: backgroundColor
          }
        ]
      }
    )
  },
  watch: {
    chartData(newData) {
        this.chartData = newData
        const {
            borderColor,
            pointBorderColor,
            pointBackgroundColor
            } = this.chartColors;

        this.renderChart(
        {
            labels: this.chartData.map(d => d.region === '' ? d.area : d.region),
            datasets: [
            {
                label: this.label,
                data: this.chartData.map(d => d.patientPolyclinicsWithBeds),
                borderColor: borderColor,
                pointBorderColor: pointBorderColor,
                pointBackgroundColor: pointBackgroundColor,
                backgroundColor: Chart.defaults.global.backgroundColor = 'rgba(1, 184, 170, .6)'
            }
            ]
          }
      )
    }
  }
};
</script>
