package com.makeuprecipe.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.util.Date;

@Data
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Document(collection = "replys")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Reply implements Serializable {
    @Id
    private String id;
    private String content;
    @DBRef
    private Artist artist;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", timezone = "Asia/Seoul")
    private Date creationDate;

    public Reply(String id, String content, Artist artist) {
        this.id = id;
        this.content = content;
        this.artist = artist;
        this.creationDate = new Date();
    }
}
