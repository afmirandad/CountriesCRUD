package com.usbbog.countriesproject.repositories;

import com.usbbog.countriesproject.entities.CountriesEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface CountriesRepository extends JpaRepository<CountriesEntity, UUID> {
}
