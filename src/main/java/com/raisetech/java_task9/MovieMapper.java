package com.raisetech.java_task9;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Optional;

@Mapper  // MyBatisのMapperである⽬印として@Mapperアノテーションを付与
public interface MovieMapper { // classではなくinterfaceで 定義
  @Select("SELECT * FROM movies")
  List<Movie> findAll();

  @Select("SELECT * FROM movies WHERE id = #{id}")
  Optional<Movie> findById(int id);
}
