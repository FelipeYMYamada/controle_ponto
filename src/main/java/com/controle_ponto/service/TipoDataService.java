package com.controle_ponto.service;

import com.controle_ponto.model.TipoData;
import com.controle_ponto.repository.TipoDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class TipoDataService {

    final TipoDataRepository tipoDataRepository;

    @Autowired
    public TipoDataService(TipoDataRepository tipoDataRepository) {
        this.tipoDataRepository = tipoDataRepository;
    }

    public List<TipoData> findAll() {
        return tipoDataRepository.findAll();
    }

    public TipoData findById(Long id) {
        return tipoDataRepository.findById(id).orElseThrow(() -> new NoSuchElementException("Nenhum tipo de data foi encontado!"));
    }

    public TipoData create(TipoData tipoData) {
        return tipoDataRepository.save(tipoData);
    }

    public TipoData update(TipoData tipoData) {
        return tipoDataRepository.save(tipoData);
    }

    public void deleteById(Long id) {
        tipoDataRepository.deleteById(id);
    }
}
