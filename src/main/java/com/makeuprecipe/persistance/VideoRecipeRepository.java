package com.makeuprecipe.persistance;

import com.makeuprecipe.domain.VideoRecipe;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface VideoRecipeRepository extends MongoRepository<VideoRecipe, String> {
}
