package com.pangyu.hotmap.service;

import com.pangyu.hotmap.entity.po.location;
import com.pangyu.hotmap.mapper.locationMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class locationService {
    @Autowired
    locationMapper mapper;
    public List<location> select(){
        return mapper.select();

    }





}
