package com.consular.domain.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.consular.domain.repository.ConsultorioRepository;

@Service
public class ConsultorioService {

	@Autowired
	private ConsultorioRepository consultorioRepository;
}
