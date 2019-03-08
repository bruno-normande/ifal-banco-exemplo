package br.edu.ifal.riolargo.banco.repositorio;

import org.springframework.data.repository.CrudRepository;

import br.edu.ifal.riolargo.banco.modelo.Transacao;

public interface TransacaoRepositorio extends CrudRepository<Transacao, Long>{

}
