package com.controle_ponto.controller;

import com.controle_ponto.model.BancoHoras;
import com.controle_ponto.service.BancoHorasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/banco")
public class BancoHorasController {

    final BancoHorasService bancoHorasService;

    @Autowired
    public BancoHorasController(BancoHorasService bancoHorasService) {
        this.bancoHorasService = bancoHorasService;
    }

    @GetMapping
    public List<BancoHoras> findAll() {
        return bancoHorasService.findAll();
    }

    @GetMapping("/{id}")
    public BancoHoras findById(@PathVariable("id") Long id) {
        return bancoHorasService.findById(id);
    }

    @PostMapping
    public BancoHoras create(@RequestBody BancoHoras req) {
        return bancoHorasService.create(req);
    }

    @PutMapping
    public BancoHoras update(@RequestBody BancoHoras req) {
        return bancoHorasService.update(req);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable("id") Long id) {
        bancoHorasService.deleteById(id);
    }
}
