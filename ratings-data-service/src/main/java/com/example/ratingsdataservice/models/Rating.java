package com.example.ratingsdataservice.models;

public class Rating {
  private String ratingId;
  private int rating;

  public Rating(String ratingId, int rating) {
    this.ratingId = ratingId;
    this.rating = rating;
  }

  public String getRatingId() {
    return ratingId;
  }

  public void setRatingId(String ratingId) {
    this.ratingId = ratingId;
  }

  public int getRating() {
    return rating;
  }

  public void setRating(int rating) {
    this.rating = rating;
  }
}
