package com.controle_ponto.service;

import com.controle_ponto.model.NivelAcesso;
import com.controle_ponto.repository.NivelAcessoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class NivelAcessoService {

    final NivelAcessoRepository nivelAcessoRepository;

    @Autowired
    public NivelAcessoService(NivelAcessoRepository nivelAcessoRepository) {
        this.nivelAcessoRepository = nivelAcessoRepository;
    }

    public List<NivelAcesso> findAll() {
        return nivelAcessoRepository.findAll();
    }

    public NivelAcesso findById(Long id) {
        return nivelAcessoRepository.findById(id).orElseThrow(() -> new NoSuchElementException("Nenhum nível de acesso foi encontrado!"));
    }

    public NivelAcesso create(NivelAcesso nivelAcesso) {
        return nivelAcessoRepository.save(nivelAcesso);
    }

    public NivelAcesso update(NivelAcesso nivelAcesso) {
        return nivelAcessoRepository.save(nivelAcesso);
    }

    public void deleteById(Long id) {
        nivelAcessoRepository.deleteById(id);
    }
}
