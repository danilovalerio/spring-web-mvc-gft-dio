package com.globallabs.springwebmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Spring vai controlar o ciclo de vida desse objetos
 */
@Controller
public class JediController {
    @GetMapping("/jedi")
    public String jedi(){
        return "jedi";
    }
}
