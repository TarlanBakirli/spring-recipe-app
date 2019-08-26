package com.tarlanbakirli.springrecipeapp.services;

import com.tarlanbakirli.springrecipeapp.domain.Recipe;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public interface RecipeService {

    Set<Recipe> getRecipes();

    Recipe findById(Long id);

}
