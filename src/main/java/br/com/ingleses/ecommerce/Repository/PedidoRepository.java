package br.com.ingleses.ecommerce.Repository;

import br.com.ingleses.ecommerce.model.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PedidoRepository extends JpaRepository {
    List<Pedido> findByStatusOrderByDataPedidosDesc(Integer status);
}
