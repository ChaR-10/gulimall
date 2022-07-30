package com.charlie.gulimall.coupon.dao;

import com.charlie.gulimall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author ChaR
 * @email ChaR@gmail.com
 * @date 2022-07-30 11:53:29
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
