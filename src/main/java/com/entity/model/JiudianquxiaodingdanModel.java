package com.entity.model;

import com.entity.JiudianquxiaodingdanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;


/**
 * 酒店取消订单
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 * @author
 * @email
 * @date
 */
public class JiudianquxiaodingdanModel  implements Serializable {
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
	 * 身份证
	 */

	private String shenfenzheng;

	/**
	 * 酒店名称
	 */

	private String jiudianmingcheng;

	/**
	 * 房间数
	 */

	private Integer fangjianshu;

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
	 * 入住时间
	 */

	private String ruzhushijian;

	/**
	 * 酒店价格
	 */

	private Integer jiudianjiage;

	/**
	 * 入住天数
	 */

	private Integer ruzhutianshu;

	/**
	 * 下单时间
	 */

	private String xiadanshijian;

	/**
	 * 总金额
	 */

	private String zongjine;

	/**
	 * 取消时间
	 */

	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date quxiaoshijian;

	/**
	 * 取消原因
	 */

	private String quxiaoyuanyin;

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
	 * 设置：身份证
	 */

	public void setShenfenzheng(String shenfenzheng) {
		this.shenfenzheng = shenfenzheng;
	}

	/**
	 * 获取：身份证
	 */
	public String getShenfenzheng() {
		return shenfenzheng;
	}


	/**
	 * 设置：酒店名称
	 */

	public void setJiudianmingcheng(String jiudianmingcheng) {
		this.jiudianmingcheng = jiudianmingcheng;
	}

	/**
	 * 获取：酒店名称
	 */
	public String getJiudianmingcheng() {
		return jiudianmingcheng;
	}


	/**
	 * 设置：房间数
	 */

	public void setFangjianshu(Integer fangjianshu) {
		this.fangjianshu = fangjianshu;
	}

	/**
	 * 获取：房间数
	 */
	public Integer getFangjianshu() {
		return fangjianshu;
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
	 * 设置：入住时间
	 */

	public void setRuzhushijian(String ruzhushijian) {
		this.ruzhushijian = ruzhushijian;
	}

	/**
	 * 获取：入住时间
	 */
	public String getRuzhushijian() {
		return ruzhushijian;
	}


	/**
	 * 设置：酒店价格
	 */

	public void setJiudianjiage(Integer jiudianjiage) {
		this.jiudianjiage = jiudianjiage;
	}

	/**
	 * 获取：酒店价格
	 */
	public Integer getJiudianjiage() {
		return jiudianjiage;
	}


	/**
	 * 设置：入住天数
	 */

	public void setRuzhutianshu(Integer ruzhutianshu) {
		this.ruzhutianshu = ruzhutianshu;
	}

	/**
	 * 获取：入住天数
	 */
	public Integer getRuzhutianshu() {
		return ruzhutianshu;
	}


	/**
	 * 设置：下单时间
	 */

	public void setXiadanshijian(String xiadanshijian) {
		this.xiadanshijian = xiadanshijian;
	}

	/**
	 * 获取：下单时间
	 */
	public String getXiadanshijian() {
		return xiadanshijian;
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
	 * 设置：取消时间
	 */

	public void setQuxiaoshijian(Date quxiaoshijian) {
		this.quxiaoshijian = quxiaoshijian;
	}

	/**
	 * 获取：取消时间
	 */
	public Date getQuxiaoshijian() {
		return quxiaoshijian;
	}


	/**
	 * 设置：取消原因
	 */

	public void setQuxiaoyuanyin(String quxiaoyuanyin) {
		this.quxiaoyuanyin = quxiaoyuanyin;
	}

	/**
	 * 获取：取消原因
	 */
	public String getQuxiaoyuanyin() {
		return quxiaoyuanyin;
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

}
