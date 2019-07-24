package com.tarlanbakirli.springrecipeapp.controllers;

import com.tarlanbakirli.springrecipeapp.services.RecipeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    private final RecipeService recipeService;

    public IndexController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @RequestMapping({"", "/", "/index"})
    public String getIndexPage(Model  model){

        System.out.println("indexde");
        model.addAttribute("recipes", recipeService.getRecipes());

        return "index";
    }

}
