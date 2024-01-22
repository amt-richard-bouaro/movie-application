package com.amalitechrbouaro.movie.repository;

import com.amalitechrbouaro.movie.models.Movie;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MovieRepository  extends MongoRepository<Movie, ObjectId> {

    public Movie findMovieByImdbId(String imdbId);
}
