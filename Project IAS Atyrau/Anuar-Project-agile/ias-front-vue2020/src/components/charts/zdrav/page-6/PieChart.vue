<script>
import { Pie } from "vue-chartjs";

export default {
  extends: Pie,
  props: {
    label: {
      type: String
    },
    chartData: {
    },
    chartDataTwo: {

    },
    chartLabels: {
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

    this.renderChart(
      {
        labels: this.chartLabels,
        datasets: [
          {
            label: this.label,
            data: this.chartData,
            borderColor: '#2ab7ca',
            backgroundColor: ['#fe4a49', '#2ab7ca']
          }
        ]
      }
    )
  },
  watch: {
    chartData(newData) {
        this.chartData = newData
        // console.log('watch:', newData)

        this.renderChart(
        {
            labels: this.chartLabels,
            datasets: [
            {
                label: this.label,
                data: this.chartData,
                borderColor: '#fe4a49',
                backgroundColor: ['#fe4a49', '#2ab7ca']
            }
            ]
          }
      )
    },
  }
};
</script>
