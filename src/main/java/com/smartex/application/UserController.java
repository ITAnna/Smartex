package com.smartex.application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import java.util.List;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/")
    public ModelAndView home() {
        List<User> listUser = userService.listAll();
        ModelAndView mav = new ModelAndView("index");
        mav.addObject("listUser", listUser);
        return mav;
    }

}
