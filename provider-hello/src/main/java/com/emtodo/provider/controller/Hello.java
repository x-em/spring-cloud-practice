package com.emtodo.provider.controller;

import com.emtodo.common.core.Constants;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Hello 前端控制器
 * @author em
 */
@RestController
@RequestMapping("/hello")
public class Hello {

    private String dateStr(){
        return new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(new Date());
    }

    /**
     * 返回字符串类型
     * @return
     */
    @GetMapping("/str")
    public String helloStr() {
        return Constants.HELLO_PREFIX + ", " + dateStr();
    }
}
