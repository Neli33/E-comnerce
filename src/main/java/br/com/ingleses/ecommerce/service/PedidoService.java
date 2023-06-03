package br.com.ingleses.ecommerce.service;

import br.com.ingleses.ecommerce.model.Pedido;

import java.util.List;

public interface PedidoService {
    Pedido criar(Pedido pedido ) throws Exception;

    Pedido buscarPorId(Long id) throws Exception;

    List<Pedido> buscarPorStatus(Integer status) throws Exception;

    Pedido alterarStatus(Long id, Integer status) throws Exception;

}
