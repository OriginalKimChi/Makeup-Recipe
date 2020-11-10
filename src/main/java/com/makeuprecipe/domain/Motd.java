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
@Document(collection = "motds")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Motd implements Serializable {
    @Id
    private String id;
    private List<String> imageList;
    private String content;
    private List<String> hashTagList;
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
    public Motd(String id, List<String> imageList, String content, List<String> hashTagList, List<Cosmetic> cosmeticList, Artist artist) {
        this.id = id;
        this.imageList = imageList;
        this.content = content;
        this.hashTagList = hashTagList;
        this.cosmeticList = cosmeticList;
        this.artist = artist;
        this.creationDate = new Date();
    }
}
