package com.coconutti.encomendal.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.coconutti.encomendal.domain.data.VendedorResponse;
import com.coconutti.encomendal.services.UsuarioService;

@RestController
@RequestMapping(value="/usuario")
public class UsuarioResource {
		
	@Autowired
	UsuarioService usuarioServ;
	
	@RequestMapping(value="/{id}",method=RequestMethod.GET)
	public ResponseEntity<VendedorResponse> getUsuario(@PathVariable Integer id) {
		VendedorResponse response = usuarioServ.getVendedorById(id);
		return ResponseEntity.ok().body(response);
	}
	
}
