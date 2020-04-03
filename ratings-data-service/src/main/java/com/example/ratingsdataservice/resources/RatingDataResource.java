package com.example.ratingsdataservice.resources;

import com.example.ratingsdataservice.models.Rating;
import com.example.ratingsdataservice.models.UserRating;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("ratingsdata")
public class RatingDataResource {

  @RequestMapping("/{movieId}")
  public Rating getRating(@PathVariable("movieId") String movieId){
    return new Rating(movieId, 4);
  }

  @RequestMapping("/users/{userId}")
  public UserRating getUserRating(@PathVariable("userId") String userId){
    List<Rating> list = Arrays.asList(
            new Rating("2", 2),
            new Rating("6", 1)
    );
    UserRating userRating = new UserRating();
    userRating.setUserRating(list);
    return userRating;
  }
}
