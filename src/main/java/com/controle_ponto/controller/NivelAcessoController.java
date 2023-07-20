package com.controle_ponto.controller;

import com.controle_ponto.model.NivelAcesso;
import com.controle_ponto.service.NivelAcessoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/nivel")
public class NivelAcessoController {

    final NivelAcessoService nivelAcessoService;

    @Autowired
    public NivelAcessoController(NivelAcessoService nivelAcessoService) {
        this.nivelAcessoService = nivelAcessoService;
    }

    @GetMapping
    public List<NivelAcesso> findAll() {
        return nivelAcessoService.findAll();
    }

    @GetMapping("/{id}")
    public NivelAcesso findById(@PathVariable("id") Long id) {
        return nivelAcessoService.findById(id);
    }

    @PostMapping
    public NivelAcesso create(NivelAcesso req) {
        return nivelAcessoService.create(req);
    }

    @PutMapping
    public NivelAcesso update(NivelAcesso req) {
        return nivelAcessoService.update(req);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable("id") Long id) {
        nivelAcessoService.deleteById(id);
    }
}
