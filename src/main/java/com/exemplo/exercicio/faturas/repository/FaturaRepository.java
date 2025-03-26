package com.exemplo.exercicio.faturas.repository;

import com.exemplo.exercicio.faturas.model.FaturaModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FaturaRepository extends JpaRepository<FaturaModel, Long> {
}
