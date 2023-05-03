package com.generation.farmacia2.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.generation.farmacia2.model.Produtos;

public interface ProdutosRepository extends JpaRepository<Produtos, Long> {

	
	List<Produtos> findAllByNomeContainingIgnoreCase(@Param("nome")String nome);
	
	List<Produtos> findByfabricanteContainingIgnoreCase(@Param ("fabricante") String fabricante);

}
