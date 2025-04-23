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
 * 调课申请
 *
 * @author 
 * @email
 */
@TableName("tiaoke")
public class TiaokeEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public TiaokeEntity() {

	}

	public TiaokeEntity(T t) {
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
     * 调课申请名称
     */
    @TableField(value = "tiaoke_name")

    private String tiaokeName;


    /**
     * 调课申请详情
     */
    @TableField(value = "tiaoke_content")

    private String tiaokeContent;


    /**
     * 审核状态
     */
    @TableField(value = "tiaoke_yesno_types")

    private Integer tiaokeYesnoTypes;


    /**
     * 审核意见
     */
    @TableField(value = "tiaoke_yesno_text")

    private String tiaokeYesnoText;


    /**
     * 申请时间
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
	 * 设置：调课申请名称
	 */
    public String getTiaokeName() {
        return tiaokeName;
    }
    /**
	 * 获取：调课申请名称
	 */

    public void setTiaokeName(String tiaokeName) {
        this.tiaokeName = tiaokeName;
    }
    /**
	 * 设置：调课申请详情
	 */
    public String getTiaokeContent() {
        return tiaokeContent;
    }
    /**
	 * 获取：调课申请详情
	 */

    public void setTiaokeContent(String tiaokeContent) {
        this.tiaokeContent = tiaokeContent;
    }
    /**
	 * 设置：审核状态
	 */
    public Integer getTiaokeYesnoTypes() {
        return tiaokeYesnoTypes;
    }
    /**
	 * 获取：审核状态
	 */

    public void setTiaokeYesnoTypes(Integer tiaokeYesnoTypes) {
        this.tiaokeYesnoTypes = tiaokeYesnoTypes;
    }
    /**
	 * 设置：审核意见
	 */
    public String getTiaokeYesnoText() {
        return tiaokeYesnoText;
    }
    /**
	 * 获取：审核意见
	 */

    public void setTiaokeYesnoText(String tiaokeYesnoText) {
        this.tiaokeYesnoText = tiaokeYesnoText;
    }
    /**
	 * 设置：申请时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }
    /**
	 * 获取：申请时间
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
        return "Tiaoke{" +
            "id=" + id +
            ", laoshiId=" + laoshiId +
            ", tiaokeName=" + tiaokeName +
            ", tiaokeContent=" + tiaokeContent +
            ", tiaokeYesnoTypes=" + tiaokeYesnoTypes +
            ", tiaokeYesnoText=" + tiaokeYesnoText +
            ", insertTime=" + insertTime +
            ", createTime=" + createTime +
        "}";
    }
}
