package com.controle_ponto.service;

import com.controle_ponto.model.Movimentacao;
import com.controle_ponto.repository.MovimentacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class MovimentacaoService {

    final MovimentacaoRepository movimentacaoRepository;

    @Autowired
    public MovimentacaoService(MovimentacaoRepository movimentacaoRepository) {
        this.movimentacaoRepository = movimentacaoRepository;
    }

    public List<Movimentacao> findAll() {
        return movimentacaoRepository.findAll();
    }

    public Movimentacao findById(Long id) {
        return movimentacaoRepository.findById(id).orElseThrow(() -> new NoSuchElementException("Nenhuma movimentacao encontrada!"));
    }

    public Movimentacao create(Movimentacao movimentacao) {
        return movimentacaoRepository.save(movimentacao);
    }

    public Movimentacao update(Movimentacao movimentacao) {
        return movimentacaoRepository.save(movimentacao);
    }

    public void deleteById(Long id) {
        movimentacaoRepository.deleteById(id);
    }
}
