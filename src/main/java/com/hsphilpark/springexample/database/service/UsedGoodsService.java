package com.hsphilpark.springexample.database.service;

import com.hsphilpark.springexample.database.domain.UsedGoods;
import com.hsphilpark.springexample.database.repository.UsedGoodsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

// 부가적인 기능을 수행
// Controller에서 필요한 기능을 수행
@Service
public class UsedGoodsService {

    // 의존성 주입 - DI
    //객체 생성을 Spring Framework에서 직접관리
    @Autowired
    private UsedGoodsRepository usedGoodsRepository;

    // 중고 거래 게시글 정보를 얻어 오기
    public List<UsedGoods> getUsedGoodsList(){

        // used_goods 테이블 모든 행 조회
        List<UsedGoods> usedGoodsList = usedGoodsRepository.selectUsedGoodsList();

        return usedGoodsList;
    }
}
