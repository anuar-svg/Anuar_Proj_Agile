<script>
import { Line } from "vue-chartjs";

export default {
  extends: Line,
  props: {
    label: {
      type: String
    },
    chartData: {
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
    // const years = this.chartData.map(d => d.year);
    // const expectancy = this.chartData.map(d => d.lifeExpectancy);
    // console.log(this.chartData)

    const {
      borderColor,
      pointBorderColor,
      pointBackgroundColor,
      backgroundColor
    } = this.chartColors;

    const regions = this.chartData['regions'];

    this.renderChart(
      {
        labels: regions,
        datasets: [
          {
            label: this.label,
            data: this.chartData['ills'],
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
            labels: Chart.defaults.global.labels = this.chartData['regions'],
            datasets: [
            {
                label: this.label,
                data: Chart.defaults.global.labels = this.chartData['ills'],
                borderColor: borderColor,
                pointBorderColor: pointBorderColor,
                pointBackgroundColor: pointBackgroundColor,
                backgroundColor: Chart.defaults.global.backgroundColor = 'rgb(1, 184, 170)'
            }
            ]
          }
      )
    },
  }
};

</script>
