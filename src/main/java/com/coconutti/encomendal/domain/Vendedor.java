package com.coconutti.encomendal.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import lombok.Data;

@Data
@Entity
public class Vendedor implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String nomeLoja;
	private String cpf;
	private String cnpj;
	private String linkFacebook;
	
	@OneToOne
	@JoinColumn(name="id")
	private Usuario usuario;
	
	@Id @Column(name="id")
	private Integer id;
	
	public Vendedor () {
		
	}

}
