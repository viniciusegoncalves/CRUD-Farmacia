package com.generation.farmacia.repository;

import com.generation.farmacia.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface ProdutoRepository extends JpaRepository<Produto, UUID> {
    public List<Produto> findAllByNomeContainingIgnoreCase(String nome);

}
