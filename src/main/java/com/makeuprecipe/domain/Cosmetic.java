package com.makeuprecipe.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

@Data
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Document(collection = "cosmetics")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Cosmetic implements Serializable {
    @Id
    private String id;
    private String name;
    private String brand;
    private String category;
    private String image;

    @Builder
    public Cosmetic(String id, String name, String brand, String category, String image) {
        this.id = id;
        this.name = name;
        this.brand = brand;
        this.category = category;
        this.image = image;
    }
}
