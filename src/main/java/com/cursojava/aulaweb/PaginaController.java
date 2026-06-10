package com.cursojava.aulaweb;

import org.springframework.stereotype.Controller; 
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PaginaController {
    
    @GetMapping("/sobre")
    public String sobre() {
        return "sobre";
    }

     @GetMapping("/contato")
    public String contato() {
        return "contato";
    }

     @GetMapping("/ajuda")
    public String ajuda() {
        return "ajuda";
    }

    @GetMapping("/")
    public String Index() {
        return "index";
    }
}
