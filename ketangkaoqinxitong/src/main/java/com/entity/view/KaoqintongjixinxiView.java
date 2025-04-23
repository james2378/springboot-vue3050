package com.entity.view;

import com.entity.KaoqintongjixinxiEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 班级考勤信息
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("kaoqintongjixinxi")
public class KaoqintongjixinxiView extends KaoqintongjixinxiEntity implements Serializable {
    private static final long serialVersionUID = 1L;




		//级联表 clazz
			/**
			* 班级 的 老师
			*/
			private Integer clazzLaoshiId;
			/**
			* 班级名称
			*/
			private String clazzName;
			/**
			* 班级位置
			*/
			private String clazzAddress;
			/**
			* 班级人数
			*/
			private Integer clazzNumber;

	public KaoqintongjixinxiView() {

	}

	public KaoqintongjixinxiView(KaoqintongjixinxiEntity kaoqintongjixinxiEntity) {
		try {
			BeanUtils.copyProperties(this, kaoqintongjixinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}







				//级联表的get和set clazz

					/**
					* 获取：班级 的 老师
					*/
					public Integer getClazzLaoshiId() {
						return clazzLaoshiId;
					}
					/**
					* 设置：班级 的 老师
					*/
					public void setClazzLaoshiId(Integer clazzLaoshiId) {
						this.clazzLaoshiId = clazzLaoshiId;
					}


					/**
					* 获取： 班级名称
					*/
					public String getClazzName() {
						return clazzName;
					}
					/**
					* 设置： 班级名称
					*/
					public void setClazzName(String clazzName) {
						this.clazzName = clazzName;
					}

					/**
					* 获取： 班级位置
					*/
					public String getClazzAddress() {
						return clazzAddress;
					}
					/**
					* 设置： 班级位置
					*/
					public void setClazzAddress(String clazzAddress) {
						this.clazzAddress = clazzAddress;
					}

					/**
					* 获取： 班级人数
					*/
					public Integer getClazzNumber() {
						return clazzNumber;
					}
					/**
					* 设置： 班级人数
					*/
					public void setClazzNumber(Integer clazzNumber) {
						this.clazzNumber = clazzNumber;
					}


























}
