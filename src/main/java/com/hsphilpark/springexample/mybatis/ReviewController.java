package com.hsphilpark.springexample.mybatis;

import com.hsphilpark.springexample.mybatis.domain.Review;
import com.hsphilpark.springexample.mybatis.service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ReviewController {

    @Autowired
    private ReviewService reviewService;

    // id가 14인 리뷰 정보를 resopnse에 json으로 담는 페이지
    @ResponseBody
    @RequestMapping("/mybatis/review")
    public Review review() {

        // id가 14인 리뷰 정보를 얻어오기
        Review review = reviewService.getReview();

        return  review;
    }
}
