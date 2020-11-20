package com.github.lizeze.china_regionapi.service;

import com.github.lizeze.china_regionapi.model.PostCodeModel;

import java.util.List;

/**
 * @author zeze.li
 * @BelongsProject: com.github.lizeze.china_regionapi.service
 * @date 2020/11/20
 */
public interface PostCodeService {

    List<PostCodeModel> list(String areaName);
}
