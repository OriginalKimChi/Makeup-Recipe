package com.makeuprecipe.persistance;

import com.makeuprecipe.domain.Recipe;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RecipeRepository extends MongoRepository<Recipe, String> {
}
