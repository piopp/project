package com.xing.crm.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;



@Data
@AllArgsConstructor
@NoArgsConstructor
public class Provider {
    private String id;
    private String pcode;
    private String pname;
    private String pcontext;
    private String phone;
    private String email;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private String createdate;

}
