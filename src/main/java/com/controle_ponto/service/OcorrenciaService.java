package com.controle_ponto.service;

import com.controle_ponto.model.Ocorrencia;
import com.controle_ponto.repository.OcorrenciaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class OcorrenciaService {

    final OcorrenciaRepository ocorrenciaRepository;

    @Autowired
    public OcorrenciaService(OcorrenciaRepository ocorrenciaRepository) {
        this.ocorrenciaRepository = ocorrenciaRepository;
    }

    public List<Ocorrencia> findAll() {
        return ocorrenciaRepository.findAll();
    }

    public Ocorrencia findById(Long id) {
        return ocorrenciaRepository.findById(id).orElseThrow(() -> new NoSuchElementException("Nenhuma ocorrencia foi encontrada!"));
    }

    public Ocorrencia create(Ocorrencia ocorrencia) {
        return ocorrenciaRepository.save(ocorrencia);
    }

    public Ocorrencia update(Ocorrencia ocorrencia) {
        return ocorrenciaRepository.save(ocorrencia);
    }

    public void deleteById(Long id) {
        ocorrenciaRepository.deleteById(id);
    }
}
