package com.makeuprecipe.dto;

import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Data
public class VideoRecipeDTO {
    private String userId;
    private String title;
    private MultipartFile thumbnail;
    private MultipartFile video;
    private List<String> skipTitle;
    private List<Integer> skipPoint;
}
