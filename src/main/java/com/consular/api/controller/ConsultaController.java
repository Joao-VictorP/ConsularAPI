package com.consular.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.consular.domain.model.Consulta;
import com.consular.domain.model.Consultorio;
import com.consular.domain.repository.ConsultaRepository;

@RestController
@RequestMapping("/consulta")
public class ConsultaController {

	@Autowired
	private ConsultaRepository consultaRepository;

	@GetMapping
	public List<Consulta> listar() {
		return consultaRepository.findAll();
	}

	@GetMapping("/{codConsultorio}")
	public ResponseEntity<List<Consulta>> buscarCodConsultorio(@PathVariable Consultorio codConsultorio) {
		List<Consulta> consulta = consultaRepository.findByConsultorio(codConsultorio);

		if (!consulta.isEmpty()) {
			return ResponseEntity.ok(consulta);
		}

		return ResponseEntity.noContent().build();
	}
}
