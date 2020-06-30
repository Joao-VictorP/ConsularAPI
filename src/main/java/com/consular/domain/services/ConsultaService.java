package com.consular.domain.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.consular.domain.repository.ConsultaRepository;
import com.consular.domain.repository.HistoricoConsultaRepository;
import com.consular.domain.repository.PagamentoRepository;

@Service
public class ConsultaService {

	@Autowired
	private ConsultaRepository consultaRepository;
	
	@Autowired
	private HistoricoConsultaRepository historicoConsultaRepository;
	
	@Autowired
	private PagamentoRepository pagamentoRepository;
}
