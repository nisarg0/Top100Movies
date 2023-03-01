package com.top100.movies.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.List;

@Entity
@Table(name = "download_movies")
public class DownloadMovies {

    @Id
    private String movieId;

    @Column(name = "download_links")
    private List<String> downloadLinks;

}
