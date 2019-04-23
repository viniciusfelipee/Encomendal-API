package com.coconutti.encomendal.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.coconutti.encomendal.domain.StatusPedido;
import com.coconutti.encomendal.services.StatusPedidoService;

@RestController
@RequestMapping(value="/statuspedido")
public class StatusPedidoResource {
	
	@Autowired
	StatusPedidoService statusPedidoServ;
	
	@RequestMapping(value="/all",method=RequestMethod.GET)
	public ResponseEntity<List<StatusPedido>> getAll() {
		List<StatusPedido> allStatusPedido =  statusPedidoServ.getAll();
		return ResponseEntity.ok().body(allStatusPedido);
	}
	
}
