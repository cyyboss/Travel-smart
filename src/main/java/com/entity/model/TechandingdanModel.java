package com.entity.model;

import com.entity.TechandingdanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;


/**
 * 交通工具订单
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 * @author
 * @email
 * @date
 */
public class TechandingdanModel  implements Serializable {
	private static final long serialVersionUID = 1L;


	/**
	 * 游客姓名
	 */

	private String youkexingming;

	/**
	 * 联系方式
	 */

	private String lianxifangshi;

	/**
	 * 交通工具名称
	 */

	private String techanmingcheng;

	/**
	 * 所在省区
	 */

	private String suozaishengqu;

	/**
	 * 所在城市
	 */

	private String suozaichengshi;

	/**
	 * 所在地区
	 */

	private String suozaidiqu;

	/**
	 * 数目
	 */

	private Integer shumu;

	/**
	 * 价格
	 */

	private Integer jiage;

	/**
	 * 总金额
	 */

	private String zongjine;

	/**
	 * 下单时间
	 */

	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date xiadanshijian;

	/**
	 * 图片
	 */

	private String tupian;

	/**
	 * 是否审核
	 */

	private String sfsh;

	/**
	 * 审核回复
	 */

	private String shhf;

	/**
	 * 是否支付
	 */

	private String ispay;


	/**
	 * 设置：游客姓名
	 */

	public void setYoukexingming(String youkexingming) {
		this.youkexingming = youkexingming;
	}

	/**
	 * 获取：游客姓名
	 */
	public String getYoukexingming() {
		return youkexingming;
	}


	/**
	 * 设置：联系方式
	 */

	public void setLianxifangshi(String lianxifangshi) {
		this.lianxifangshi = lianxifangshi;
	}

	/**
	 * 获取：联系方式
	 */
	public String getLianxifangshi() {
		return lianxifangshi;
	}


	/**
	 * 设置：交通工具名称
	 */

	public void setTechanmingcheng(String techanmingcheng) {
		this.techanmingcheng = techanmingcheng;
	}

	/**
	 * 获取：交通工具名称
	 */
	public String getTechanmingcheng() {
		return techanmingcheng;
	}


	/**
	 * 设置：所在省区
	 */

	public void setSuozaishengqu(String suozaishengqu) {
		this.suozaishengqu = suozaishengqu;
	}

	/**
	 * 获取：所在省区
	 */
	public String getSuozaishengqu() {
		return suozaishengqu;
	}


	/**
	 * 设置：所在城市
	 */

	public void setSuozaichengshi(String suozaichengshi) {
		this.suozaichengshi = suozaichengshi;
	}

	/**
	 * 获取：所在城市
	 */
	public String getSuozaichengshi() {
		return suozaichengshi;
	}


	/**
	 * 设置：所在地区
	 */

	public void setSuozaidiqu(String suozaidiqu) {
		this.suozaidiqu = suozaidiqu;
	}

	/**
	 * 获取：所在地区
	 */
	public String getSuozaidiqu() {
		return suozaidiqu;
	}


	/**
	 * 设置：数目
	 */

	public void setShumu(Integer shumu) {
		this.shumu = shumu;
	}

	/**
	 * 获取：数目
	 */
	public Integer getShumu() {
		return shumu;
	}


	/**
	 * 设置：价格
	 */

	public void setJiage(Integer jiage) {
		this.jiage = jiage;
	}

	/**
	 * 获取：价格
	 */
	public Integer getJiage() {
		return jiage;
	}


	/**
	 * 设置：总金额
	 */

	public void setZongjine(String zongjine) {
		this.zongjine = zongjine;
	}

	/**
	 * 获取：总金额
	 */
	public String getZongjine() {
		return zongjine;
	}


	/**
	 * 设置：下单时间
	 */

	public void setXiadanshijian(Date xiadanshijian) {
		this.xiadanshijian = xiadanshijian;
	}

	/**
	 * 获取：下单时间
	 */
	public Date getXiadanshijian() {
		return xiadanshijian;
	}


	/**
	 * 设置：图片
	 */

	public void setTupian(String tupian) {
		this.tupian = tupian;
	}

	/**
	 * 获取：图片
	 */
	public String getTupian() {
		return tupian;
	}


	/**
	 * 设置：是否审核
	 */

	public void setSfsh(String sfsh) {
		this.sfsh = sfsh;
	}

	/**
	 * 获取：是否审核
	 */
	public String getSfsh() {
		return sfsh;
	}


	/**
	 * 设置：审核回复
	 */

	public void setShhf(String shhf) {
		this.shhf = shhf;
	}

	/**
	 * 获取：审核回复
	 */
	public String getShhf() {
		return shhf;
	}


	/**
	 * 设置：是否支付
	 */

	public void setIspay(String ispay) {
		this.ispay = ispay;
	}

	/**
	 * 获取：是否支付
	 */
	public String getIspay() {
		return ispay;
	}

}
