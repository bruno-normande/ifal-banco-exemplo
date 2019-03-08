package br.edu.ifal.riolargo.banco.modelo;

import javax.persistence.Entity;

@Entity
public class ContaCorrente extends Conta {
	
	private Double chequeEspecial = 100.0;

	public Double getChequeEspecial() {
		return chequeEspecial;
	}

	public void setChequeEspecial(Double chequeEspecial) {
		this.chequeEspecial = chequeEspecial;
	}

}
