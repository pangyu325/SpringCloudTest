package com.pangyu.hotmap.mapper;

import com.pangyu.hotmap.entity.po.location;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface locationMapper {
    List<location> select();
}
