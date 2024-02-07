package com.amalitechrbouaro.movie.interfaces;

import com.amalitechrbouaro.movie.models.Review;

public interface ReviewInterface {
    Review createReview(String reviewBody, String imdbId);
}
