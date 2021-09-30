package com.globallabs.springwebmvc.controller;

import com.globallabs.springwebmvc.model.Jedi;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Spring vai controlar o ciclo de vida desse objetos
 */
@Controller
public class JediController {
    @GetMapping("/jedi")
    public ModelAndView jedi(){
        final ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("jedi");

        final Jedi luke = new Jedi("Luke", "SkyWalker");
        modelAndView.addObject("allJedi", List.of(luke));

        return modelAndView;
    }
}
