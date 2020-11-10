package com.makeuprecipe.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Document(collection = "recipes")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Recipe implements Serializable {
    @Id
    private String id;
    private String titleImage;
    private String content;
    private List<RecipeStep> recipeStepList;
    @DBRef
    private List<Cosmetic> cosmeticList;
    @DBRef
    private Artist artist;
    @DBRef
    private List<Reply> replyList;
    @JsonIgnore
    @DBRef
    private List<Artist> likeList;

    private int likeCnt;
    private int replyCnt;
    private int viewCount;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", timezone = "Asia/Seoul")
    private Date creationDate;

    @Builder
    public Recipe(String id, String titleImage, String content, List<RecipeStep> recipeStepList, List<Cosmetic> cosmeticList, Artist artist) {
        this.id = id;
        this.titleImage = titleImage;
        this.content = content;
        this.recipeStepList = recipeStepList;
        this.cosmeticList = cosmeticList;
        this.artist = artist;
        this.creationDate = new Date();
    }
}
