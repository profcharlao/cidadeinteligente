package com.devops.cidadeinteligente.controller;

import com.devops.cidadeinteligente.model.PontoTuristico;
import com.devops.cidadeinteligente.repository.PontoTuristicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pontos")
public class PontoTuristicoController {

    @Autowired
    private PontoTuristicoRepository repository;

    @GetMapping
    public List<PontoTuristico> listar() {
        return repository.findAll();
    }

    @PostMapping
    public PontoTuristico adicionar(@RequestBody PontoTuristico ponto) {
        return repository.save(ponto);
    }

    @PutMapping("/{id}")
    public PontoTuristico atualizar(@PathVariable Long id, @RequestBody PontoTuristico ponto) {
        ponto.setId(id);
        return repository.save(ponto);
    }

    @DeleteMapping("/{id}")
    public void remover(@PathVariable Long id) {
        repository.deleteById(id);
    }
}
