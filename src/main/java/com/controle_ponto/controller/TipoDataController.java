package com.controle_ponto.controller;

import com.controle_ponto.model.TipoData;
import com.controle_ponto.service.TipoDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tipoData")
public class TipoDataController {

    final TipoDataService tipoDataService;

    @Autowired
    public TipoDataController(TipoDataService tipoDataService) {
        this.tipoDataService = tipoDataService;
    }

    @GetMapping
    public List<TipoData> findAll() {
        return tipoDataService.findAll();
    }

    @GetMapping("/{id}")
    public TipoData findById(@PathVariable("id") Long id) {
        return tipoDataService.findById(id);
    }

    @PostMapping
    public TipoData create(@RequestBody TipoData req) {
        return tipoDataService.create(req);
    }

    @PutMapping
    public TipoData update(@RequestBody TipoData req) {
        return tipoDataService.update(req);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Long id) {
        tipoDataService.deleteById(id);
    }
}
