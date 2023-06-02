package br.com.ingleses.ecommerce.service;

import br.com.ingleses.ecommerce.model.Produto;

import java.util.List;

public interface ProdutoService {

    // Create/Update - POST/PUT
    Produto salvar(Produto produto) throws Exception;

    // Read - GET
    List<Produto> buscarTodos();

    // Read - GET
    Produto buscarPorId(Long id) throws Exception;

    // Delete - DELETE
    boolean apagar(Long id) throws Exception;

}