package com.tarlanbakirli.springrecipeapp.repositories;

import com.tarlanbakirli.springrecipeapp.domain.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category, Long> {
}
