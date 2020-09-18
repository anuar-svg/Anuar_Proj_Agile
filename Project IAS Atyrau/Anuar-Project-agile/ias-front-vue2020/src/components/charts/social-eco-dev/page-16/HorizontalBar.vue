<script>
import { Bar } from "vue-chartjs";

export default {
  extends: Bar,
  props: {
    label: {
      type: String
    },
    chartData: {
    },
    chartLabels: {
      type: Array
    },
    // options: {
    //   type: Object
    // },
    chartColors: {
      type: Object
    },
    options: {
      scaleBeginAtZero: false,
      responsive: true,
      scaleStartValue : -100
  //   scales: {
  //   yAxes: [
  //     {
  //       stacked: true,
  //       ticks: {
  //         suggestedMax: 100,
  //         suggestedMin: -10
  //       }
  //     }
  //   ]
  // }
    },
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
            backgroundColor: backgroundColor
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
                backgroundColor: backgroundColor
            }
          ],
          options: {
            scaleBeginAtZero: false,
            responsive: true,
            scaleStartValue : -100
          }
        }
      )
    }
  }
};
</script>
