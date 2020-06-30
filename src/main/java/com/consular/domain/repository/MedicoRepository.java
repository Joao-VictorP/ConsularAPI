package com.consular.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.consular.domain.model.Medico;

@Repository
public interface MedicoRepository extends JpaRepository<Medico, String>{

}
