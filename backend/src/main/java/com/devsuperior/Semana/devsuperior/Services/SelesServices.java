package com.devsuperior.Semana.devsuperior.Services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsuperior.Semana.devsuperior.dto.SellerDTO;
import com.devsuperior.Semana.devsuperior.entities.Seller;
import com.devsuperior.Semana.devsuperior.repositories.SelesRepository;


@Service
public class SelesServices {
	
	@Autowired
	private SelesRepository repository;

	public List<SellerDTO> findAll() {
		List<Seller> result = repository.findAll();
		return result.stream().map(x -> new SellerDTO(x)).collect(Collectors.toList());
	}
}
