package com.charlie.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.charlie.common.utils.PageUtils;
import com.charlie.gulimall.coupon.entity.SeckillSkuRelationEntity;

import java.util.Map;

/**
 * 秒杀活动商品关联
 *
 * @author ChaR
 * @email ChaR@gmail.com
 * @date 2022-07-30 11:53:29
 */
public interface SeckillSkuRelationService extends IService<SeckillSkuRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

