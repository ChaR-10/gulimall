package com.charlie.gulimall.member.dao;

import com.charlie.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author ChaR
 * @email ChaR@gmail.com
 * @date 2022-07-30 12:24:44
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
