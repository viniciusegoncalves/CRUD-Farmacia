package com.generation.farmacia.repository;

import com.generation.farmacia.model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface CategoriaRepository extends JpaRepository<Categoria,Long> {
    List<Categoria> findCategoriaByNomeIsContainingIgnoreCase(String nome);
    boolean existsCategoriaByNome(String nome);
}
