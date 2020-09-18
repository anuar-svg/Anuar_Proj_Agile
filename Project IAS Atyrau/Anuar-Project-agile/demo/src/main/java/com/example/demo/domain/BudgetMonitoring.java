package com.example.demo.domain;

public class BudgetMonitoring {

	private String year;
	private String area;
	
	private String budgetExecution; // o_budget_execution | Исполнение бюджета
	private String budgetExecutionUnit; // o_unit | %
	
	private String disbursementOfRepublicanBudget; // o_development_means_rb | Освоение средств республиканского бюджета
	private String disbursementOfRepublicanBudgetUnit; // o_unit_a | %
	
	private String disbursementOfLocalBudget; // o_development_means_mb | Освоение средств местного бюджета
	private String disbursementOfLocalBudgetUnit; // o_unit_b | %

	private String regionalBudget; // o_volume_budget_region | Обьем бюджета области
	private String regionalBudgetUnit; // o_unit_c | тыс. тенге
	
	private String developmentBudget; // o_development_budget | Бюджет развития
	private String developmentBudgetUnit; // o_unit_d | тыс. тенге
	
	private String currentBudget; // o_current_budget | Текущий бюджет
	private String currentBudgetUnit; // o_unit_e | тыс. тенге
	
	public BudgetMonitoring() {
	
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getBudgetExecution() {
		return budgetExecution;
	}

	public void setBudgetExecution(String budgetExecution) {
		this.budgetExecution = budgetExecution;
	}

	public String getBudgetExecutionUnit() {
		return budgetExecutionUnit;
	}

	public void setBudgetExecutionUnit(String budgetExecutionUnit) {
		this.budgetExecutionUnit = budgetExecutionUnit;
	}

	public String getDisbursementOfRepublicanBudget() {
		return disbursementOfRepublicanBudget;
	}

	public void setDisbursementOfRepublicanBudget(String disbursementOfRepublicanBudget) {
		this.disbursementOfRepublicanBudget = disbursementOfRepublicanBudget;
	}

	public String getDisbursementOfRepublicanBudgetUnit() {
		return disbursementOfRepublicanBudgetUnit;
	}

	public void setDisbursementOfRepublicanBudgetUnit(String disbursementOfRepublicanBudgetUnit) {
		this.disbursementOfRepublicanBudgetUnit = disbursementOfRepublicanBudgetUnit;
	}

	public String getDisbursementOfLocalBudget() {
		return disbursementOfLocalBudget;
	}

	public void setDisbursementOfLocalBudget(String disbursementOfLocalBudget) {
		this.disbursementOfLocalBudget = disbursementOfLocalBudget;
	}

	public String getDisbursementOfLocalBudgetUnit() {
		return disbursementOfLocalBudgetUnit;
	}

	public void setDisbursementOfLocalBudgetUnit(String disbursementOfLocalBudgetUnit) {
		this.disbursementOfLocalBudgetUnit = disbursementOfLocalBudgetUnit;
	}

	public String getRegionalBudget() {
		return regionalBudget;
	}

	public void setRegionalBudget(String regionalBudget) {
		this.regionalBudget = regionalBudget;
	}

	public String getRegionalBudgetUnit() {
		return regionalBudgetUnit;
	}

	public void setRegionalBudgetUnit(String regionalBudgetUnit) {
		this.regionalBudgetUnit = regionalBudgetUnit;
	}

	public String getDevelopmentBudget() {
		return developmentBudget;
	}

	public void setDevelopmentBudget(String developmentBudget) {
		this.developmentBudget = developmentBudget;
	}

	public String getDevelopmentBudgetUnit() {
		return developmentBudgetUnit;
	}

	public void setDevelopmentBudgetUnit(String developmentBudgetUnit) {
		this.developmentBudgetUnit = developmentBudgetUnit;
	}

	public String getCurrentBudget() {
		return currentBudget;
	}

	public void setCurrentBudget(String currentBudget) {
		this.currentBudget = currentBudget;
	}

	public String getCurrentBudgetUnit() {
		return currentBudgetUnit;
	}

	public void setCurrentBudgetUnit(String currentBudgetUnit) {
		this.currentBudgetUnit = currentBudgetUnit;
	}
	
}
