package com.xing.crm.model;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.math.BigDecimal;
import java.util.Date;

/*
 * 静，谦虚谨慎，心胸宽广容纳所有好的坏的、先苦后甜
 * crm
 * 2021/4/25 16:06
 */
@Data
public class Order {

    private String id;
    private String name;
    private Integer sale;
    private String ordercode;
    private String providername;
    private String ispay;
    private BigDecimal orderprice;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date orderdate;

}
