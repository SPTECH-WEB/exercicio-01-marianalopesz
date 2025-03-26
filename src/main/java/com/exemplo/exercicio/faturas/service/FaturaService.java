package com.exemplo.exercicio.faturas.service;


import com.exemplo.exercicio.faturas.model.FaturaModel;
import com.exemplo.exercicio.faturas.repository.FaturaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FaturaService {
    @Autowired
    private final FaturaRepository faturaRepository;

    public FaturaService(FaturaRepository faturaRepository) {this.faturaRepository = faturaRepository;}

    public List<FaturaModel> listarTodos(){
        return faturaRepository.findAll();
    }

    public FaturaModel salvar(FaturaModel fatura){
        return faturaRepository.save(fatura);
    }
}
