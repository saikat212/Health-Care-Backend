package com.health_care.backend.Rating;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

@Service
public class RatingService {
    @Autowired
    private RatingRepository repository;

    Rating saveRating(Rating rating){
        return repository.save(rating);
    }



}
