package com.txc.springInAction.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import static org.springframework.web.bind.annotation.RequestMethod.*;

/**
 * Created by tanxiaocan on 2017/12/14.
 */
@Controller
public class HomeController {

    @RequestMapping(value = "/",method = GET)
    public String home(){
        return "home";
    }
}
