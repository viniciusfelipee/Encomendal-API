package com.coconutti.encomendal.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coconutti.encomendal.domain.Usuario;
import com.coconutti.encomendal.domain.Vendedor;
import com.coconutti.encomendal.domain.data.VendedorResponse;
import com.coconutti.encomendal.repository.ConsumidorRepository;
import com.coconutti.encomendal.repository.UsuarioRepository;
import com.coconutti.encomendal.repository.VendedorRepository;

@Service
public class UsuarioService {

	@Autowired
	UsuarioRepository usuarioRepo;
	
	@Autowired
	VendedorRepository vendedorRepo;
	
	@Autowired
	ConsumidorRepository consumidorRepo;
	
	public VendedorResponse getVendedorById(Integer id) {
		Optional<Vendedor> v = vendedorRepo.findById(id);
		Optional<Usuario> u = usuarioRepo.findById(id);
		VendedorResponse response = VendedorResponse.builder().usuario(u.orElse(null)).vendedor(v.orElse(null)).build();
		return response;
	}
	
}
