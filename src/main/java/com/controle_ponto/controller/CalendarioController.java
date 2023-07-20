package com.controle_ponto.controller;

import com.controle_ponto.model.Calendario;
import com.controle_ponto.service.CalendarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/calendario")
public class CalendarioController {
    final CalendarioService calendarioService;

    @Autowired
    public CalendarioController(CalendarioService calendarioService) {
        this.calendarioService = calendarioService;
    }

    @GetMapping
    public List<Calendario> findAll() {
        return calendarioService.findAll();
    }

    @GetMapping("/{id}")
    public Calendario findById(@PathVariable("id") Long id) {
        return calendarioService.findById(id);
    }

    @PostMapping
    public Calendario create(@RequestBody Calendario req) {
        return calendarioService.create(req);
    }

    @PutMapping
    public Calendario update(@RequestBody Calendario req) {
        return calendarioService.update(req);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable("id") Long id) {
        calendarioService.deleteById(id);
    }
}
