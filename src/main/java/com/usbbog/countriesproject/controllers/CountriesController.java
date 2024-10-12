package com.usbbog.countriesproject.controllers;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;

import com.usbbog.countriesproject.services.CountriesService;
import com.usbbog.countriesproject.entities.CountriesEntity;

@RestController
@RequestMapping("/api/v1/countries")
public class CountriesController {
	
	private final CountriesService countryService;
	
	@Autowired
	public CountriesController(CountriesService countryService) {
		this.countryService = countryService;
	}
	
	//Method to get all countries
	@GetMapping
	public List<CountriesEntity> getCountries(){
		return countryService.getAllCountries();
	}
	
	@GetMapping("/{id}")
	//Method to get one country by id
	public Optional<CountriesEntity> getCountry(@PathVariable UUID id){
		return countryService.getCountryById(id);
	}
	
	@PostMapping
	//Method to create one country
	public String createCountry(){
		return "POST COUNTRY";
	}
	
	@PutMapping("/{id}")
	//Method to update one country
	public String updateCountry(){
		return "PUT COUNTRY";
	}
	
	@DeleteMapping("/{id}")
	//Method to delete one country
	public String deleteCountry(){
		return "DELETE COUNTRY";
	}
}
