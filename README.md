![](https://img.shields.io/badge/spring--boot-2.4.0-brightgreen)
![](https://img.shields.io/badge/lombok-1.16.20-brightgreen)
![](https://img.shields.io/badge/mybatis--plus--boot--starter-3.4.1-brightgreen)
![](https://img.shields.io/badge/jdk-1.8-brightgreen)
# 简介
全国行政区域api， 包括省，市，区，县，镇，街道

全国区域邮政编码 电话区号

数据持续更新中。。。

[获取数据](https://github.com/lizeze/china_region)
# API
 ## 获取行政区域数据

 
   GET  `http://localhost:8080/api/region/?parentId=100000`
   
   `parentId`为父节点编号
   
   * 返回结果
   ```json
[
    {
        "name": "北京市",
        "code": "110000",
        "level": "province",
        "parentId": "100000"
    },
    {
        "name": "天津市",
        "code": "120000",
        "level": "province",
        "parentId": "100000"
    },
    {
        "name": "河北省",
        "code": "130000",
        "level": "province",
        "parentId": "100000"
    }
]
```

## 获取区域邮政编码与区号
POST `http://localhost:8080/api/postcode/`

调用方式
![](https://p9-juejin.byteimg.com/tos-cn-i-k3u1fbpfcp/5db4e6eec50e4abb9f1dfed32bd2da6f~tplv-k3u1fbpfcp-watermark.image)
 



