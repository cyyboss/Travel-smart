package com.dao;

import com.entity.TechandingdanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.TechandingdanVO;
import com.entity.view.TechandingdanView;


/**
 * 交通工具订单
 *
 * @author
 * @email
 * @date
 */
public interface TechandingdanDao extends BaseMapper<TechandingdanEntity> {

	List<TechandingdanVO> selectListVO(@Param("ew") Wrapper<TechandingdanEntity> wrapper);

	TechandingdanVO selectVO(@Param("ew") Wrapper<TechandingdanEntity> wrapper);

	List<TechandingdanView> selectListView(@Param("ew") Wrapper<TechandingdanEntity> wrapper);

	List<TechandingdanView> selectListView(Pagination page,@Param("ew") Wrapper<TechandingdanEntity> wrapper);

	TechandingdanView selectView(@Param("ew") Wrapper<TechandingdanEntity> wrapper);

}
