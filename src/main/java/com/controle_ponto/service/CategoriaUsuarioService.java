package com.controle_ponto.service;

import com.controle_ponto.model.CategoriaUsuario;
import com.controle_ponto.repository.CategoriaUsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class CategoriaUsuarioService {

    final CategoriaUsuarioRepository categoriaUsuarioRepository;

    @Autowired
    public CategoriaUsuarioService(CategoriaUsuarioRepository categoriaUsuarioRepository) {
        this.categoriaUsuarioRepository = categoriaUsuarioRepository;
    }

    public List<CategoriaUsuario> findAll() {
        return categoriaUsuarioRepository.findAll();
    }

    public CategoriaUsuario findById(Long id) {
        return categoriaUsuarioRepository.findById(id).orElseThrow(() -> new NoSuchElementException("Nenhuma categoria encontrada!"));
    }

    public CategoriaUsuario create(CategoriaUsuario categoriaUsuario) {
        return categoriaUsuarioRepository.save(categoriaUsuario);
    }

    public CategoriaUsuario update(CategoriaUsuario categoriaUsuario) {
        return categoriaUsuarioRepository.save(categoriaUsuario);
    }

    public void deleteById(Long id) {
        categoriaUsuarioRepository.deleteById(id);
    }
}
