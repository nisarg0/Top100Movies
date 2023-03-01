package com.top100.movies.model;

import jakarta.persistence.*;
import lombok.*;

@Entity // This tells Hibernate to make a table out of this class
@Table(name = "movie") // This tells Hibernate to make a table out of this class
@NoArgsConstructor
@Data
@AllArgsConstructor
public class Movie {

    @Id
    @SequenceGenerator(
            name = "movie_sequence",
            sequenceName = "movie_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "movie_sequence"
    )
    private Long movieId;

    @Column(name = "title")
    private String title;

    @Column(name = "genre")
    private String genre;

    @Column(name = "imdb_id")
    private String imdbId;

    @Column(name = "vote_count")
    private int voteCount;

//    private DownloadMovies downloadMovies;

//    @Autowired
//    public Movie( DownloadMovies downloadMovies) {
//        this.downloadMovies = downloadMovies;
//    }
}
