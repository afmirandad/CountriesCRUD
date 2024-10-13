package com.usbbog.countriesproject.entities;

import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class CountriesEntity {

	@Id
	private UUID id;
	private String countryName;
	private String countryCapital;
	private String countryRegion;

	@PrePersist
	public void generateUUID() {
		if (id == null) {
			id = UUID.randomUUID();
		}
	}
}
