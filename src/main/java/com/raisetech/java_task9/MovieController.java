package com.raisetech.java_task9;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MovieController {

  // フィールド
  private final MovieMapper movieMapper;

  // コンストラクター
  public MovieController(MovieMapper movieMapper) {
    this.movieMapper = movieMapper;
  }

  @GetMapping("/movies")
  public List<Movie> movies() {
    return movieMapper.findAll();
  }
}