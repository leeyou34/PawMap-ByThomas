package com.pawmap.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.pawmap.VO.UserVO;


@Mapper
public interface BoardMapper {

	int insertTest(UserVO vo);
}