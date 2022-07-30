package com.charlie.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.charlie.common.utils.PageUtils;
import com.charlie.gulimall.product.entity.SpuInfoDescEntity;

import java.util.Map;

/**
 * spu信息介绍
 *
 * @author ChaR
 * @email ChaR@gmail.com
 * @date 2022-07-29 10:08:03
 */
public interface SpuInfoDescService extends IService<SpuInfoDescEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

