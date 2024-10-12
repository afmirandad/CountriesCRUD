package com.usbbog.countriesproject.entities;

import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@AllArgsConstructor
@Getter
@Setter
public class CountriesEntity {
	private UUID id;
	private String countryName;
	private String countryCapital;
	private String countryRegion;
	
	public CountriesEntity(UUID id, String countryName, String countryCapital, String countryRegion) {
		this.id = id;
		this.countryName = countryName;
		this.countryCapital = countryCapital;
		this.countryRegion = countryRegion;
	}

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public String getCountryCapital() {
		return countryCapital;
	}

	public void setCountryCapital(String countryCapital) {
		this.countryCapital = countryCapital;
	}

	public String getCountryRegion() {
		return countryRegion;
	}

	public void setCountryRegion(String countryRegion) {
		this.countryRegion = countryRegion;
	}

}
