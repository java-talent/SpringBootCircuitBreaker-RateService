package com.javatalent.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.javatalent.entity.Rate;

@Repository
public interface RateRepository extends JpaRepository<Rate, Integer> {
    Optional<Rate> findByType(String type);
}