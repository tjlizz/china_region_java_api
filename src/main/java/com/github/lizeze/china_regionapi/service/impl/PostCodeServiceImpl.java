package com.github.lizeze.china_regionapi.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.github.lizeze.china_regionapi.mapper.PostCodeMapper;
import com.github.lizeze.china_regionapi.model.PostCodeModel;
import com.github.lizeze.china_regionapi.service.PostCodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author zeze.li
 * @BelongsProject: com.github.lizeze.china_regionapi.service.impl
 * @date 2020/11/20
 */
@Service
public class PostCodeServiceImpl implements PostCodeService {

    @Autowired
    private PostCodeMapper postCodeMapper;

    @Override
    public List<PostCodeModel> list(String areaName) {

        QueryWrapper<PostCodeModel> queryWrapper = new QueryWrapper<>();
        queryWrapper.like("area", areaName);

        return postCodeMapper.selectList(queryWrapper);
    }
}
