package com.example.demo.service;

import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.apache.ibatis.annotations.Select;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.domain.AgriculturalIndustryMonitoring;
import com.example.demo.domain.ArchitectureMonitoring;
import com.example.demo.domain.BudgetMonitoring;
import com.example.demo.domain.ConstructionMonitoring;
import com.example.demo.domain.ControlOverLandUseMonitoring;
import com.example.demo.domain.EconomicMonitoring;
import com.example.demo.domain.EconomicMonitoring2;
import com.example.demo.domain.EducationMonitoring;
import com.example.demo.domain.GovermentPurchases;
import com.example.demo.domain.HealthcareMonitoring;
import com.example.demo.domain.HealthcareMonitoring2;
import com.example.demo.domain.HealthcareMonitoring3;
import com.example.demo.domain.HealthcareMonitoringUnits;
import com.example.demo.domain.LandRelations;
import com.example.demo.domain.ReligionMonitoring;
import com.example.demo.domain.StateLaborInspectorate;
import com.example.demo.domain.TransportMonitoring;
import com.example.demo.domain.TransportMonitoring2;
import com.example.demo.domain.VeterenaryMonitoring;
import com.example.demo.repos.MonitoringMapper;

@Service
public class MonitoringService {

	@Autowired
	MonitoringMapper monitoringMapper;
	
	public HealthcareMonitoring getHealthcareMonitoringByYear(String year) {
		HealthcareMonitoring healthcareMonitoring = 
				monitoringMapper.getHealthcareMonitoringByYear(year);

		setMonthes(healthcareMonitoring);
		
		return healthcareMonitoring;
	}
	
	public Map<String, String[]> getHealthcareYears() {
		Map<String, String[]> years = new HashMap<>();
		
		years.put("Года мониторинга Здравохранения по месяцам", monitoringMapper.getMonthHealthcareYears());
		years.put("Года мониторинга Здравохранения по кварталам", monitoringMapper.getQuarterHealthcareYears());
		
		return years;
	}
	
	public HealthcareMonitoring2 getHealthcareMonitoringByQuartersOfYear(String year) {
		HealthcareMonitoring2 healthcareMonitoring2 = 
				monitoringMapper.getHealthcareMonitoring2ByYear(year);

		setQuarters(healthcareMonitoring2);
		
		return healthcareMonitoring2;
	}
	
	public List<HealthcareMonitoring3> getHealthcareMonitoring3() {
		return monitoringMapper.getHealthcareMonitoring3();
	}
	
	public List<BudgetMonitoring> getBudgetMonitoring() {
		return monitoringMapper.getBudgetMonitoring();
	}

	public List<LandRelations> getLandRelations() {
		return monitoringMapper.getLandRelations();
	}
	

	public List<ArchitectureMonitoring> getArchitectureByYear(String year) {
		return monitoringMapper.getArchitectureByYear(year);
	}
	
	public List<String> getArchitectureYears() {
		return monitoringMapper.getArchitectureYears();
	}
	
	public List<GovermentPurchases> getGovermentPurchasesByYear(String year) {
		return monitoringMapper.getGovermentPurchasesByYear(year);
	}
	
	public List<String> getGovermentPurchasesYears() {
		return monitoringMapper.getGovermentPurchasesYears();
	}
	
	public List<ConstructionMonitoring> getConstructionsByYear(String year) {
		return monitoringMapper.getConstructionsByYear(year);
	}
	
	public HealthcareMonitoringUnits getHealthcareMonitoringUnits() {
		return monitoringMapper.getHealthcareMonitoringUnits();
	}

	public List<String> getConstructionYears() {
		return monitoringMapper.getConstructionYears();
	}
	
	public List<StateLaborInspectorate> getStateLaborInspectorateByYear(String year) {
		return monitoringMapper.getStateLaborInspectorateByYear(year);
	}
	
	public List<String> getStateLaborInspectorateYears() {
		return monitoringMapper.getStateLaborInspectorateYears();
	}
	
	public List<EducationMonitoring> getEducationStatistics() {
		return monitoringMapper.getEducationStatistics();
	}
	
	public List<ReligionMonitoring> getReligionByYear(String year) {
		return monitoringMapper.getReligionByYear(year);
	}
	
	public List<String> getReligionYears() {
		return monitoringMapper.getReligionYears();
	}
	
	public List<ControlOverLandUseMonitoring> getControlOverLandUseMonitoringByYear(String year) {
		return monitoringMapper.getControlOverLandUseMonitoringByYear(year);
	}
	
	public List<String> getControlOverLandUseMonitoringYears() {
		return monitoringMapper.getControlOverLandUseMonitoringYears();
	}
	
	public List<EconomicMonitoring> getEconomicMonthesByYear(String year) {
		return monitoringMapper.getEconomicMonthesByYear(year);
	}
	
	public List<EconomicMonitoring2> getEconomicQuartersByYear(String year) {
		return monitoringMapper.getEconomicQuartersByYear(year);
	}
	
	public Map<String, List<String>> geteconomicYears() {
		Map<String, List<String>>  years = new HashMap<>();
		
		years.put("Года ежемесячной экономики", monitoringMapper.getYearsOfEconomicMonthes());
		years.put("Года ежеквартальной экономики", monitoringMapper.getYearsOfEconomicQuarters());
		
		return years;
	}
	
	public List<TransportMonitoring> getTransportMonthesByYear(String year) {
		return monitoringMapper.getTransportMonthesByYear(year);
	}
	
	public List<String> getTransportYears() {
		return monitoringMapper.getTransportYears();
	}
	
	public List<TransportMonitoring2> getTransportsByYears() {
		return monitoringMapper.getTransportsByYears();
	}
	
	public List<AgriculturalIndustryMonitoring> getAgriculturalIndustryByYear(String year) {
		return monitoringMapper.getAgriculturalIndustryByYear(year);
	}
	
	public List<String> getAgriculturalIndustryYears() {
		return monitoringMapper.getAgriculturalIndustryYears();
	}
	
	public List<VeterenaryMonitoring> getVeterenaryByYear(String year) {
		return monitoringMapper.getVeterenaryByYear(year);
	}
	
	public List<String> getVeterenaryYears() {
		return monitoringMapper.getVeterenaryYears();
	}

	private void setMonthes(HealthcareMonitoring healthcareMonitoring) {
		String[] monthes = {"Январь", "Февраль", "Март", "Апрель", "Май", "Июнь", 
					"Июль", "Август", "Сентябрь", "Октябрь", "Ноябрь", "Декабрь"};
				
		List<Method> getters = new ArrayList<>();
		
		try {
			for(PropertyDescriptor propertyDescriptor : 
			    Introspector.getBeanInfo(healthcareMonitoring.getClass(), Object.class).getPropertyDescriptors()) {
				Method getter = propertyDescriptor.getReadMethod();
				String fullGetterName = getter.toString();
				String getterName = getter.toString().substring(fullGetterName.lastIndexOf(".") + 1);
				
				if (!getterName.equals("getYear()")) {
					getters.add(getter);
				}
			}
		} catch (IntrospectionException e1) {
			e1.printStackTrace();
		}
		
		for (String m : monthes) {
			String strValues = monitoringMapper.getHealthcareValuesByYearAndMonth(healthcareMonitoring.getYear(), m);
			
			List<Integer> values = convertStringToArray(strValues, Integer.class);
			
			for (int i = 0; i < getters.size(); i++) {
				Method getter = getters.get(i);
				
				try {
					Map<String, Integer> field = (Map<String, Integer>) getter.invoke(healthcareMonitoring);
					field.put(m, values.get(i));
				} catch (SecurityException | IllegalAccessException | 
						IllegalArgumentException | InvocationTargetException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	private void setQuarters(HealthcareMonitoring2 healthcareMonitoring2) {
		String[] quarters = {"I квартал", "II квартал", "III квартал", "IV квартал"};
		
		List<Method> getters = new ArrayList<>();
		
		try {
			for(PropertyDescriptor propertyDescriptor : 
			    Introspector.getBeanInfo(healthcareMonitoring2.getClass(), Object.class).getPropertyDescriptors()) {
				Method getter = propertyDescriptor.getReadMethod();
				String fullGetterName = getter.toString();
				String getterName = getter.toString().substring(fullGetterName.lastIndexOf(".") + 1);
				
				if (!getterName.equals("getYear()")) {
					getters.add(getter);
				}
			}
		} catch (IntrospectionException e1) {
			e1.printStackTrace();
		}
		
		for (String q : quarters) {
			String strValues = monitoringMapper.getHealthcareValuesByYearAndQuarter(healthcareMonitoring2.getYear(), q);
			
			List<Double> values = convertStringToArray(strValues, Double.class);

			for (int i = 0; i < getters.size(); i++) {
				Method getter = getters.get(i);
				
				try {
					Map<String, Double> field = (Map<String, Double>) getter.invoke(healthcareMonitoring2);
					field.put(q, values.get(i));
				} catch (SecurityException | IllegalAccessException | 
						IllegalArgumentException | InvocationTargetException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	private <T> List<T> convertStringToArray(String str, Class<T> cls) {
		String[] strValues = str.substring(1, str.length()-1)
				.replaceAll("\"", "")
				.split(",");
		
		List<T> newValues = Arrays.asList(strValues)
				.stream()
				.map(n -> {
					try {
						Method method = cls.getDeclaredMethod("valueOf", String.class);
						return n.equals("NULL") ? null : (T) method.invoke(null, n);
					} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException
							| NoSuchMethodException | SecurityException e) {
						e.printStackTrace();
					}
					
					return (T) n;
				})
				.collect(Collectors.toList());
		
		return newValues;
	}

}
