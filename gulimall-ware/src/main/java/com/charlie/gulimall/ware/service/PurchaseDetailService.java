package com.charlie.gulimall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.charlie.common.utils.PageUtils;
import com.charlie.gulimall.ware.entity.PurchaseDetailEntity;

import java.util.Map;

/**
 * 
 *
 * @author ChaR
 * @email ChaR@gmail.com
 * @date 2022-07-30 13:31:23
 */
public interface PurchaseDetailService extends IService<PurchaseDetailEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

