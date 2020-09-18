<script>
import { HorizontalBar } from "vue-chartjs";

export default {
  extends: HorizontalBar,
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
    const regions = this.chartData.map(d => d.region === '' ? d.area : d.region);
    const patientPolyclinicHelp = this.chartData.map(d => d.patientPolyclinicHelp);

    const {
      borderColor,
      pointBorderColor,
      pointBackgroundColor
    } = this.chartColors;

    this.renderChart(
      {
        labels: regions,
        datasets: [
          {
            label: this.label,
            data: patientPolyclinicHelp,
            borderColor: borderColor,
            pointBorderColor: pointBorderColor,
            pointBackgroundColor: pointBackgroundColor,
            backgroundColor: 'rgb(1, 184, 170'
          }
        ],
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
            labels: Chart.defaults.global.labels = this.chartData.map(d => d.region === '' ? d.area : d.region),
            datasets: [
            {
                label: this.label,
                data: Chart.defaults.global.labels = this.chartData.map(d => d.patientPolyclinicHelp),
                borderColor: borderColor,
                pointBorderColor: pointBorderColor,
                pointBackgroundColor: pointBackgroundColor,
                backgroundColor: Chart.defaults.global.backgroundColor = 'rgb(1, 184, 170'
            }
            ]
          }
      )
    }
  }
};
</script>
