package com.coconutti.encomendal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.coconutti.encomendal.domain.StatusPedido;

@Repository
public interface StatusPedidoRepository extends JpaRepository<StatusPedido, Integer> {

}
