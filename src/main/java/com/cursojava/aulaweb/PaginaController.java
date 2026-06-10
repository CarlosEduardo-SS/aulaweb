package com.cursojava.aulaweb;

import org.springframework.stereotype.Controller; 
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PaginaController {
    
    @GetMapping("/exemplo")
    public String exemplo() {
        return "exemplo";
    }

    @GetMapping("/ola")
    public String ola() {
        return "ola";
    }

    @GetMapping("/")
    public String homePage() {
        return "home_page";
    }
}