package com.controle_ponto.service;

import com.controle_ponto.model.JornadaTrabalho;
import com.controle_ponto.repository.JornadaTrabalhoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@Service
public class JornadaTrabalhoService {
   final JornadaTrabalhoRepository jornadaTrabalhoRepository;

    public JornadaTrabalhoService(JornadaTrabalhoRepository jornadaTrabalhoRepository) {
        this.jornadaTrabalhoRepository = jornadaTrabalhoRepository;
    }

    public JornadaTrabalho create(JornadaTrabalho jornadaTrabalho) {
        return jornadaTrabalhoRepository.save(jornadaTrabalho);
    }

    public List<JornadaTrabalho> findAll() {
        return jornadaTrabalhoRepository.findAll();
    }

    public JornadaTrabalho findById(Long id) throws Exception {
        return jornadaTrabalhoRepository.findById(id).orElseThrow(() -> new NoSuchElementException("Jornada nao encontrada!"));
    }

    public void deleteById(Long id) {
        jornadaTrabalhoRepository.deleteById(id);
    }
}
