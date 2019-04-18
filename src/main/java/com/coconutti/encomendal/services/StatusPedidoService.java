package com.coconutti.encomendal.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coconutti.encomendal.domain.StatusPedido;
import com.coconutti.encomendal.repository.StatusPedidoRepository;

@Service
public class StatusPedidoService {

	@Autowired
	StatusPedidoRepository statusPedidoRepo;
	
	public List<StatusPedido> getAll() {
		return statusPedidoRepo.findAll();
	}	
	
}
