<script>
import { Bar } from "vue-chartjs";

export default {
  data(){
    return {
        options: {
            responsive: true,
            maintainAspectRatio: false,
            fill: false
        }
      }
    },
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
    mounted () {
    const {
        borderColor,
        pointBorderColor,
        pointBackgroundColor,
        backgroundColor
    } = this.chartColors;

        this.renderChart({
            labels: this.chartLabels,
            datasets: [
            {
                type: 'bar',
                label: this.label,
                data: this.chartData,
                backgroundColor: backgroundColor
            },
            {
                type: 'line',
                label: this.label,
                data: this.chartData,
                backgroundColor: "rgba(31, 31, 255, .4)"
            },
        ]
        }, this.options)
    }
}
</script>