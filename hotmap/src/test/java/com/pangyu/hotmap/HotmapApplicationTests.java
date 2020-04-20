package com.pangyu.hotmap;

import com.pangyu.hotmap.entity.po.location;
import com.pangyu.hotmap.mapper.locationMapper;
import com.pangyu.hotmap.service.locationService;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
@MapperScan("com.pangyu.hotmap.mapper")
class HotmapApplicationTests {
    @Autowired
    locationService lo;


    @Test
    void  testy(){
        List<location> select = lo.select();
        System.out.println(select);



    }








}
