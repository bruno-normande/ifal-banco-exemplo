package br.edu.ifal.riolargo.banco.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Poupanca extends Conta{

	//@Column(nullable=false)
	private double rendimento = 0.001;

	public double getRendimento() {
		return rendimento;
	}

	public void setRendimento(double rendimento) {
		this.rendimento = rendimento;
	}
	
	
}
