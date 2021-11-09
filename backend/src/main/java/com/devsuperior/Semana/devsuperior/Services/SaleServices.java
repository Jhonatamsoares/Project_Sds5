package com.devsuperior.Semana.devsuperior.Services;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperior.Semana.devsuperior.dto.SaleDTO;
import com.devsuperior.Semana.devsuperior.dto.SaleSuccessDTO;
import com.devsuperior.Semana.devsuperior.dto.SaleSumDTO;
import com.devsuperior.Semana.devsuperior.entities.Sale;
import com.devsuperior.Semana.devsuperior.repositories.SaleRepository;
import com.devsuperior.Semana.devsuperior.repositories.SelesRepository;


@Service
public class SaleServices {
	
	@Autowired
	private SaleRepository repository;
	
	@Autowired
	private SelesRepository selesRepository;

	@Transactional(readOnly = true)
	public Page<SaleDTO> findAll(Pageable pageable) {
		selesRepository.findAll();
		Page<Sale> result = repository.findAll(pageable);
		return result.map(x -> new SaleDTO(x));
	}
	
	@Transactional(readOnly = true)
	public List<SaleSumDTO> amountGroupedBySeller() {
		return repository.amountGroupedBySeller();
	}
	
	@Transactional(readOnly = true)
	public List<SaleSuccessDTO> successGroupedBySeller() {
		return repository.successGroupedBySeller();
}
}