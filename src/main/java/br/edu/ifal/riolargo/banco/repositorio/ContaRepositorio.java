package br.edu.ifal.riolargo.banco.repositorio;

import org.springframework.data.repository.CrudRepository;

import br.edu.ifal.riolargo.banco.modelo.Conta;

public interface ContaRepositorio extends CrudRepository<Conta, Long> {

}
