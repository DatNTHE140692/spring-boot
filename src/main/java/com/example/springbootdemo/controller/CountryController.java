package com.example.springbootdemo.controller;

import com.example.springbootdemo.entity.Country;
import com.example.springbootdemo.service.CountryService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.Serializable;
import java.util.List;

@RestController
@RequestMapping("/country")
@RequiredArgsConstructor
public class CountryController implements Serializable {
    private static final long serialVersionUID = 1L;
    private final CountryService countryService;

    @GetMapping("/all")
    public List<Country> getCountries() {
        return countryService.getCountries();
    }
}
