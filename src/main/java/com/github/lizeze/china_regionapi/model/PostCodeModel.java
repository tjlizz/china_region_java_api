package com.github.lizeze.china_regionapi.model;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Getter;
import lombok.Setter;

/**
 * @author zeze.li
 * @BelongsProject: com.github.lizeze.china_regionapi.model
 * @date 2020/11/20
 */
@Getter
@Setter
@TableName("postcode_data")
public class PostCodeModel {
    @TableId
    @TableField("post_id")
    private Integer postId;

    @TableField
    private String province;

    @TableField
    private String city;

    @TableField
    private String area;

    @TableField("post_code")
    private String postCode;

    @TableField("area_code")
    private String areaCode;

}
