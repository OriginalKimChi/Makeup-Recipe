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
@Document(collection = "artists")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Artist implements Serializable {
    @Id
    private String id;
    private String email;
    @JsonIgnore
    private String password;
    private LoginType loginType; // social login type
    private String socialId;
    private String artistName;
    @DBRef
    private PersonalData personalData;
    private String profileImage;
    private boolean termsConditions;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", timezone = "Asia/Seoul")
    private Date creationDate;

    @DBRef
    private List<Artist> followerList;
    @DBRef
    private List<Artist> followeeList;

    @Builder
    public Artist(String id, String email, String password, LoginType loginType, String socialId, String artistName, PersonalData personalData, boolean termsConditions, String profileImage) {
        this.id = id;
        this.email = email;
        this.password = password;
        this.loginType = loginType;
        this.socialId = socialId;
        this.artistName = artistName;
        this.personalData = personalData;
        this.termsConditions = termsConditions;
        this.profileImage = profileImage;
        this.creationDate = new Date();
    }

    public enum LoginType {
        KAKAO, GOOGLE, FACEBOOK, NAVER
    }
}
