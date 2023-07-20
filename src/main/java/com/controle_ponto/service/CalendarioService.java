package com.controle_ponto.service;

import com.controle_ponto.model.Calendario;
import com.controle_ponto.repository.CalendarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class CalendarioService {

    final CalendarioRepository calendarioRepository;

    @Autowired
    public CalendarioService(CalendarioRepository calendarioRepository) {
        this.calendarioRepository = calendarioRepository;
    }

    public List<Calendario> findAll() {
        return calendarioRepository.findAll();
    }

    public Calendario findById(Long id) {
        return calendarioRepository.findById(id).orElseThrow(() -> new NoSuchElementException("Nenhum calendario encontrado!"));
    }

    public Calendario create(Calendario calendario) {
        return calendarioRepository.save(calendario);
    }

    public Calendario update(Calendario calendario) {
        return calendarioRepository.save(calendario);
    }

    public void deleteById(Long id) {
        calendarioRepository.deleteById(id);
    }
}
