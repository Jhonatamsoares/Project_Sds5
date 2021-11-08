package com.devsuperior.Semana.devsuperior.controlers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.Semana.devsuperior.Services.SaleServices;
import com.devsuperior.Semana.devsuperior.dto.SaleDTO;

@RestController
@RequestMapping(value = "/sales")
public class SaleControler {
	
	@Autowired
	private SaleServices service;
	
	@GetMapping
	public HttpEntity<Page<SaleDTO>> findAll(Pageable pageable) {
		Page<SaleDTO> list = service.findAll(pageable);
		return ResponseEntity.ok(list);
	}
}