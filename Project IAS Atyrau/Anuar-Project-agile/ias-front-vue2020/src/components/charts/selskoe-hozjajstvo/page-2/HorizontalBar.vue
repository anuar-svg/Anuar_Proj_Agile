<script>
import { Line } from "vue-chartjs";

export default {
  extends: Line,
  props: {
    label: {
      type: String
    },
    chartData: {
      type: Array
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
    const {
      borderColor,
      pointBorderColor,
      pointBackgroundColor,
      backgroundColor
    } = this.chartColors;

    this.renderChart(
      {
        labels: this.chartLabels,
        datasets: [
          {
            label: this.label,
            data: this.chartData,
            borderColor: borderColor,
            pointBorderColor: pointBorderColor,
            pointBackgroundColor: pointBackgroundColor,
            backgroundColor: "rgba(254, 31, 31, .4)"
          },
          {
            label: this.label,
            data: [2322, 5000, 3211, 2322, 5000, 3211, 2322, 5000],
            borderColor: borderColor,
            pointBorderColor: pointBorderColor,
            pointBackgroundColor: pointBackgroundColor,
            backgroundColor: "rgba(31, 31, 255, .2)"
          },
          {
            data: [7000, 7000, 7000, 7000, 7000, 7000, 7000, 7000],
            borderColor: borderColor,
            pointBorderColor: pointBorderColor,
            pointBackgroundColor: pointBackgroundColor,
            backgroundColor: "rgba(31, 255, 23, .2)"
          },
          {
            data: [11000, 15000, 10000, 16220, 5000, 11500, 2322, 5000],
            borderColor: borderColor,
            pointBorderColor: pointBorderColor,
            pointBackgroundColor: pointBackgroundColor,
            backgroundColor: "rgba(255, 255, 40, .2)"
          },
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
            labels: this.chartLabels,
            datasets: [
            {
                label: this.label,
                data: this.chartData,
                borderColor: borderColor,
                pointBorderColor: pointBorderColor,
                pointBackgroundColor: pointBackgroundColor,
                backgroundColor: 'yellow'
            }
            ]
          }
      )
    }
  }
};
</script>
