package com.controle_ponto.controller;

import com.controle_ponto.model.Ocorrencia;
import com.controle_ponto.service.OcorrenciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ocorrencia")
public class OcorrenciaController {

    final OcorrenciaService ocorrenciaService;

    @Autowired
    public OcorrenciaController(OcorrenciaService ocorrenciaService) {
        this.ocorrenciaService = ocorrenciaService;
    }

    @GetMapping
    public List<Ocorrencia> findAll() {
        return ocorrenciaService.findAll();
    }

    @GetMapping("/{id}")
    public Ocorrencia findById(@PathVariable("id") Long id) {
        return ocorrenciaService.findById(id);
    }

    @PostMapping
    public Ocorrencia create(@RequestBody Ocorrencia req) {
        return ocorrenciaService.create(req);
    }

    @PutMapping
    public Ocorrencia update(@RequestBody Ocorrencia req) {
        return ocorrenciaService.update(req);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable("id") Long id) {
        ocorrenciaService.deleteById(id);
    }
}
