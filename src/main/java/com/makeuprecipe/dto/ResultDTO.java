package com.makeuprecipe.dto;

import lombok.Data;

@Data
public class ResultDTO {
    private int code;
    private String message;
    private Object data;
}
