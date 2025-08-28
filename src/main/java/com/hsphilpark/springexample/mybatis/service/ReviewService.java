package com.hsphilpark.springexample.mybatis.service;

import com.hsphilpark.springexample.mybatis.domain.Review;
import com.hsphilpark.springexample.mybatis.repository.ReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReviewService {

    @Autowired
    private ReviewRepository reviewRepository;

    //id가 14인 리뷰 정보 얻어오기
    public Review getReview(){
        
        // new_review 테이블의 id가 14인 행 조회
        Review review = reviewRepository.selectReview();

        return review;
    }
}
