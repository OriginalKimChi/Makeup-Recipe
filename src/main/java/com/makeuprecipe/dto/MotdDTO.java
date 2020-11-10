package com.makeuprecipe.dto;

import lombok.Data;
import org.springframework.web.multipart.MultipartFile;
import java.util.List;

@Data
public class MotdDTO {
    private String motdId;
    private String title;
    private String content;
    private List<MultipartFile> imageList;

}
