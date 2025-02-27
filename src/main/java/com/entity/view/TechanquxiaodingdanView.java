package com.entity.view;

import com.entity.TechanquxiaodingdanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;


/**
 * 交通工具取消订单
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author
 * @email
 * @date
 */
@TableName("techanquxiaodingdan")
public class TechanquxiaodingdanView  extends TechanquxiaodingdanEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public TechanquxiaodingdanView(){
	}

 	public TechanquxiaodingdanView(TechanquxiaodingdanEntity techanquxiaodingdanEntity){
 	try {
			BeanUtils.copyProperties(this, techanquxiaodingdanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
