package com.raisetech.java_task9;

public class Movie {
  private int id;
  private String name;
  private String director;

  private int published_year;

  public Movie(int id, String name, String director, int published_year) {
    this.id = id;
    this.name = name;
    this.director = director;
    this.published_year = published_year;
  }

  public int getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public String getDirector() {
    return director;
  }

  public int getPublished_year() {
    return published_year;
  }
}
