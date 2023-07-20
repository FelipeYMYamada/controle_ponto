package com.controle_ponto.controller;

import com.controle_ponto.model.CategoriaUsuario;
import com.controle_ponto.service.CategoriaUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categoria")
public class CategoriaUsuarioController {

    final CategoriaUsuarioService categoriaUsuarioService;

    @Autowired
    public CategoriaUsuarioController(CategoriaUsuarioService categoriaUsuarioService) {
        this.categoriaUsuarioService = categoriaUsuarioService;
    }

    @GetMapping
    public List<CategoriaUsuario> findAll() {
        return categoriaUsuarioService.findAll();
    }

    @GetMapping("/{id}")
    public CategoriaUsuario findById(@PathVariable("id") Long id) {
        return categoriaUsuarioService.findById(id);
    }

    @PostMapping
    public CategoriaUsuario create(@RequestBody CategoriaUsuario req) {
        return categoriaUsuarioService.create(req);
    }

    @PutMapping
    public CategoriaUsuario update(@RequestBody CategoriaUsuario req) {
        return categoriaUsuarioService.update(req);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable("id") Long id) {
        categoriaUsuarioService.deleteById(id);
    }
}
