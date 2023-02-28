package com.top100.movies.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.HttpStatus;

import java.util.List;


@RequestMapping(value = "/user")
@RestController
public class UserController {

    Logger logger = LoggerFactory.getLogger(UserController.class);
    List<String> movieList = List.of(new String[]{"movie1", "movie2", "movie3"});

    @GetMapping(value = "/dashboard")
    public String dashboard() {
        try{
            // get user dashboard
            logger.info("User dashboard");
            return new ResponseEntity<>("User dashboard", HttpStatus.OK).getBody();
        }
        catch(Exception e){
            logger.error("Error in dashboard");
            return new ResponseEntity<>("Error in dashboard", HttpStatus.INTERNAL_SERVER_ERROR).getBody();
        }

    }


}
