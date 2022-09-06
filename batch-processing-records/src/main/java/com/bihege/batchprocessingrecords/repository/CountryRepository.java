package com.bihege.batchprocessingrecords.repository;

import com.bihege.batchprocessingrecords.entity.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Integer> {

}
