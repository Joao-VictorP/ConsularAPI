package com.consular.api.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
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
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Consulta criarConsulta(@RequestBody @Valid Consulta consulta) {
		return consultaRepository.save(consulta);
	}
	
	@PutMapping
	public ResponseEntity<Consulta> atualizarConsulta(@PathVariable Long id, @RequestBody @Valid Consulta consulta){
		if(!consultaRepository.existsById(id)) {
			return ResponseEntity.notFound().build();
		}
		
		consulta.setId(id);
		consultaRepository.save(consulta);

		return ResponseEntity.ok(consulta);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> removerConsulta(@PathVariable Long id) {
		if(!consultaRepository.existsById(id)) {
			return ResponseEntity.notFound().build();
		}
		
		consultaRepository.deleteById(id);
		
		return ResponseEntity.noContent().build();
	}
}
