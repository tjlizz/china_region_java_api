package com.github.lizeze.china_regionapi.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Getter;
import lombok.Setter;

/**
 * @author zeze.li
 * @BelongsProject: com.github.lizeze.china_regionapi.model
 * @date 2020/11/20 11:38
 */
@TableName("region_data")
@Getter
@Setter
public class RegionModel {

    @TableId(type = IdType.ASSIGN_ID)
    @TableField("region_id")
    private String regionId;
    @TableField
    private String name;
    @TableField
    private String code;
    @TableField
    private String level;
    @TableField("parent_id")
    private String parentId;

}
