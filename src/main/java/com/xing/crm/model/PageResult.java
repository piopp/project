package com.xing.crm.model;

import lombok.Data;

import java.util.List;

@Data
public class PageResult<T> {
    private int code;
    private String msg;
    private int count;
    private List<T> data;
}
