package com.amalitechrbouaro.movie.services;

import com.amalitechrbouaro.movie.interfaces.ReviewInterface;
import com.amalitechrbouaro.movie.models.Movie;
import com.amalitechrbouaro.movie.models.Review;
import com.amalitechrbouaro.movie.repository.ReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

@Service
public class ReviewService implements ReviewInterface {

    private final ReviewRepository reviewRepository;

    @Autowired
    public ReviewService(ReviewRepository reviewRepository){this.reviewRepository = reviewRepository;}
    @Autowired
    private MongoTemplate mongoTemplate;

    @Override
    public Review createReview(String body, String imdbId) {
        Review newReview = reviewRepository.insert(new Review(body));

        mongoTemplate.update(Movie.class)
                .matching(Criteria.where("imdbId").is(imdbId))
                .apply(new Update().push("reviewIds").value(newReview))
                .first();

        return newReview;
    }
}
