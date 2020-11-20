package com.github.lizeze.china_regionapi.api;

import com.github.lizeze.china_regionapi.service.PostCodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * @author zeze.li
 * @BelongsProject: com.github.lizeze.china_regionapi.api
 * @date 2020/11/20
 */
@RestController
@RequestMapping("/api/postcode")
public class PostCodeController {


    @Autowired
    private PostCodeService postCodeService;

    @PostMapping("/")
    public ResponseEntity list(@RequestBody Map<String, String> map) {

        if (map != null && map.containsKey("name")) {
            return ResponseEntity.status(HttpStatus.OK).body(postCodeService.list(map.get("name")));
        }
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("参数错误");
    }


}
