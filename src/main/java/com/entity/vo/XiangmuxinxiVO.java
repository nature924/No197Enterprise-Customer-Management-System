package com.entity.vo;

import com.entity.XiangmuxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 项目信息
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-03-10 20:37:30
 */
public class XiangmuxinxiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 项目类型
	 */
	
	private String xiangmuleixing;
		
	/**
	 * 客户名称
	 */
	
	private String kehumingcheng;
		
	/**
	 * 签单金额
	 */
	
	private Integer qiandanjine;
		
	/**
	 * 签单数量
	 */
	
	private Integer qiandanshuliang;
		
	/**
	 * 项目进度
	 */
	
	private String xiangmujindu;
		
	/**
	 * 签订日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date qiandingriqi;
		
	/**
	 * 工号
	 */
	
	private String gonghao;
		
	/**
	 * 签单人
	 */
	
	private String qiandanren;
				
	
	/**
	 * 设置：项目类型
	 */
	 
	public void setXiangmuleixing(String xiangmuleixing) {
		this.xiangmuleixing = xiangmuleixing;
	}
	
	/**
	 * 获取：项目类型
	 */
	public String getXiangmuleixing() {
		return xiangmuleixing;
	}
				
	
	/**
	 * 设置：客户名称
	 */
	 
	public void setKehumingcheng(String kehumingcheng) {
		this.kehumingcheng = kehumingcheng;
	}
	
	/**
	 * 获取：客户名称
	 */
	public String getKehumingcheng() {
		return kehumingcheng;
	}
				
	
	/**
	 * 设置：签单金额
	 */
	 
	public void setQiandanjine(Integer qiandanjine) {
		this.qiandanjine = qiandanjine;
	}
	
	/**
	 * 获取：签单金额
	 */
	public Integer getQiandanjine() {
		return qiandanjine;
	}
				
	
	/**
	 * 设置：签单数量
	 */
	 
	public void setQiandanshuliang(Integer qiandanshuliang) {
		this.qiandanshuliang = qiandanshuliang;
	}
	
	/**
	 * 获取：签单数量
	 */
	public Integer getQiandanshuliang() {
		return qiandanshuliang;
	}
				
	
	/**
	 * 设置：项目进度
	 */
	 
	public void setXiangmujindu(String xiangmujindu) {
		this.xiangmujindu = xiangmujindu;
	}
	
	/**
	 * 获取：项目进度
	 */
	public String getXiangmujindu() {
		return xiangmujindu;
	}
				
	
	/**
	 * 设置：签订日期
	 */
	 
	public void setQiandingriqi(Date qiandingriqi) {
		this.qiandingriqi = qiandingriqi;
	}
	
	/**
	 * 获取：签订日期
	 */
	public Date getQiandingriqi() {
		return qiandingriqi;
	}
				
	
	/**
	 * 设置：工号
	 */
	 
	public void setGonghao(String gonghao) {
		this.gonghao = gonghao;
	}
	
	/**
	 * 获取：工号
	 */
	public String getGonghao() {
		return gonghao;
	}
				
	
	/**
	 * 设置：签单人
	 */
	 
	public void setQiandanren(String qiandanren) {
		this.qiandanren = qiandanren;
	}
	
	/**
	 * 获取：签单人
	 */
	public String getQiandanren() {
		return qiandanren;
	}
			
}
