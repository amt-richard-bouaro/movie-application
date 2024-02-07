package com.amalitechrbouaro.movie.models;

import com.amalitechrbouaro.movie.repository.MovieRepository;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;

public class SeedMovies implements ApplicationRunner {
    
    private final MovieRepository movieRepository;
    
    public SeedMovies(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }
    
    @Override
    public void run(ApplicationArguments args) {
        seedData();
    }
    
    
    private void seedData() {
        movieRepository.saveAll(new Data().getMovies());
        
    }
}
