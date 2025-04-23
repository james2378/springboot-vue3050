package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * 班级考勤信息
 *
 * @author 
 * @email
 */
@TableName("kaoqintongjixinxi")
public class KaoqintongjixinxiEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public KaoqintongjixinxiEntity() {

	}

	public KaoqintongjixinxiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @TableField(value = "id")

    private Integer id;


    /**
     * 班级
     */
    @TableField(value = "clazz_id")

    private Integer clazzId;


    /**
     * 已打卡人数
     */
    @TableField(value = "yidakai_number")

    private Integer yidakaiNumber;


    /**
     * 未打卡人数
     */
    @TableField(value = "weidaka_number")

    private Integer weidakaNumber;


    /**
     * 备注信息
     */
    @TableField(value = "kaoqintongjixinxi_content")

    private String kaoqintongjixinxiContent;


    /**
     * 日期
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat
    @TableField(value = "riqi_time")

    private Date riqiTime;


    /**
     * 录入时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

    private Date insertTime;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "create_time",fill = FieldFill.INSERT)

    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }
    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：班级
	 */
    public Integer getClazzId() {
        return clazzId;
    }
    /**
	 * 获取：班级
	 */

    public void setClazzId(Integer clazzId) {
        this.clazzId = clazzId;
    }
    /**
	 * 设置：已打卡人数
	 */
    public Integer getYidakaiNumber() {
        return yidakaiNumber;
    }
    /**
	 * 获取：已打卡人数
	 */

    public void setYidakaiNumber(Integer yidakaiNumber) {
        this.yidakaiNumber = yidakaiNumber;
    }
    /**
	 * 设置：未打卡人数
	 */
    public Integer getWeidakaNumber() {
        return weidakaNumber;
    }
    /**
	 * 获取：未打卡人数
	 */

    public void setWeidakaNumber(Integer weidakaNumber) {
        this.weidakaNumber = weidakaNumber;
    }
    /**
	 * 设置：备注信息
	 */
    public String getKaoqintongjixinxiContent() {
        return kaoqintongjixinxiContent;
    }
    /**
	 * 获取：备注信息
	 */

    public void setKaoqintongjixinxiContent(String kaoqintongjixinxiContent) {
        this.kaoqintongjixinxiContent = kaoqintongjixinxiContent;
    }
    /**
	 * 设置：日期
	 */
    public Date getRiqiTime() {
        return riqiTime;
    }
    /**
	 * 获取：日期
	 */

    public void setRiqiTime(Date riqiTime) {
        this.riqiTime = riqiTime;
    }
    /**
	 * 设置：录入时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }
    /**
	 * 获取：录入时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }
    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Kaoqintongjixinxi{" +
            "id=" + id +
            ", clazzId=" + clazzId +
            ", yidakaiNumber=" + yidakaiNumber +
            ", weidakaNumber=" + weidakaNumber +
            ", kaoqintongjixinxiContent=" + kaoqintongjixinxiContent +
            ", riqiTime=" + riqiTime +
            ", insertTime=" + insertTime +
            ", createTime=" + createTime +
        "}";
    }
}
