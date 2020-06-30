package com.consular.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.consular.domain.model.HistoricoConsulta;

@Repository
public interface HistoricoConsultaRepository extends JpaRepository<HistoricoConsulta, Long>{

}
