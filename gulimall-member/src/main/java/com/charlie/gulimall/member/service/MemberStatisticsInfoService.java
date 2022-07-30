package com.charlie.gulimall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.charlie.common.utils.PageUtils;
import com.charlie.gulimall.member.entity.MemberStatisticsInfoEntity;

import java.util.Map;

/**
 * 会员统计信息
 *
 * @author ChaR
 * @email ChaR@gmail.com
 * @date 2022-07-30 12:24:44
 */
public interface MemberStatisticsInfoService extends IService<MemberStatisticsInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

