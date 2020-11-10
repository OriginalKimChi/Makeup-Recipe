package com.makeuprecipe.dto;

import lombok.Data;

@Data
public class ReplyDTO {
    private String userId;
    private String contentId;
    private String content;
}
