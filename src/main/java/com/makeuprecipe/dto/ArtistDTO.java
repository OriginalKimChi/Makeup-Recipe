package com.makeuprecipe.dto;

import com.makeuprecipe.domain.Artist;
import com.makeuprecipe.domain.PersonalData;
import lombok.Data;

@Data
public class ArtistDTO {
    private String userId;
    private String email;
    private String password;
    private Artist.LoginType loginType; // social login type
    private String socialId;
    private String artistName;
    private PersonalData personalData;
    private String profileImage;
    private boolean termsConditions;
}
