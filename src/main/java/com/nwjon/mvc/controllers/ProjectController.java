package com.nwjon.mvc.controllers;

import com.nwjon.mvc.data.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by jondann on 7/5/16.
 */

@Controller
@RequestMapping("/project")
public class ProjectController {

    @Autowired
    private ProjectService projectService;

    @RequestMapping(value = "/find")
    public String find(Model model){
        model.addAttribute("projects", this.projectService.findAll());
        return "projects";
    }

    @RequestMapping(value = "/{projectId}")
    public String findProject(Model model, @PathVariable("projectId") int projectId){

        model.addAttribute("project", this.projectService.find(projectId));
        return "project";
    }


    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String addProject(){
        System.out.println("invoking addProject");
        return "project_add";
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String saveProject(){
        System.out.println("invoking saveProject");
        return "project_add";
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST, params = {"type=multi"})
    public String saveMultiYearProject(){
        System.out.println("invoking multiYearProject");
        return "project_add";
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST, params = {"type=multi", "special"})
    public String saveSpecialProject(){
        System.out.println("invoking Special Project");
        return "project_add";
    }
}
