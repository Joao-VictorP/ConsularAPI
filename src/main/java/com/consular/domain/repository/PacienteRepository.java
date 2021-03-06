package com.consular.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.consular.domain.model.Paciente;

@Repository
public interface PacienteRepository extends JpaRepository<Paciente, Long> {

}
