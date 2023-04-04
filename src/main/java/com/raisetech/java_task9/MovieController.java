package com.raisetech.java_task9;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MovieController {

  // フィールド
  private final MovieService movieService;

  // コンストラクター
  public MovieController(MovieService movieService) {

    this.movieService = movieService;
  }

  @GetMapping("/movies")
  public List<Movie> movies() {
    return movieService.findAll();
  }
  
}
