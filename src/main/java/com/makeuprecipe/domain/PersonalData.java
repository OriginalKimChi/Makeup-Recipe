package com.makeuprecipe.domain;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class PersonalData {
    private FaceShape faceShape;
    private EyeStyle eyeStyle;
    private SkinTone skinTone;
    private SkinType skinType;
    private PersonalColor personalColor;

    @Builder
    public PersonalData(FaceShape faceShape, SkinType skinType, PersonalColor personalColor, EyeStyle eyeStyle, SkinTone skinTone) {
        this.faceShape = faceShape;
        this.skinType = skinType;
        this.personalColor = personalColor;
        this.eyeStyle = eyeStyle;
        this.skinTone = skinTone;
    }

    public enum FaceShape {
        DEFAULT, OVAL_FACE, NARROW_FACE, ROUND_FACE, HARD_LINES_FACE, INVERTED_TRIANGLE_FACE
    }

    public enum SkinTone {
        DEFAULT, LIGHT, LIGHT_MEDIUM, MEDIUM, MEDIUM_DEPP, DEEP, VERY_DEEP
    }

    public enum SkinType {
        DEFAULT, DRY_SKIN, OILY_SKIN, COMBINATION_SKIN, SENSITIVE_SKIN
    }

    public enum PersonalColor {
        DEFAULT, SPRING_WORM, SUMMER_COOL, AUTUMN_WORM, WINTER_COOL
    }

    public enum EyeStyle {
        DEFAULT, SINGLE_EYELID, DOUBLE_EYELID
    }
}
