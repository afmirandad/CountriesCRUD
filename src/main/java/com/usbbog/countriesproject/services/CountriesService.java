package com.usbbog.countriesproject.services;

import java.util.*;

import com.usbbog.countriesproject.entities.CountriesEntity;
import com.usbbog.countriesproject.repositories.CountriesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
@Service
public class CountriesService {

	@Autowired
	private CountriesRepository countriesRepository;

	public ResponseEntity<Map<String, Object>> getAllCountries() {
		Map<String, Object> response = new HashMap<>();
		List<CountriesEntity> paises = countriesRepository.findAll();
		response.put("Countries", paises);
		return new ResponseEntity<>(response, HttpStatus.OK);
	}

	public ResponseEntity<Map<String, Object>> getCountryById(UUID id) {
		Map<String, Object> response = new HashMap<>();
		Optional<CountriesEntity> countryFound = countriesRepository.findById(id);
		if (countryFound.isPresent()) {
			response.put("Country", countryFound.get());
			return new ResponseEntity<>(response, HttpStatus.OK);
		} else {
			response.put("Error", "Country not found");
			return new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
		}
	}

	public ResponseEntity<Map<String, Object>> createCountry(CountriesEntity country) {
		Map<String, Object> response = new HashMap<>();
		country.setId(UUID.randomUUID());
		if (countriesRepository.existsById(country.getId())) {
			response.put("Status", "Item already exists");
			return new ResponseEntity<>(response, HttpStatus.CONFLICT);
		} else {
			CountriesEntity newCountry = countriesRepository.save(country);
			response.put("Status", "Item inserted successfully");
			response.put("Country", newCountry);
			return new ResponseEntity<>(response, HttpStatus.CREATED);
		}
	}

	public ResponseEntity<Map<String, Object>> updateCountry(UUID id, CountriesEntity country) {
		Map<String, Object> response = new HashMap<>();
		Optional<CountriesEntity> countryFound = countriesRepository.findById(id);
		if (countryFound.isPresent()) {
			CountriesEntity existingCountry = countryFound.get();
			existingCountry.setCountryName(country.getCountryName());
			existingCountry.setCountryCapital(country.getCountryCapital());
			existingCountry.setCountryRegion(country.getCountryRegion());
			countriesRepository.save(existingCountry);
			response.put("Status", "Country updated successfully");
			response.put("UpdatedCountry", existingCountry);
			return new ResponseEntity<>(response, HttpStatus.OK);
		} else {
			response.put("Status", "Country not found");
			return new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
		}
	}

	public ResponseEntity<Map<String, Object>> deleteCountry(UUID id) {
		Map<String, Object> response = new HashMap<>();
		Optional<CountriesEntity> countryFound = countriesRepository.findById(id);
		if (countryFound.isPresent()) {
			countriesRepository.deleteById(id);
			response.put("Status", "Country deleted successfully");
			return new ResponseEntity<>(response, HttpStatus.OK);
		}else{
			response.put("Status", "Country not found");
			return new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
		}
	}
}