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
    options: {
      type: Object
    },
    chartColors: {
      type: Object
    }
  },
  mounted() {
    const regions = this.chartData.map(d => d.region === '' ? d.area : d.region);
    const polyclinic = this.chartData.map(d => d.hospitalOrganizationsWithBeds);

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
            data: polyclinic,
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
                data: this.chartData.map(d => d.hospitalOrganizationsWithBeds),
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
