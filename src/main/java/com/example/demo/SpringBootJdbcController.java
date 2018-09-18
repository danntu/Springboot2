package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringBootJdbcController {
    @Autowired
    JdbcTemplate template;

    @RequestMapping("/insert")
    public String index(){
        template.execute("insert into user(name,email)values('Danik','dan_ntu@mail.ru')");
        return "Data insert successfully";
    }
}
