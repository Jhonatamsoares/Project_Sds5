package com.devsuperior.Semana.devsuperior.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.devsuperior.Semana.devsuperior.dto.SaleSuccessDTO;
import com.devsuperior.Semana.devsuperior.dto.SaleSumDTO;
import com.devsuperior.Semana.devsuperior.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long> {
	
	@Query("SELECT new com.devsuperior.Semana.devsuperior.dto.SaleSumDTO(obj.seller, SUM(obj.amount))"
			+ "FROM Sale AS obj GROUP By obj.seller")
	List<SaleSumDTO> amountGroupedBySeller();
	
	@Query("SELECT new com.devsuperior.Semana.devsuperior.dto.SaleSuccessDTO(obj.seller, SUM(obj.visited), SUM(obj.deals))"
			+ "FROM Sale AS obj GROUP By obj.seller")
	List<SaleSuccessDTO> successGroupedBySeller();

}
