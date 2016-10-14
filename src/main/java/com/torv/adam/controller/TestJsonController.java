package com.torv.adam.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by AdamLi on 2016/10/14.
 */
@Controller
public class TestJsonController {

    @RequestMapping(value = "/testjson", method = RequestMethod.GET)
    @ResponseBody
    public String getJson() {
        return "{\"name\":\"Adam\", \"age\":29}";
    }
}
