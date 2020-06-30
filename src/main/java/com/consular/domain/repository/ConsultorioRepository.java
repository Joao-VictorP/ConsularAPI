package com.consular.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.consular.domain.model.Consultorio;

@Repository
public interface ConsultorioRepository extends JpaRepository<Consultorio, Long>{

}
