package com.tsinghua.shops.entity;

import com.baomidou.mybatisplus.annotation.*;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.List;

@Data
@EqualsAndHashCode(callSuper = false)
@TableName("sort")
public class Sort implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 分类名称
     */
    @TableField("sort_name")
    private String sortName;

    /**
     * 分类描述
     */
    @TableField("sort_description")
    private String sortDescription;

    /**
     * 分类类型[0:导航栏分类，1:普通分类]
     */
    @TableField("sort_type")
    private Integer sortType;

    /**
     * 分类优先级：数字小的在前面
     */
    @TableField("priority")
    private Integer priority;

    @TableField(exist = false)
    private Integer countOfSort;

    @TableField(exist = false)
    private List<Label> labels;

}
