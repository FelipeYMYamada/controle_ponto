package com.controle_ponto.service;

import com.controle_ponto.model.Localidade;
import com.controle_ponto.repository.LocalidadeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class LocalidadeService {

    final LocalidadeRepository localidadeRepository;

    @Autowired
    public LocalidadeService(LocalidadeRepository localidadeRepository) {
        this.localidadeRepository = localidadeRepository;
    }

    public List<Localidade> findAll() {
        return localidadeRepository.findAll();
    }

    public Localidade findById(Long id) {
        return localidadeRepository.findById(id).orElseThrow(() -> new NoSuchElementException("Nenhuma localidade encontrada!"));
    }

    public Localidade create(Localidade localidade) {
        return localidadeRepository.save(localidade);
    }

    public Localidade update(Localidade localidade) {
        return localidadeRepository.save(localidade);
    }

    public void deleteById(Long id) {
        localidadeRepository.deleteById(id);
    }
}
