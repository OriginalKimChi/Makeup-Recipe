package com.makeuprecipe.dto;

import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public class RecipeDTO {
    private String recipeId;
    private String titleImage;
    private String content;
    private List<List<String>> cosmeticsListByStep;
    private List<List<MultipartFile>> imageListByStep;
    private List<String> stepDescription;
}
