package com.tarlanbakirli.springrecipeapp.repositories;

import com.tarlanbakirli.springrecipeapp.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}
