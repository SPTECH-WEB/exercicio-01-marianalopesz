package com.exemplo.exercicio.faturas.controller;


import com.exemplo.exercicio.faturas.model.FaturaModel;
import com.exemplo.exercicio.faturas.service.FaturaService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/faturas")
public class FaturaController {
    private final FaturaService faturaService;
    public FaturaController(FaturaService faturaService) {
        this.faturaService = faturaService;
    }

    @GetMapping
    public List<FaturaModel> listarFaturas() {
        return faturaService.listarTodos();
    }

    @PostMapping
    public ResponseEntity<FaturaModel> adicionarFatura(@Valid @RequestBody FaturaModel fatura) {
        FaturaModel novaFatura = faturaService.salvar(fatura);
        return ResponseEntity.ok(novaFatura);
    }
}
