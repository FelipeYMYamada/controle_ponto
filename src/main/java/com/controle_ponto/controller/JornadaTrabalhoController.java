package com.controle_ponto.controller;

import com.controle_ponto.model.JornadaTrabalho;
import com.controle_ponto.service.JornadaTrabalhoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/jornada")
public class JornadaTrabalhoController {

    final JornadaTrabalhoService jornadaTrabalhoService;

    @Autowired
    public JornadaTrabalhoController(JornadaTrabalhoService jornadaTrabalhoService) {
        this.jornadaTrabalhoService = jornadaTrabalhoService;
    }

    @PostMapping
    public JornadaTrabalho create(@RequestBody JornadaTrabalho req) {
        return jornadaTrabalhoService.create(req);
    }

    @GetMapping
    public List<JornadaTrabalho> listAll() {
        return jornadaTrabalhoService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<JornadaTrabalho> findById(@PathVariable("id") Long id) throws Exception {
        return  ResponseEntity.ok(jornadaTrabalhoService.findById(id));
    }

    @PutMapping
    public JornadaTrabalho update(@RequestBody JornadaTrabalho req) {
        return jornadaTrabalhoService.create(req);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable("id") Long id) throws Exception {
        jornadaTrabalhoService.deleteById(id);
    }
}
