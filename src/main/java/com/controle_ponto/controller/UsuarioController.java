package com.controle_ponto.controller;

import com.controle_ponto.model.Usuario;
import com.controle_ponto.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

    final UsuarioService usuarioService;

    @Autowired
    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @GetMapping
    public List<Usuario> findAll() {
        return usuarioService.findAll();
    }

    @GetMapping("/{id}")
    public Usuario findById(@PathVariable("id") Long id) {
        return usuarioService.findById(id);
    }

    @PostMapping
    public Usuario create(@RequestBody Usuario req) {
        return usuarioService.create(req);
    }

    @PutMapping
    public Usuario update(@RequestBody Usuario req) {
        return usuarioService.update(req);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable("id") Long id) {
        usuarioService.deleteById(id);
    }
}
