package com.usbbog.countriesproject.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.stereotype.Service;
import com.usbbog.countriesproject.entities.CountriesEntity;

@Service
public class CountriesService {
	private List<CountriesEntity> paises;
	
	public CountriesService() {
		paises = new ArrayList<>();
		paises.add(new CountriesEntity(UUID.randomUUID(), "Qatar", "Doha", "Asia"));
		paises.add(new CountriesEntity(UUID.randomUUID(), "Ecuador", "Quito", "America del Sur"));
		paises.add(new CountriesEntity(UUID.randomUUID(), "Senegal", "Dakar", "Africa"));
		paises.add(new CountriesEntity(UUID.randomUUID(), "Países Bajos", "Ámsterdam", "Europa"));
		paises.add(new CountriesEntity(UUID.randomUUID(), "Inglaterra", "Londres", "Europa"));
		paises.add(new CountriesEntity(UUID.randomUUID(), "Irán", "Teherán", "Asia"));
		paises.add(new CountriesEntity(UUID.randomUUID(), "Estados Unidos", "Washington D.C.", "America del Norte"));
		paises.add(new CountriesEntity(UUID.randomUUID(), "Gales", "Cardiff", "Europa"));
		paises.add(new CountriesEntity(UUID.randomUUID(), "Argentina", "Buenos Aires", "America del Sur"));
		paises.add(new CountriesEntity(UUID.randomUUID(), "Arabia Saudita", "Riad", "Asia"));
		paises.add(new CountriesEntity(UUID.randomUUID(), "México", "Ciudad de México", "America del Norte"));
		paises.add(new CountriesEntity(UUID.randomUUID(), "Polonia", "Varsovia", "Europa"));
		paises.add(new CountriesEntity(UUID.randomUUID(), "Francia", "París", "Europa"));
		paises.add(new CountriesEntity(UUID.randomUUID(), "Australia", "Camberra", "Oceanía"));
		paises.add(new CountriesEntity(UUID.randomUUID(), "Dinamarca", "Copenhague", "Europa"));
		paises.add(new CountriesEntity(UUID.randomUUID(), "Túnez", "Túnez", "Africa"));
		paises.add(new CountriesEntity(UUID.randomUUID(), "España", "Madrid", "Europa"));
		paises.add(new CountriesEntity(UUID.randomUUID(), "Costa Rica", "San José", "America Central"));
		paises.add(new CountriesEntity(UUID.randomUUID(), "Alemania", "Berlín", "Europa"));
		paises.add(new CountriesEntity(UUID.randomUUID(), "Japón", "Tokio", "Asia"));
		paises.add(new CountriesEntity(UUID.randomUUID(), "Bélgica", "Bruselas", "Europa"));
		paises.add(new CountriesEntity(UUID.randomUUID(), "Canadá", "Ottawa", "America del Norte"));
		paises.add(new CountriesEntity(UUID.randomUUID(), "Croacia", "Zagreb", "Europa"));
		paises.add(new CountriesEntity(UUID.randomUUID(), "Brasil", "Brasilia", "America del Sur"));
		paises.add(new CountriesEntity(UUID.randomUUID(), "Portugal", "Lisboa", "Europa"));
		paises.add(new CountriesEntity(UUID.randomUUID(), "Ghana", "Acra", "Africa"));
		paises.add(new CountriesEntity(UUID.randomUUID(), "Uruguay", "Montevideo", "America del Sur"));
		paises.add(new CountriesEntity(UUID.randomUUID(), "Corea del Sur", "Seúl", "Asia"));
		paises.add(new CountriesEntity(UUID.randomUUID(), "Suiza", "Berna", "Europa"));
		paises.add(new CountriesEntity(UUID.randomUUID(), "Camerún", "Yaundé", "Africa"));
		paises.add(new CountriesEntity(UUID.randomUUID(), "Serbia", "Belgrado", "Europa"));
		paises.add(new CountriesEntity(UUID.randomUUID(), "Marruecos", "Rabat", "Africa"));

	}
	
	public List<CountriesEntity> getAllCountries(){
		return paises;
	}
	
	public Optional<CountriesEntity> getCountryById(UUID id){
		return paises.stream().filter(country -> country.getId().equals(id)).findFirst();
	}
	
	public List<> createCountry(){
		
	}
	
	public List<> updateCountry(){
		
	}
	
	public List<> deleteCountry(){
		
	}
}
