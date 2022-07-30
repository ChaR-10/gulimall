package com.charlie.gulimall.product.dao;

import com.charlie.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author ChaR
 * @email ChaR@gmail.com
 * @date 2022-07-29 10:08:03
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
