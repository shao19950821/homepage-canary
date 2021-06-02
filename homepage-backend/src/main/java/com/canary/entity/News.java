package com.canary.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: Qixiang Shao
 * @Date: 2021/05/26/10:18 上午
 * @Description: 新闻实体类
 */
@TableName("m_news")
@ApiModel(value = "news新闻对象", description = "新闻对象")
public class News implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    @ApiModelProperty(value = "新闻id", required = false)
    private Long id;

    @ApiModelProperty(value = "用户id", required = false)
    private Long userId;

    @NotBlank(message = "标题不能为空")
    @ApiModelProperty(value = "新闻标题", required = true, example = "金雀医疗获得融资200W")
    private String title;

    @NotBlank(message = "图片地址不能为空")
    @ApiModelProperty(value = "图片地址", required = true, example = "http://localhost:8081/api/file/beqo7w.jpg")
    private String imageUrl;

    @NotBlank(message = "内容不能为空")
    @ApiModelProperty(value = "新闻内容", required = true, example = "金雀医疗获得融资200W，让我们鼓掌庆祝")
    private String content;

    @NotBlank(message = "内容不能为空")
    @ApiModelProperty(value = "新闻内容", required = true, example = "金雀医疗获得融资200W，让我们鼓掌庆祝")
    private String description;

    @JsonFormat(pattern = "yyyy-MM-dd")
    @ApiModelProperty(value = "新建时间", required = false)
    private LocalDateTime createTime;

    @JsonFormat(pattern = "yyyy-MM-dd")
    @ApiModelProperty(value = "更新时间", required = false)
    private LocalDateTime updateTime;

    @ApiModelProperty(value = "状态", required = false)
    private Integer status;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public LocalDateTime getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(LocalDateTime updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
