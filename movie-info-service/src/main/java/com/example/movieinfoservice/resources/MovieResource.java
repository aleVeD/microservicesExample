package com.example.movieinfoservice.resources;

import com.example.movieinfoservice.models.Movie;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping("/movies")
public class MovieResource {
  @RequestMapping("/{movieId}")
  public Movie getMovieInfo(@PathVariable("movieId") String moviveId){
    return new Movie(moviveId, "starwars");
  }
}