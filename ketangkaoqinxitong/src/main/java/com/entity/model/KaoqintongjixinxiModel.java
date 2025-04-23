package com.entity.model;

import com.entity.KaoqintongjixinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 班级考勤信息
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class KaoqintongjixinxiModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 班级
     */
    private Integer clazzId;


    /**
     * 已打卡人数
     */
    private Integer yidakaiNumber;


    /**
     * 未打卡人数
     */
    private Integer weidakaNumber;


    /**
     * 备注信息
     */
    private String kaoqintongjixinxiContent;


    /**
     * 日期
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date riqiTime;


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
	 * 获取：班级
	 */
    public Integer getClazzId() {
        return clazzId;
    }


    /**
	 * 设置：班级
	 */
    public void setClazzId(Integer clazzId) {
        this.clazzId = clazzId;
    }
    /**
	 * 获取：已打卡人数
	 */
    public Integer getYidakaiNumber() {
        return yidakaiNumber;
    }


    /**
	 * 设置：已打卡人数
	 */
    public void setYidakaiNumber(Integer yidakaiNumber) {
        this.yidakaiNumber = yidakaiNumber;
    }
    /**
	 * 获取：未打卡人数
	 */
    public Integer getWeidakaNumber() {
        return weidakaNumber;
    }


    /**
	 * 设置：未打卡人数
	 */
    public void setWeidakaNumber(Integer weidakaNumber) {
        this.weidakaNumber = weidakaNumber;
    }
    /**
	 * 获取：备注信息
	 */
    public String getKaoqintongjixinxiContent() {
        return kaoqintongjixinxiContent;
    }


    /**
	 * 设置：备注信息
	 */
    public void setKaoqintongjixinxiContent(String kaoqintongjixinxiContent) {
        this.kaoqintongjixinxiContent = kaoqintongjixinxiContent;
    }
    /**
	 * 获取：日期
	 */
    public Date getRiqiTime() {
        return riqiTime;
    }


    /**
	 * 设置：日期
	 */
    public void setRiqiTime(Date riqiTime) {
        this.riqiTime = riqiTime;
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
