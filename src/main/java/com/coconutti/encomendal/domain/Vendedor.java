package com.coconutti.encomendal.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import lombok.Data;

@Data
@Entity
public class Vendedor implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nomeLoja;
	private String cpf;
	private String cnpj;
	private String linkFacebook;
	
	@OneToOne
	@JoinColumn(name="usuario_id")
	private Usuario usuario;
	
	public Vendedor () {
		
	}

}
