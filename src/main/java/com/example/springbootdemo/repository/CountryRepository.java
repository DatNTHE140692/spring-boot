package com.example.springbootdemo.repository;

import com.example.springbootdemo.entity.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Integer> {

}
