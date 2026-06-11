package com.cursojava.aulaweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AulawebApplication {

	public static void main(String[] args) {
		SpringApplication.run(AulawebApplication.class, args);
	}

	//O erro 404 que aparece não quer dizer que não está funcionando, apenas mostra esse erro pois não tem nenhuma rota configurada corretamente, sendo assim ele mostra o erro 404. 
	//O erro 404 aparece em algumas páginas por conta do uso do @ResponseBody, caso não esteja usando ele irá aparecer a mesnagem, pois quando sem, ele busca uma rota html.
}