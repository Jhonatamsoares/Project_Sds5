package com.devsuperior.Semana.devsuperior.Services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.devsuperior.Semana.devsuperior.dto.SaleDTO;
import com.devsuperior.Semana.devsuperior.entities.Sale;
import com.devsuperior.Semana.devsuperior.repositories.SaleRepository;


@Service
public class SaleServices {
	
	@Autowired
	private SaleRepository repository;

	public Page<SaleDTO> findAll(Pageable pageable) {
		Page<Sale> result = repository.findAll(pageable);
		return result.map(x -> new SaleDTO(x));
	}
}
