package com.cursojava.aulaweb;

import org.springframework.stereotype.Controller; 
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PrimeiroController {
    
    @GetMapping("/teste")
    @ResponseBody
    public String teste() {
        return "Aplicação Spring Boot funcionando";
    }

    @GetMapping("/apresentacao")
    @ResponseBody
    public String apresentacao() {
        return "Meu nome é Carlos, Estou estudando java web com Spring Boot.";
    }

    @GetMapping("/boas-vindas")
    @ResponseBody
    public String boasvindas() {
        return "Seja bem-vindo!";
    }

    @GetMapping("/sobre")
    public String sobre() {
        return "sobre";
    }

    @GetMapping("/contato")
    public String contato() {
        return "contato";
    }

    @GetMapping("/html")
    @ResponseBody
    public String html() {
        return "<h1>Minha página</h1><p>Texto gerado pelo controller</p>";
    }

    @GetMapping("/inicio")
    public String inicio() {
        return "inicio";
    }

    // @ResponseBody retorna o conteúdo diretamente na resposta HTTP. Sem @ResponseBody, o retorno indica qual página HTML da pasta templates deve ser exibida.

    @GetMapping("/texto")
    @ResponseBody
    public String texto() {
        return "Texto gerado por Spring Boot. Questão 8";
    }

    @GetMapping("/pagina")
    public String pagina() {
        return "pagina";
    }

    @GetMapping("/perfil")
    public String perfil() {
        return "perfil";
    }

     @GetMapping("/index")
    public String index() {
        return "index";
    }

}