package com.masivianTest.roulettetest.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.masivianTest.roulettetest.model.Roulette;
@Repository
public interface RouletteRepository extends CrudRepository<Roulette, String> {
}
