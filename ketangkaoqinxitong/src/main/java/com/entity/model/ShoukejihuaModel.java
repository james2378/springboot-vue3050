package com.entity.model;

import com.entity.ShoukejihuaEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 授课计划
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class ShoukejihuaModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 老师
     */
    private Integer laoshiId;


    /**
     * 授课计划名称
     */
    private String shoukejihuaName;


    /**
     * 授课计划类型
     */
    private Integer shoukejihuaTypes;


    /**
     * 授课课件
     */
    private String shoukejihuaFile;


    /**
     * 授课计划详情
     */
    private String shoukejihuaContent;


    /**
     * 录入时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 设置：主键
	 */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：老师
	 */
    public Integer getLaoshiId() {
        return laoshiId;
    }


    /**
	 * 设置：老师
	 */
    public void setLaoshiId(Integer laoshiId) {
        this.laoshiId = laoshiId;
    }
    /**
	 * 获取：授课计划名称
	 */
    public String getShoukejihuaName() {
        return shoukejihuaName;
    }


    /**
	 * 设置：授课计划名称
	 */
    public void setShoukejihuaName(String shoukejihuaName) {
        this.shoukejihuaName = shoukejihuaName;
    }
    /**
	 * 获取：授课计划类型
	 */
    public Integer getShoukejihuaTypes() {
        return shoukejihuaTypes;
    }


    /**
	 * 设置：授课计划类型
	 */
    public void setShoukejihuaTypes(Integer shoukejihuaTypes) {
        this.shoukejihuaTypes = shoukejihuaTypes;
    }
    /**
	 * 获取：授课课件
	 */
    public String getShoukejihuaFile() {
        return shoukejihuaFile;
    }


    /**
	 * 设置：授课课件
	 */
    public void setShoukejihuaFile(String shoukejihuaFile) {
        this.shoukejihuaFile = shoukejihuaFile;
    }
    /**
	 * 获取：授课计划详情
	 */
    public String getShoukejihuaContent() {
        return shoukejihuaContent;
    }


    /**
	 * 设置：授课计划详情
	 */
    public void setShoukejihuaContent(String shoukejihuaContent) {
        this.shoukejihuaContent = shoukejihuaContent;
    }
    /**
	 * 获取：录入时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 设置：录入时间
	 */
    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 获取：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
