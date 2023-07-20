package com.controle_ponto.service;

import com.controle_ponto.model.BancoHoras;
import com.controle_ponto.repository.BancoHorasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class BancoHorasService {

    final BancoHorasRepository bancoHorasRepository;

    @Autowired
    public BancoHorasService(BancoHorasRepository bancoHorasRepository) {
        this.bancoHorasRepository = bancoHorasRepository;
    }

    public List<BancoHoras> findAll() {
        return bancoHorasRepository.findAll();
    }

    public BancoHoras findById(Long id) {
        return bancoHorasRepository.findById(id).orElseThrow(() -> new NoSuchElementException("Banco de horas não encontrado"));
    }

    public BancoHoras create(BancoHoras bancoHoras) {
        return bancoHorasRepository.save(bancoHoras);
    }

    public BancoHoras update(BancoHoras bancoHoras) {
        return bancoHorasRepository.save(bancoHoras);
    }

    public void deleteById(Long id) {
        bancoHorasRepository.deleteById(id);
    }
}
