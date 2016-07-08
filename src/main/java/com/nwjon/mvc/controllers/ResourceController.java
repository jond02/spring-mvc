package com.nwjon.mvc.controllers;

import com.nwjon.mvc.data.entities.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by jondann on 7/7/16.
 */

@Controller
@RequestMapping("/resource")
public class ResourceController {

    static List<String> options = new LinkedList<>(Arrays.asList(new String[]{
            " ", "Materials", "Other", "Staff", "Technical Equip"}));

    static List<String> radios = new LinkedList<>(Arrays.asList(new String[]{
            "Hours", "Piece", "Tons"}));

    static List<String> checks = new LinkedList<>(Arrays.asList(new String[]{
            "Lead Time", "Special Rate", "Requires Approval"}));

    @RequestMapping("/add")
    public String add(Model model){

        model.addAttribute("radioOptions", radios);
        model.addAttribute("checkOptions", checks);
        model.addAttribute("typeOptions", options);
        model.addAttribute("resource", new Resource());
        return "resource_add";
    }

    @RequestMapping("/save")
    public String save(@ModelAttribute Resource resource, Model model){

        model.addAttribute("radioOptions", radios);
        model.addAttribute("checkOptions", checks);
        model.addAttribute("typeOptions", options);

        System.out.println(resource.getName());
        System.out.println("invoking the save method");
        return "resource_add";
    }


}
