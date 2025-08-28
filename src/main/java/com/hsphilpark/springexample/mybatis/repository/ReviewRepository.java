package com.hsphilpark.springexample.mybatis.repository;

import com.hsphilpark.springexample.mybatis.domain.Review;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ReviewRepository {
    
    // new_review 테이블의 id가 14인 행 조회
    public Review selectReview();
}
