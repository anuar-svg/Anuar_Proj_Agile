<script>
import { Line } from "vue-chartjs";
import ChartJsPluginDataLabels from 'chartjs-plugin-datalabels'
Chart.helpers.merge(Chart.defaults.global.plugins.datalabels, {
    color: 'black',
    anchor: 'end',
    align: 'end',
    labels: {
      title: {
          font: {
              weight: 'bold'
          }
      },
    }
});

export default {
  plugins: [ChartJsPluginDataLabels],
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
            backgroundColor: backgroundColor
          }
        ],
        options: {
                scales: {
                    xAxes: [{
                        ticks: {
                            min: 0
                        }
                    }]
                }
            }
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
                scales: {
                    xAxes: [{
                        ticks: {
                            min: 0
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
