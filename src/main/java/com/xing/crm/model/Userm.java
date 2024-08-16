package com.xing.crm.model;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
public class Userm {
    private String id;
    private String usercode;
    private String username;
    private String userPassword;
    private String gender;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date birthday;
    private String phone;
    private String address;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private String creationDate;


}
