package com.hao.controller;

import com.hao.basics.json.StringJson;
import com.hao.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;


/**
 * @Description:
 * @Company:
 * @version: 1.0
 * @date 2021/1/20 - 11:50
 */
@Controller
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    private EmployeeService service;

    @RequestMapping("/getAll")
    @ResponseBody
    public Map<String, Object> getAll(){

        return StringJson.strToJson(true,service.getAll());
    }
}
