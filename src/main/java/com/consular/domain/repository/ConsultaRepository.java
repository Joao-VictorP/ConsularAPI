package com.consular.domain.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.consular.domain.model.Consulta;
import com.consular.domain.model.Consultorio;

@Repository
public interface ConsultaRepository extends JpaRepository<Consulta, Long>{

	List<Consulta> findByConsultorio(Consultorio codConsultorio);
}
