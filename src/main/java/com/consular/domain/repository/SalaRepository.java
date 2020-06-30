package com.consular.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.consular.domain.model.Sala;

@Repository
public interface SalaRepository extends JpaRepository<Sala, Long>{

}
