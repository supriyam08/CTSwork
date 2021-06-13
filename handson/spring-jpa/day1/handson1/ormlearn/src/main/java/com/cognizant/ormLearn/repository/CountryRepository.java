package com.cognizant.ormLearn.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cognizant.ormLearn.model.Country;

public interface CountryRepository extends JpaRepository<Country, String> {

}
