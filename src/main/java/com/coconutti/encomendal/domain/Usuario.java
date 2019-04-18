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
public class Usuario implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nome;
	private String tel;
	private String cel;
	private String nomeUsuario;
	private String senha;
	private String email;
	
	@OneToOne
	@JoinColumn(name="id_vendedor")
	private Vendedor vendedor;
	@OneToOne
	@JoinColumn(name="id_consumidor")
	private Consumidor consumidor;
	
	public Usuario () {
		
	}

}
