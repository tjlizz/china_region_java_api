package com.github.lizeze.china_regionapi.service.impl;

import com.github.lizeze.china_regionapi.mapper.RegionMapper;
import com.github.lizeze.china_regionapi.model.RegionModel;
import com.github.lizeze.china_regionapi.service.RegionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
}
