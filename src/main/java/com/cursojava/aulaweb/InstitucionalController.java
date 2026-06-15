package com.cursojava.aulaweb;

import org.springframework.stereotype.Controller; 
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class InstitucionalController {

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/miniaplicacao")
    public String miniaplicacao() {
        return "miniaplicacao";
    }
    
    @GetMapping("/institucional")
    @ResponseBody
    public String institucional() {
        return "Esse é o Spring Boot!";
    }

    @GetMapping("/missao")
    @ResponseBody
    public String missao() {
        return "Trabalhar para o Banco Central";
    }

    @GetMapping("/visao")
    @ResponseBody
    public String visao() {
        return "Estudar muito";
    }
}

//@ResponseBody envia o HTML diretamente pela rota, já retornar um arquivo de templates faz o programa exibir uma página HTML separada.
@Controller
class CursoController {

    @GetMapping("/curso")
    @ResponseBody
    public String curso() {
        return "Entra 21: Programação";
    }

    @GetMapping("/curso/conteudo")
    @ResponseBody
    public String cursoConteudo() {
        return "Java"
             + "Html"
             + "JS";
    }

    @GetMapping("/curso/carga-horaria")
    @ResponseBody
    public String cursoCargaHoraria() {
        return "480h";
    }

    @GetMapping("/curso/pagina")
    public String cursoPagina() {
        return "pagina-curso";
    }
}

@Controller
class HtmlDiretoController {

    @GetMapping("/html-direto")
    @ResponseBody
    public String htmlDireto() {
        return "<h1>HTML direto</h1>"
             + "<p>Esta resposta foi criada dentro do controller</p>"
             + "<ul><li>Java</li><li>Spring</li><li>Web</li></ul>";
    }

    @GetMapping("/duplicada")
    @ResponseBody
    public String duplicada() {
        return "duplicado";
    }
    
}

@Controller
class ProdutoController {

    @GetMapping("/produtos")
    @ResponseBody
    public String produtos() {
        return "Aqui irá mostrar os produtos";
    }

    @GetMapping("/produtos/cadastrar")
    @ResponseBody
    public String produtosCadastrar() {
        return "Aqui será o responsável pelo cadastro dos produtos";
    }

    @GetMapping("/produtos/listar")
    @ResponseBody
    public String produtosListar() {
        return "Aqui será o responsável por listar os produtos";
    }

    @GetMapping("/produtos/detalhes")
    @ResponseBody
    public String produtosDetalhes() {
        return "Aqui será o responsável por mostrar os detalhes dos produtos";
    }
}