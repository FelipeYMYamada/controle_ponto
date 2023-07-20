package com.controle_ponto.controller;

import com.controle_ponto.model.Localidade;
import com.controle_ponto.service.LocalidadeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/localidade")
public class LocalidadeController {

    final LocalidadeService localidadeService;

    @Autowired
    public LocalidadeController(LocalidadeService localidadeService) {
        this.localidadeService = localidadeService;
    }

    @GetMapping
    public List<Localidade> findAll() {
        return localidadeService.findAll();
    }

    @GetMapping("/{id}")
    public Localidade findById(@PathVariable("id") Long id) {
        return localidadeService.findById(id);
    }

    @PostMapping
    public Localidade create(@RequestBody Localidade req) {
        return localidadeService.create(req);
    }

    @PutMapping
    public Localidade update(@RequestBody Localidade req) {
        return localidadeService.update(req);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable("id") Long id) {
        localidadeService.deleteById(id);
    }
}
