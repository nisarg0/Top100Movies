package com.top100.movies.controller;

import com.top100.movies.model.Movie;
import com.top100.movies.service.MovieService;
import lombok.AllArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.HttpStatus;

import java.util.List;
import java.util.Objects;


@RequestMapping(value = "api/v1/user")
@RestController
public class MovieController {
    Logger logger = LoggerFactory.getLogger(MovieController.class);

    private final MovieService movieService;

    @Autowired
    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }

    @GetMapping(value = "/dashboard")
    public List<Movie> dashboard() {
        try{
            // Hardcode list of json objects
            List<Movie> dashboard = movieService.getTop100Movies();

            // get user dashboard
            logger.info("User dashboard");
            return Objects.requireNonNull(new ResponseEntity<>(dashboard, HttpStatus.OK).getBody());
        }
        catch(Exception e) {
            logger.error("Error in dashboard", e);
            return null;
        }

    }


}
