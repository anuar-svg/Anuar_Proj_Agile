<script>
import { Bar } from "vue-chartjs";

export default {
  extends: Bar,
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
      pointBackgroundColor
    } = this.chartColors;


    this.renderChart(
      {
        labels: this.chartLabels,
        datasets: [
          {
            stack: 'Stack 1',
            label: this.label,
            data: this.chartData,
            borderColor: borderColor,
            pointBorderColor: pointBorderColor,
            pointBackgroundColor: pointBackgroundColor,
            backgroundColor: "tomato"
          },
          {
              label: 'Orange',
              stack: 'Stack 0',
              data: [0, 300, 1520],
              backgroundColor: 'orange',                          
          },
          {
              label: 'Yellow',
              data: [1500, 700, 200],
              stack: 'Stack 1',
              backgroundColor: 'yellow',                          
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
            labels: this.chartLabels,
            datasets: [
              {
                stack: 'Stack 1',
                label: this.label,
                data: this.chartData,
                borderColor: borderColor,
                pointBorderColor: pointBorderColor,
                pointBackgroundColor: pointBackgroundColor,
                backgroundColor: "tomato"
              },
              {
                  label: 'Orange',
                  stack: 'Stack 0',
                  data: [0, 300, 1520],
                  backgroundColor: 'orange',                          
              },
              {
                  label: 'Yellow',
                  data: [1500, 700, 200],
                  stack: 'Stack 1',
                  backgroundColor: 'yellow',                          
              }
            ],
            options: {
                scales: {
                    yAxes: [{
                        ticks: {
                            beginAtZero: true
                        }
                    }]
                }
            }
          }
      )
    }
  }
};
</script>
