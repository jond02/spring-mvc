package com.nwjon.mvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by jondann on 7/5/16.
 */

@Controller
@RequestMapping("/project")
public class ProjectController {

    @RequestMapping("/add")
    public String addProject(){
        return "project_add";
    }
}
