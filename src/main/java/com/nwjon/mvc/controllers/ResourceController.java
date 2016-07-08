package com.nwjon.mvc.controllers;

import com.nwjon.mvc.data.entities.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by jondann on 7/7/16.
 */

@Controller
@RequestMapping("/resource")
public class ResourceController {

    @RequestMapping("/add")
    public String add(Model model){
        model.addAttribute("resource", new Resource());
        return "resource_add";
    }

    @RequestMapping("/save")
    public String save(@ModelAttribute Resource resource){
        System.out.println(resource.getName());
        System.out.println("invoking the save method");
        return "resource_add";
    }


}
