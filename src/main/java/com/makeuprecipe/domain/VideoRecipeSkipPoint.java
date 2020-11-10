package com.makeuprecipe.domain;

import lombok.Builder;
import lombok.Data;

@Data
public class VideoRecipeSkipPoint {
    private String skipTitle;
    private int skipPoint;

    @Builder
    public VideoRecipeSkipPoint(String skipTitle, int skipPoint) {
        this.skipTitle = skipTitle;
        this.skipPoint = skipPoint;
    }
}
