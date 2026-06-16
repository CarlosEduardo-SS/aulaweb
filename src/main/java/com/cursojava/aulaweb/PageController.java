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

    @GetMapping("/perfil")
    public String perfil(Model model) {
        model.addAttribute("nome", "Carlos");
        model.addAttribute("idade", 18);
        model.addAttribute("curso", "java web");

        return "perfil";
    }

    @GetMapping("/aluno")
    public String aluno(Model model) {
        model.addAttribute("nome", "Carlos");
        model.addAttribute("idade", 18);
        model.addAttribute("turma", "JAVA - Udesc (Balneário Camboriú)");
        model.addAttribute("message", "Boas-vindas!");

        return "aluno";
    }

}