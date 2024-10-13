package com.usbbog.countriesproject.controllers;

import java.util.Map;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.usbbog.countriesproject.services.CountriesService;
import com.usbbog.countriesproject.entities.CountriesEntity;

@RestController
@RequestMapping("/api/v1/countries")
public class CountriesController {

	@Autowired
	private CountriesService countriesService;
	
	//Method to get all countries
	@GetMapping
	public ResponseEntity<Map<String, Object>> getAllCountries() {
		return countriesService.getAllCountries();
	}
	
	@GetMapping("/{id}")
	//Method to get one country by id
	public ResponseEntity<?> getCountry(@PathVariable UUID id){
		return countriesService.getCountryById(id);
	}
	
	@PostMapping
	//Method to create one country
	public ResponseEntity<?> createCountry(@RequestBody CountriesEntity country){
		return countriesService.createCountry(country);
	}
	
	@PutMapping("/{id}")
	//Method to update one country
	public ResponseEntity<Map<String, Object>> updateCountry(
			@PathVariable UUID id, @RequestBody CountriesEntity country) {
		return countriesService.updateCountry(id, country);
	}
	
	@DeleteMapping("/{id}")
	//Method to delete one country
	public ResponseEntity<Map<String, Object>> deleteCountry(@PathVariable UUID id){
		return countriesService.deleteCountry(id);
	}
}
