package com.health_care.backend.DC_Rating;



import com.health_care.backend.Rating.Rating;
import com.health_care.backend.Rating.RatingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

@Service
public class DC_RatingService {
    @Autowired
    private DC_RatingRepository repository;


}
