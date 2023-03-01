package com.top100.movies.service;

import com.top100.movies.model.Movie;
import com.top100.movies.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class  MovieService {
    private final MovieRepository movieRepository;

    @Autowired
    public MovieService(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    public List<Movie>  getTop100Movies() {

        return movieRepository.findTop100ByOrderByVoteCountDesc();
    }

}
