package com.kelven.first_spring_app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// Explicando pontos importantes do Spring Boot
// Lembre-se que TUDO É ORIENTADO A OBJETOS

// esta anotacao abaixo simplismente é a simplificacao com abstracao de 3 anotacoes que tinham como papel:
// configurar a classe main para que seja responsavel por inicializar o programa
// configurar o proprio framework, configs basicas
// e tem a config que ira fazer todo o sentido mas esta abstraida!!!
// como é que eu inicializo a aplicacao só clicando no main???????????
// simplismente esta anotacao @SpringBootApplication tem dentro dela a anotacao @ComponentScan, que é reponsavel por:
// por escanear os pacotes e detectar automaticamente os beans anotados com anotações como @Component, @Service, @Controller, @Repository,
// e outras, permitindo que o Spring as registre no contexto de aplicação
@SpringBootApplication
public class FirstSpringAppApplication {
	public static void main(String[] args) {
		SpringApplication.run(FirstSpringAppApplication.class, args);
	}

}