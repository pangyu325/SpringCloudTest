package com.pangyu.hotmap.entity.po;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class location {
    private float lat;
    private float lng;
    private int COUNT;
}
