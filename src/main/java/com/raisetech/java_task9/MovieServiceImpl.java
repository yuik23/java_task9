package com.raisetech.java_task9;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieServiceImpl implements MovieService {

  // フィールド
  private final MovieMapper movieMapper;

  // コンストラクター
  public MovieServiceImpl(MovieMapper movieMapper) {

    this.movieMapper = movieMapper;
  }

  public List<Movie> findAll() {

    return movieMapper.findAll();
  }
}
