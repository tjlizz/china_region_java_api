package com.github.lizeze.china_regionapi.service.impl;

import com.github.lizeze.china_regionapi.mapper.RegionMapper;
import com.github.lizeze.china_regionapi.model.RegionModel;
import com.github.lizeze.china_regionapi.service.RegionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author zeze.li
 * @BelongsProject: com.github.lizeze.china_regionapi.service.impl
 * @date 2020/11/20
 */
@Service
public class RegionServiceImpl implements RegionService {

    @Autowired
    private RegionMapper regionMapper;

    @Override
    public List<RegionModel> getList(String parentId) {
        Map<String, Object> map = new HashMap<>();
        if (parentId == null || parentId.length() == 0) {

            parentId = "100000";
        }
        map.put("parent_id", parentId);
        return regionMapper.selectByMap(map);
    }

    @Override
    public List<RegionModel> getList(Map<String, Object> map) {

        return regionMapper.selectByMap(map);
    }

    @Override
    public void inserts(List<RegionModel> list) {
        for (int i = 0; i < list.size(); i++) {

            regionMapper.insert(list.get(i));
        }
    }

    @Override
    public List<RegionModel> getDownloadData() {
        Map<String, Object> map = new HashMap<>();
        map.put("level", "district");
        List<RegionModel> districtList = this.getList(map);
        Map<String, Object> streetMap = null;
        List<RegionModel> downList = new ArrayList<>();
        for (int i = 0; i < districtList.size(); i++) {

            streetMap = new HashMap<>();
            streetMap.put("parent_id", districtList.get(i).getCode());
            List<RegionModel> streetList = this.getList(streetMap);
            if (streetList == null || streetList.size() == 0) {
                downList.add(districtList.get(i));
            }
        }
        return downList;
    }
}
