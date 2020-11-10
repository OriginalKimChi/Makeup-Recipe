package com.makeuprecipe.domain;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.DBRef;

import java.util.List;

@Data
@NoArgsConstructor
public class RecipeStep {
    private int id;
    private String image;
    private String description;

    @DBRef
    private List<Cosmetic> cosmeticList;

    @Builder
    public RecipeStep(int id, String image, String description, List<Cosmetic> cosmeticList) {
        this.id = id;
        this.image = image;
        this.description = description;
        this.cosmeticList = cosmeticList;
    }
}
