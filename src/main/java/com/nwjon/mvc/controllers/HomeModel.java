package com.nwjon.mvc.controllers;

import com.nwjon.mvc.data.entities.Project;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by jondann on 7/5/16.
 */

@Controller
public class HomeModel {

    @RequestMapping("/home-model")
    public String goHomeModel(Model model){

        /*
        Project project = new Project();
        project.setName("First Time Project");
        project.setSponsor("Home Builders");
        project.setDescription("We like to build houses!");

        model.addAttribute("currentProject", project);
            */
        return "home-model";
    }
}

