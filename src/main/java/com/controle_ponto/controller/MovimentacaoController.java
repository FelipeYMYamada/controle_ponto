package com.controle_ponto.controller;

import com.controle_ponto.model.Movimentacao;
import com.controle_ponto.service.MovimentacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/movimentacao")
public class MovimentacaoController {

    final MovimentacaoService movimentacaoService;

    @Autowired
    public MovimentacaoController(MovimentacaoService movimentacaoService) {
        this.movimentacaoService = movimentacaoService;
    }

    @GetMapping
    public List<Movimentacao> findAll() {
        return movimentacaoService.findAll();
    }

    @GetMapping("/{id}")
    public Movimentacao findById(@PathVariable("id") Long id) {
        return movimentacaoService.findById(id);
    }

    @PostMapping
    public Movimentacao create(@RequestBody Movimentacao req) {
        return movimentacaoService.create(req);
    }

    @PutMapping
    public Movimentacao update(@RequestBody Movimentacao req) {
        return movimentacaoService.update(req);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable("id") Long id) {
        movimentacaoService.deleteById(id);
    }
}
