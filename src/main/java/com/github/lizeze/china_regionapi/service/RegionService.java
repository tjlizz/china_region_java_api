package com.github.lizeze.china_regionapi.service;

import com.github.lizeze.china_regionapi.model.RegionModel;

import java.util.List;
import java.util.Map;

/**
 * @author zeze.li
 * @BelongsProject: com.github.lizeze.china_regionapi.service
 * @date 2020/11/20
 */
public interface RegionService {

    List<RegionModel> getList(String parentId);

    List<RegionModel> getList(Map<String, Object> map);

    void inserts(List<RegionModel> list);

    List<RegionModel> getDownloadData();

}
