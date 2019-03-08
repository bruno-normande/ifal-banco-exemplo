package br.edu.ifal.riolargo.banco;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import br.edu.ifal.riolargo.banco.modelo.Cliente;
import br.edu.ifal.riolargo.banco.modelo.Endereco;
import br.edu.ifal.riolargo.banco.repositorio.ClienteRepositorio; // TODO Corrigir tag modelos, remover import de repositorios
import br.edu.ifal.riolargo.banco.repositorio.ContaRepositorio;
import br.edu.ifal.riolargo.banco.repositorio.EnderecoRepositorio;
import br.edu.ifal.riolargo.banco.repositorio.TransacaoRepositorio;

@SpringBootApplication
public class BancoApplication {

	public static void main(String[] args) {
		SpringApplication.run(BancoApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner demo(ClienteRepositorio cl_rep, EnderecoRepositorio ed_rep) {
		
		return (args) -> {
//			Cliente c = new Cliente();
//			c.setNome("Tonho");
//			c.setEmail("tonhao.22@gmail.com");
//			
//			Endereco e = new Endereco();
//			e.setCidade("Moçoró");
//			e.setRua("Rua de cima");
//			
//			c.setEnd(e);
//			
//			ed_rep.save(e);
//			cl_rep.save(c);
			
			for (Cliente cl : cl_rep.findByNomeContaining("Pedro")) {
				System.out.println(cl.getNome() + " - " + cl.getEmail());
			}
			
			
			
		};
		
	}

}

