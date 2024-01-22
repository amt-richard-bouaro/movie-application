package com.amalitechrbouaro.movie.services;

import com.amalitechrbouaro.movie.interfaces.MovieInterface;
import com.amalitechrbouaro.movie.models.Movie;
import com.amalitechrbouaro.movie.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService implements MovieInterface {

    private final MovieRepository movieRepository;

    @Autowired
    public MovieService(MovieRepository movieRepository){this.movieRepository = movieRepository;}

    @Override
    public List<Movie> allMovies() {
        return movieRepository.findAll();
    }
    @Override
    public Movie singleMovie(String imdbId) {
        return movieRepository.findMovieByImdbId(imdbId);
    }


}
