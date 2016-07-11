package com.nwjon.mvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by jondann on 7/10/16.
 */

@Controller
public class IndexController {

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String index(){

        return "index";
    }
}
