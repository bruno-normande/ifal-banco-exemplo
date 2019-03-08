package br.edu.ifal.riolargo.banco.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class PessoaFisica extends Cliente{
	
	@Column(nullable=false, unique=true)
	private String cpf;

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	

}
