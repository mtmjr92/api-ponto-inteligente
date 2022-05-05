package com.kazale.pontointeligente.api;

import com.kazale.pontointeligente.api.utils.SenhaUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class PontoInteligenteApplication {

	@Value("${paginacao.qtd_por_pagina}")
	private int qntPorPagina;

	public static void main(String[] args) {
		SpringApplication.run(PontoInteligenteApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner() {
		return args -> {
			System.out.println("### Quantidade de elementos por pagina = " + this.qntPorPagina);

			String senhaEncoded = SenhaUtils.gerarBCrypt("123456");

			System.out.println("Senha encoded: " + senhaEncoded);

			senhaEncoded = SenhaUtils.gerarBCrypt("123456");

			System.out.println("Senha encoded: " + senhaEncoded);

			System.out.println("Senha valida: " + SenhaUtils.senhaValida("123456", senhaEncoded));
		};
	}

}
