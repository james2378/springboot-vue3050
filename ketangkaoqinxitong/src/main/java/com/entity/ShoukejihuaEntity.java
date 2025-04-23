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
 * 授课计划
 *
 * @author 
 * @email
 */
@TableName("shoukejihua")
public class ShoukejihuaEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public ShoukejihuaEntity() {

	}

	public ShoukejihuaEntity(T t) {
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
     * 老师
     */
    @TableField(value = "laoshi_id")

    private Integer laoshiId;


    /**
     * 授课计划名称
     */
    @TableField(value = "shoukejihua_name")

    private String shoukejihuaName;


    /**
     * 授课计划类型
     */
    @TableField(value = "shoukejihua_types")

    private Integer shoukejihuaTypes;


    /**
     * 授课课件
     */
    @TableField(value = "shoukejihua_file")

    private String shoukejihuaFile;


    /**
     * 授课计划详情
     */
    @TableField(value = "shoukejihua_content")

    private String shoukejihuaContent;


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
	 * 设置：老师
	 */
    public Integer getLaoshiId() {
        return laoshiId;
    }
    /**
	 * 获取：老师
	 */

    public void setLaoshiId(Integer laoshiId) {
        this.laoshiId = laoshiId;
    }
    /**
	 * 设置：授课计划名称
	 */
    public String getShoukejihuaName() {
        return shoukejihuaName;
    }
    /**
	 * 获取：授课计划名称
	 */

    public void setShoukejihuaName(String shoukejihuaName) {
        this.shoukejihuaName = shoukejihuaName;
    }
    /**
	 * 设置：授课计划类型
	 */
    public Integer getShoukejihuaTypes() {
        return shoukejihuaTypes;
    }
    /**
	 * 获取：授课计划类型
	 */

    public void setShoukejihuaTypes(Integer shoukejihuaTypes) {
        this.shoukejihuaTypes = shoukejihuaTypes;
    }
    /**
	 * 设置：授课课件
	 */
    public String getShoukejihuaFile() {
        return shoukejihuaFile;
    }
    /**
	 * 获取：授课课件
	 */

    public void setShoukejihuaFile(String shoukejihuaFile) {
        this.shoukejihuaFile = shoukejihuaFile;
    }
    /**
	 * 设置：授课计划详情
	 */
    public String getShoukejihuaContent() {
        return shoukejihuaContent;
    }
    /**
	 * 获取：授课计划详情
	 */

    public void setShoukejihuaContent(String shoukejihuaContent) {
        this.shoukejihuaContent = shoukejihuaContent;
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
        return "Shoukejihua{" +
            "id=" + id +
            ", laoshiId=" + laoshiId +
            ", shoukejihuaName=" + shoukejihuaName +
            ", shoukejihuaTypes=" + shoukejihuaTypes +
            ", shoukejihuaFile=" + shoukejihuaFile +
            ", shoukejihuaContent=" + shoukejihuaContent +
            ", insertTime=" + insertTime +
            ", createTime=" + createTime +
        "}";
    }
}
