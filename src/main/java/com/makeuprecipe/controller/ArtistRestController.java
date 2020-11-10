package com.makeuprecipe.controller;

import com.makeuprecipe.dto.ArtistDTO;
import com.makeuprecipe.dto.ResultDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;

@RestController
public class ArtistRestController {
    private static final Logger logger = LoggerFactory.getLogger(ArtistRestController.class);

    @PostMapping(value = "/login")
    public ResultDTO login(@RequestBody ArtistDTO artistDTO, HttpSession session) {
        ResultDTO resultDTO = new ResultDTO();

        return resultDTO;
    }

    @PostMapping(value = "/artist")
    public ResultDTO createArtist(@RequestBody ArtistDTO artistDTO, HttpSession session) {
        ResultDTO resultDTO = new ResultDTO();

        return resultDTO;
    }

    @PutMapping(value = "/artist")
    public ResultDTO updateArtist(@RequestBody ArtistDTO artistDTO, HttpSession session) {
        ResultDTO resultDTO = new ResultDTO();

        return resultDTO;
    }

    @DeleteMapping(value = "/artist")
    public ResultDTO deleteArtist(@RequestBody ArtistDTO artistDTO, HttpSession session) {
        ResultDTO resultDTO = new ResultDTO();

        return resultDTO;
    }

    @GetMapping(value = "/logout")
    public void deleteSession(HttpSession session) {
        session.removeAttribute("Artistid");
    }
}
