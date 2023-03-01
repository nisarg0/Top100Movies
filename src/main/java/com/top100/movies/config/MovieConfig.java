package com.top100.movies.config;

import com.top100.movies.model.Movie;
import com.top100.movies.repository.MovieRepository;
import org.apache.catalina.valves.StuckThreadDetectionValve;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class MovieConfig {

    // Entering the move details for the sake of testing
    @Bean
    CommandLineRunner commandLineRunner(
            MovieRepository repository) {
        return args -> {
            Movie movie1 = new Movie(
                    1L,
                    "The Shawshank Redemption",
                    "Drama",
                    "tt0111161",
                    11
            );
            Movie movie2 = new Movie(
                    2L,
                    "The Godfather",
                    "Drama",
                    "tt0068646",
                    231
            );
            Movie movie3 = new Movie(
                    3L,
                    "The Godfather: Part II",
                    "Crime",
                    "tt0071562",
                    232
            );
            Movie movie4 = new Movie(
                    4L,
                    "The Dark Knight",
                    "Horror",
                    "tt0468569",
                    233
            );
            repository.saveAll(
                    List.of(movie1, movie2, movie3, movie4)
            );
        };


    }
}
