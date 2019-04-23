package com.coconutti.encomendal.domain.data;

import java.io.Serializable;

import com.coconutti.encomendal.domain.Usuario;
import com.coconutti.encomendal.domain.Vendedor;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class VendedorResponse implements Serializable{
	private static final long serialVersionUID = 1L;

	private Vendedor vendedor;
	private Usuario usuario;
	
}
