package com.github.lizeze.china_regionapi.service;

import com.github.lizeze.china_regionapi.model.RegionModel;

import java.util.List;

/**
 * @author zeze.li
 * @BelongsProject: com.github.lizeze.china_regionapi.service
 * @date 2020/11/20
 */
public interface RegionService {

    List<RegionModel> getList(String parentId);

    void  inserts(List<RegionModel> list);

}
