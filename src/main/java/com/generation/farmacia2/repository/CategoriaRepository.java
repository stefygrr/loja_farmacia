package com.generation.farmacia2.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.generation.farmacia2.model.Categoria;

public interface CategoriaRepository extends JpaRepository <Categoria, Long> {
	
	List<Categoria> findByDescricaoContainingIgnoreCase(@Param ("descricao") String descricao);

}
