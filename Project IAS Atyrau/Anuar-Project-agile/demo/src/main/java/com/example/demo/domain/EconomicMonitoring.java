package com.example.demo.domain;

public class EconomicMonitoring {

	private String year;
	private String month;
	private String area;
	
	private Double consumerPriceIndex; // o_consumer_price_index | Индекс потребительских цен
	private Double consumerPriceIndexArticleOfFood; // o_consumer_price_index_c | Индекс потребительских цен (продовольственные товары)
	private Double consumerPriceIndexNonFood; // o_consumer_price_index_a | Индекс потребительских цен (непродовольственные товары)
	private Double consumerPriceIndexNonFoodPaidService; // o_consumer_price_index_b | Индекс потребительских цен (платные услуги)
	
	private Double receiptOfTaxesAndOtherPayments; // o_tax_receipts | Поступление налогов и других платежей
	private Double forecastOfRB; // o_the_forecast_rb | % к прогнозу РБ
	private Double forecastOfMB; // o_the_forecast_mb | % к прогнозу МБ
	private Double nationalFund; // o_national_fund | Национальный фонд
	private Double taxRevenue; // o_tax_revenue | Налоговые поступления
	private Double NonTaxReceipts; // o_nontax_revenue | Неналоговые поступления
	private Double proceedsFromTheSale; // o_proceeds_fromsale | Поступления от продажи 
	private Double growthOfTaxAndNonTaxRevenues; // o_growth_tax_nontaxrevenues | Рост налоговых и ненологовых поступлений
	private Double worldPriceOfOil; // o_world_price_oil | Мировая цена на нефть
	private Double RB; // o_rb | РБ
	private Double MB; // o_mb | МБ
	
	public EconomicMonitoring() {
	
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public Double getConsumerPriceIndex() {
		return consumerPriceIndex;
	}

	public void setConsumerPriceIndex(Double consumerPriceIndex) {
		this.consumerPriceIndex = consumerPriceIndex;
	}

	public Double getConsumerPriceIndexArticleOfFood() {
		return consumerPriceIndexArticleOfFood;
	}

	public void setConsumerPriceIndexArticleOfFood(Double consumerPriceIndexArticleOfFood) {
		this.consumerPriceIndexArticleOfFood = consumerPriceIndexArticleOfFood;
	}

	public Double getConsumerPriceIndexNonFood() {
		return consumerPriceIndexNonFood;
	}

	public void setConsumerPriceIndexNonFood(Double consumerPriceIndexNonFood) {
		this.consumerPriceIndexNonFood = consumerPriceIndexNonFood;
	}

	public Double getConsumerPriceIndexNonFoodPaidService() {
		return consumerPriceIndexNonFoodPaidService;
	}

	public void setConsumerPriceIndexNonFoodPaidService(Double consumerPriceIndexNonFoodPaidService) {
		this.consumerPriceIndexNonFoodPaidService = consumerPriceIndexNonFoodPaidService;
	}

	public Double getReceiptOfTaxesAndOtherPayments() {
		return receiptOfTaxesAndOtherPayments;
	}

	public void setReceiptOfTaxesAndOtherPayments(Double receiptOfTaxesAndOtherPayments) {
		this.receiptOfTaxesAndOtherPayments = receiptOfTaxesAndOtherPayments;
	}

	public Double getForecastOfRB() {
		return forecastOfRB;
	}

	public void setForecastOfRB(Double forecastOfRB) {
		this.forecastOfRB = forecastOfRB;
	}

	public Double getForecastOfMB() {
		return forecastOfMB;
	}

	public void setForecastOfMB(Double forecastOfMB) {
		this.forecastOfMB = forecastOfMB;
	}

	public Double getNationalFund() {
		return nationalFund;
	}

	public void setNationalFund(Double nationalFund) {
		this.nationalFund = nationalFund;
	}

	public Double getTaxRevenue() {
		return taxRevenue;
	}

	public void setTaxRevenue(Double taxRevenue) {
		this.taxRevenue = taxRevenue;
	}

	public Double getNonTaxReceipts() {
		return NonTaxReceipts;
	}

	public void setNonTaxReceipts(Double nonTaxReceipts) {
		NonTaxReceipts = nonTaxReceipts;
	}

	public Double getProceedsFromTheSale() {
		return proceedsFromTheSale;
	}

	public void setProceedsFromTheSale(Double proceedsFromTheSale) {
		this.proceedsFromTheSale = proceedsFromTheSale;
	}

	public Double getGrowthOfTaxAndNonTaxRevenues() {
		return growthOfTaxAndNonTaxRevenues;
	}

	public void setGrowthOfTaxAndNonTaxRevenues(Double growthOfTaxAndNonTaxRevenues) {
		this.growthOfTaxAndNonTaxRevenues = growthOfTaxAndNonTaxRevenues;
	}

	public Double getWorldPriceOfOil() {
		return worldPriceOfOil;
	}

	public void setWorldPriceOfOil(Double worldPriceOfOil) {
		this.worldPriceOfOil = worldPriceOfOil;
	}

	public Double getRB() {
		return RB;
	}

	public void setRB(Double rB) {
		RB = rB;
	}

	public Double getMB() {
		return MB;
	}

	public void setMB(Double mB) {
		MB = mB;
	}
	
}
