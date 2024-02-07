package com.amalitechrbouaro.movie.interfaces;

import com.amalitechrbouaro.movie.models.Movie;
import com.amalitechrbouaro.movie.models.Review;

import java.util.List;
import java.util.Optional;

public interface MovieInterface {
    List<Movie> allMovies();

    Movie singleMovie(String imdbId);

}
