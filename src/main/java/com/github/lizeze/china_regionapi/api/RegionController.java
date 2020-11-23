package com.github.lizeze.china_regionapi.api;

import com.github.lizeze.china_regionapi.model.RegionModel;
import com.github.lizeze.china_regionapi.service.RegionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author zeze.li
 * @BelongsProject: com.github.lizeze.china_regionapi.api
 * @date 2020/11/20
 */
@RestController
@RequestMapping("/api/region")
public class RegionController {

    @Autowired
    private RegionService regionService;

    @GetMapping("/")
    public ResponseEntity getList(@RequestParam(name = "parentId") String parentId) {


        return ResponseEntity.status(HttpStatus.OK).body(regionService.getList(parentId));
    }

    @PostMapping("/")
    public ResponseEntity insert(@RequestBody List<RegionModel> list) {


        regionService.inserts(list);
        return ResponseEntity.status(HttpStatus.OK).body("");
    }

    @GetMapping("/download/")
    public ResponseEntity getDownloadData() {

        return ResponseEntity.status(HttpStatus.OK).body(regionService.getDownloadData());

    }

}
