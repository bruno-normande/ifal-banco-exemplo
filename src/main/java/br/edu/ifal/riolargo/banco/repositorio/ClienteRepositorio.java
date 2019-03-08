package br.edu.ifal.riolargo.banco.repositorio;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import br.edu.ifal.riolargo.banco.modelo.Cliente;

public interface ClienteRepositorio extends CrudRepository<Cliente, Long> {
	
	public List<Cliente> findByNome(String nome);
	public List<Cliente> findByNomeContaining(String nome);

}
