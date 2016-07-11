package com.nwjon.mvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by jondann on 7/10/16.
 */

@Controller
@RequestMapping("/apps")
public class AppsController {

    @RequestMapping("/vendormail")
    public String vendorMail(){
        return "vendormail";
    }

}
