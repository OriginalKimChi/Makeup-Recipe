package com.makeuprecipe.dto;

import com.makeuprecipe.util.SortFilter;
import lombok.Data;

@Data
public class SearchDTO {
    private String keyword;
    private SortFilter sortFilter;
    private Integer page;
}
