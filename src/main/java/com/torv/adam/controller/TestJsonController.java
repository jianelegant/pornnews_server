package com.torv.adam.controller;

import net.sf.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by AdamLi on 2016/10/14.
 */
@Controller
@RequestMapping("/json")
public class TestJsonController {

    @RequestMapping(value = "/get", method = RequestMethod.GET)
    @ResponseBody
    public String get() {
        return "{\"name\":\"Adam\", \"age\":29}";
    }

    /**
     * http://localhost:8080/json/query?userid="1"&username="adam"
     * @param userid
     * @param username
     * @return
     */
    @RequestMapping(value = "/query")
    @ResponseBody
    public String query(String userid, String username) {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("userid", userid);
        jsonObject.put("username", username);
        return jsonObject.toString();
    }
}
