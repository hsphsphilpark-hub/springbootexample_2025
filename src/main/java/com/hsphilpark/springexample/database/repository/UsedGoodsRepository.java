package com.hsphilpark.springexample.database.repository;

import com.hsphilpark.springexample.database.domain.UsedGoods;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UsedGoodsRepository {

    public List<UsedGoods> selectUsedGoodsList();
}
