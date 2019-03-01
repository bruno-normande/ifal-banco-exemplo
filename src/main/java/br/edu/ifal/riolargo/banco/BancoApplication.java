package br.edu.ifal.riolargo.banco;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import br.edu.ifal.riolargo.banco.modelo.Conta;
import br.edu.ifal.riolargo.banco.repositorio.ContaRepositorio;

@SpringBootApplication
public class BancoApplication {

	public static void main(String[] args) {
		SpringApplication.run(BancoApplication.class, args);
	}
	
//	@Bean
//	public CommandLineRunner demo(ContaRepositorio repositorio) {
//		
//		return (args) -> {
//			Conta a = new Conta();
//			a.setNumero("1234-5");
//			a.setSaldo(500.0);
//			
//			repositorio.save(a);
//			
//			
//			System.out.println("Teste =====");
//			for(Conta c : repositorio.findAll()) {
//				System.out.println("Conta: " + c.getSaldo() + " Saldo: " + c.getSaldo());
//				
//			}
//		};
//		
//	}

}

