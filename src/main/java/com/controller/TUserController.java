package com.controller;

import com.model.Tuser;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class TUserController {
    @RequestMapping(value = "/addUser")
    public int addUser(@Validated @ModelAttribute Tuser tuser){




        return 1;
    };


}
