package br.com.ingleses.ecommerce.service;

import br.com.ingleses.ecommerce.model.Cliente;

import java.util.List;

public interface ClienteService {

    Cliente salvar (Cliente cliente) throws Exception;

    List<Cliente> buscarTodos();

    Cliente buscarPorId(Long id) throws Exception;

    boolean apagar(Long id) throws Exception;
}
