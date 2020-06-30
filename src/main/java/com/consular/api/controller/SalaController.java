package com.consular.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.consular.domain.repository.SalaRepository;

@RestController
@RequestMapping("/sala")
public class SalaController {

	@Autowired
	private SalaRepository salaRepository;
	
}
