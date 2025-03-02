package com.dao;

import com.entity.DiscusstechanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscusstechanVO;
import com.entity.view.DiscusstechanView;


/**
 * 交通工具评论表
 *
 * @author
 * @email
 * @date
 */
public interface DiscusstechanDao extends BaseMapper<DiscusstechanEntity> {

	List<DiscusstechanVO> selectListVO(@Param("ew") Wrapper<DiscusstechanEntity> wrapper);

	DiscusstechanVO selectVO(@Param("ew") Wrapper<DiscusstechanEntity> wrapper);

	List<DiscusstechanView> selectListView(@Param("ew") Wrapper<DiscusstechanEntity> wrapper);

	List<DiscusstechanView> selectListView(Pagination page,@Param("ew") Wrapper<DiscusstechanEntity> wrapper);

	DiscusstechanView selectView(@Param("ew") Wrapper<DiscusstechanEntity> wrapper);

}
