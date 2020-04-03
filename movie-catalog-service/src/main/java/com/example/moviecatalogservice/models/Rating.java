package com.example.moviecatalogservice.models;

public class Rating {
  private String movieId;
  private int rating;

  public Rating() {
  }

  public Rating(String ratingId, int rating) {
    this.movieId = ratingId;
    this.rating = rating;
  }

  public String getMovieId() {
    return movieId;
  }

  public void setMovieId(String ratingId) {
    this.movieId = ratingId;
  }

  public int getRating() {
    return rating;
  }

  public void setRating(int rating) {
    this.rating = rating;
  }
}
