package com.entity.vo;

import com.entity.XiangmushouyiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 项目收益
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-03-10 20:37:31
 */
public class XiangmushouyiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 项目类型
	 */
	
	private String xiangmuleixing;
		
	/**
	 * 签单金额
	 */
	
	private String qiandanjine;
		
	/**
	 * 分配类型
	 */
	
	private String fenpeileixing;
		
	/**
	 * 分配金额
	 */
	
	private Integer fenpeijine;
		
	/**
	 * 日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date riqi;
				
	
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
	 * 设置：签单金额
	 */
	 
	public void setQiandanjine(String qiandanjine) {
		this.qiandanjine = qiandanjine;
	}
	
	/**
	 * 获取：签单金额
	 */
	public String getQiandanjine() {
		return qiandanjine;
	}
				
	
	/**
	 * 设置：分配类型
	 */
	 
	public void setFenpeileixing(String fenpeileixing) {
		this.fenpeileixing = fenpeileixing;
	}
	
	/**
	 * 获取：分配类型
	 */
	public String getFenpeileixing() {
		return fenpeileixing;
	}
				
	
	/**
	 * 设置：分配金额
	 */
	 
	public void setFenpeijine(Integer fenpeijine) {
		this.fenpeijine = fenpeijine;
	}
	
	/**
	 * 获取：分配金额
	 */
	public Integer getFenpeijine() {
		return fenpeijine;
	}
				
	
	/**
	 * 设置：日期
	 */
	 
	public void setRiqi(Date riqi) {
		this.riqi = riqi;
	}
	
	/**
	 * 获取：日期
	 */
	public Date getRiqi() {
		return riqi;
	}
			
}
