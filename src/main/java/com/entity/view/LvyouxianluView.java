package com.entity.view;

import com.entity.LvyouxianluEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;


/**
 * 路线导航
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author
 * @email
 * @date
 */
@TableName("lvyouxianlu")
public class LvyouxianluView  extends LvyouxianluEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public LvyouxianluView(){
	}

 	public LvyouxianluView(LvyouxianluEntity lvyouxianluEntity){
 	try {
			BeanUtils.copyProperties(this, lvyouxianluEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
