package br.edu.ifal.riolargo.banco;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import br.edu.ifal.riolargo.banco.modelo.Cliente;
import br.edu.ifal.riolargo.banco.modelo.ContaCorrente;
import br.edu.ifal.riolargo.banco.modelo.Endereco;
import br.edu.ifal.riolargo.banco.modelo.PessoaFisica;
import br.edu.ifal.riolargo.banco.modelo.Poupanca;
import br.edu.ifal.riolargo.banco.repositorio.ClienteRepositorio; // TODO Corrigir tag modelos, remover import de repositorios
import br.edu.ifal.riolargo.banco.repositorio.ContaCorrenteRepositorio;
import br.edu.ifal.riolargo.banco.repositorio.ContaRepositorio;
import br.edu.ifal.riolargo.banco.repositorio.EnderecoRepositorio;
import br.edu.ifal.riolargo.banco.repositorio.PoupancaRepositorio;
import br.edu.ifal.riolargo.banco.repositorio.TransacaoRepositorio;

@SpringBootApplication
public class BancoApplication {

	public static void main(String[] args) {
		SpringApplication.run(BancoApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner demo(ClienteRepositorio cl_rep, 
			EnderecoRepositorio ed_rep, ContaCorrenteRepositorio cc_rep,
			PoupancaRepositorio pp_rep) {
		
		return (args) -> {
			PessoaFisica c = new PessoaFisica();
			c.setNome("Onófre");
			c.setEmail("onofre2@gmail.com");
			c.setCpf("33322233322111");
			
			Endereco e = new Endereco();
			e.setCidade("Moçoró");
			e.setRua("Rua de 123 ");
			
			c.setEnd(e);
			
			ed_rep.save(e);
			cl_rep.save(c);
			
			ContaCorrente cc = new ContaCorrente();
			cc.setNumero("31111");
			cc.setSaldo(11.5);
			
			cc_rep.save(cc);
			
			c.addConta(cc);
			cl_rep.save(c);
			
//			Poupanca pp = new Poupanca();
//			pp.setNumero("9999999");
//			pp.setSaldo(1000.5);
//			
//			pp_rep.save(pp);
			
			for (Cliente cl : cl_rep.findByNomeContaining("Pedro")) {
				System.out.println(cl.getNome() + " - " + cl.getEmail());
			}
			
			
			
		};
		
	}

}

