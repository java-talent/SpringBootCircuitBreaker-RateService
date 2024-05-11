package com.javatalent.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javatalent.entity.Rate;
import com.javatalent.repo.RateRepository;

@Service
public class RateService {

    @Autowired
    private RateRepository repository;

    public Rate getRateByType(String type) {
        return repository.findByType(type).orElseThrow(() -> new RuntimeException("Rate Not Found: " + type));
    }
}