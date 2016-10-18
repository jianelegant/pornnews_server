package com.torv.adam.controller;

import com.torv.adam.bean.User;
import com.torv.adam.service.IUserService;
import com.torv.adam.service.UserServiceImpl;
import com.torv.adam.util.Const;
import net.sf.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by AdamLi on 2016/10/18.
 */
@Controller
@RequestMapping("/account")
public class TestMyBatisController {

    private IUserService service = new UserServiceImpl();

    /**
     * http://localhost:8080/account/register?username="adam"&password="123456"
     * @param username
     * @param password
     * @return
     */
    @RequestMapping(value = "/register")
    @ResponseBody
    public String register(String username, String password) {
        JSONObject jsonObject = new JSONObject();
        service.addUser(new User(username, password));
        jsonObject.put("code", Const.CODE_OK);
        return jsonObject.toString();
    }

    /**
     * http://localhost:8080/account/login?id=1&password="123456"
     * @param id
     * @param password
     * @return
     */
    @RequestMapping(value = "/login")
    @ResponseBody
    public String login(int id, String password) {
        JSONObject jsonObject = new JSONObject();
        User user = service.findUserById(id);
        if(user.getPassword().equals(password)) {
            jsonObject.put("code", Const.CODE_OK);
        } else {
            jsonObject.put("code", Const.CODE_FAIL);
        }
        return jsonObject.toString();
    }
}
