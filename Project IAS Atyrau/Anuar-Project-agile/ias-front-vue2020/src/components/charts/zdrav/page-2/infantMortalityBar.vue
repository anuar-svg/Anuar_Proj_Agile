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
    const infantMortality = this.chartData.map(d => d.infantMortality);

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
            data: infantMortality,
            borderColor: borderColor,
            pointBorderColor: pointBorderColor,
            pointBackgroundColor: pointBackgroundColor,
            backgroundColor: 'rgba(85, 33, 97, .7)'
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
                data: Chart.defaults.global.labels = this.chartData.map(d => d.infantMortality),
                borderColor: borderColor,
                pointBorderColor: pointBorderColor,
                pointBackgroundColor: pointBackgroundColor,
                backgroundColor: Chart.defaults.global.backgroundColor = 'rgba(85, 33, 97, .7)'
            }
            ]
          }
      )
    }
  }
};
</script>
