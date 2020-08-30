package com.masivianTest.roulettetest.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import com.masivianTest.roulettetest.model.Bet;
import com.masivianTest.roulettetest.service.RouletteService;

import java.util.List;
import java.util.Map;
@RestController
@RequestMapping("roulette")
public class RouletteController {
    @Autowired
    private RouletteService rouletteService;
    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public Map<String, Boolean> getAllRoulettes() {
        return rouletteService.getAll();
    }
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public String createRoulette() {
        return rouletteService.post();
    }
    @PutMapping("{roulette-id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public String openingRoulette(@PathVariable("roulette-id") String rouletteId) {
        return rouletteService.openingRoulette(rouletteId);
    }
    @PostMapping("bet/{roulette-id}")
    @ResponseStatus(HttpStatus.CREATED)
    public void bet(@RequestHeader("user-id") String userId, @RequestBody Bet bet, @PathVariable("roulette-id") String rouletteId) {
        bet.setUserId(userId);
        rouletteService.bet(bet, rouletteId);
    }
    @GetMapping("close-roulette/{roulette-id}")
    public List<Bet> closeRoulette(@PathVariable("roulette-id") String rouletteId) {
        return rouletteService.closeRoulette(rouletteId);
    }
   
}
