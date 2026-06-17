package com.cursojava.aulaweb;

import org.springframework.stereotype.Controller; 
import org.springframework.ui.Model; 
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("message", "Bem-vindo ao curso de java web");

        return "index";
    }
    
    @GetMapping("/inicio")
    public String inicio(Model model) {
        model.addAttribute("titulo", "Minha primeira página dinâmica.");

        return "inicio";
    }

    @GetMapping("/mensagem")
    public String mensagem(Model model) {
        model.addAttribute("autor", "Machado de Assis.");
        model.addAttribute("texto", "Não consultes dicionários. Casmurro não está aqui no sentido que eles lhe dão, mas no que lhe pôs o vulgo de homem calado e metido consigo. Dom veio por ironia, para atribuir-me fumos de fidalgo. Tudo por estar cochilando! Também não achei melhor título para a minha narração; se não tiver outro daqui até o fim do livro, vai este mesmo.");

        return "mensagem";
    }

    //Isso ocorre pois a pagina HTML está usando o model, que está sendo definido no Controller, por isso, alterando algo no model, altera na mesma hora no HTML.
    @GetMapping("/aluno")
    public String aluno(Model model) {
        model.addAttribute("nome", "Carlos");
        model.addAttribute("idade", 18);
        model.addAttribute("curso", "Java Web");

        return "aluno";
    }

    @GetMapping("/produto-destaque")
    public String produtoDestaque(Model model) {
        model.addAttribute("nome", "uva");
        model.addAttribute("preco", 2.99);
        double preco = 2.99;
        model.addAttribute("quantidade", 120);
        double quantidade = 120;
        model.addAttribute("message", "Essas informações foram enviadas pelo Java.");

        double total = preco * quantidade;
        model.addAttribute("total", total);

        return "produto";
    }

    @GetMapping("/status")
    public String status(Model model) {
        model.addAttribute("sistema", "Aplicação em execução");
        model.addAttribute("porta", 8080);

        return "status";
    }

    //A diferença entre eles está diretamente em como é exibido o conteúdo da página, diretamente no HTML o controller apenas retorna a página já pronta pelo HTML, já pelo model, o controller retorna a página com o conteúdo que foi introduzido pelo model, porém no HTML é necessário puxar os dados que foram introduzidos pelo model para mostrar na página.
    @GetMapping("/dinamica")
    public String dinamica(Model model) {
        model.addAttribute("title", "Dinamica");
        model.addAttribute("h1", "Página dinamica");
        model.addAttribute("message", "Essa é a página dinamica");

        return "dinamica";
    }

    @GetMapping("/estatica")
    public String estatica(Model model) {
    
        return "estatica";
    }

    @GetMapping("/perfil")
    public String perfil(Model model) {
        model.addAttribute("nome", "Carlos Eduardo");
        model.addAttribute("idade", 18);

        return "perfil";
    }

    @GetMapping("/curso")
    public String curso(Model model) {
        model.addAttribute("curso", "JAVA - Udesc (Balneário Camboriú)");
        model.addAttribute("cargaHoraria", "480h");
        model.addAttribute("tecnologia", "Java web");

        return "curso";
    }
}