package com.amalitechrbouaro.movie.controllers;

import com.amalitechrbouaro.movie.models.Movie;
import com.amalitechrbouaro.movie.models.Review;
import com.amalitechrbouaro.movie.services.MovieService;
import com.amalitechrbouaro.movie.services.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Optional;

@Controller
public class MovieController {

    private final MovieService movieService;

    private final ReviewService reviewService;

    @Autowired
    public MovieController(MovieService movieService, ReviewService reviewService){
        this.movieService=movieService;
        this.reviewService = reviewService;
    }

    @GetMapping(path="/")
    public String viewMovies(Model model){
        model.addAttribute("movies", movieService.allMovies());
        return "movies";
    }

    @GetMapping(path="/{imdbId}")
    public String viewMovie(@PathVariable("imdbId") String imdbId, Model model){
         final Movie movie = movieService.singleMovie(imdbId);
        if(movie == null){
            return "redirect:/";
        }

        model.addAttribute("movie", movie);
        model.addAttribute("review", new Review());
        return "movie";
    }

    @PostMapping(path="/review-movie/{imdbId}")
    public String reviewMovie(@PathVariable("imdbId") String imdbId,  @ModelAttribute("review") Review review){
        System.out.println(review.getBody());
        reviewService.createReview(review.getBody(), imdbId);

        return "redirect:/";
    }

}