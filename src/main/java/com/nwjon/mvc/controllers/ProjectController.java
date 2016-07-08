package com.nwjon.mvc.controllers;

import com.nwjon.mvc.data.entities.Project;
import com.nwjon.mvc.data.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

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
    public String addProject(HttpSession session){
        session.setAttribute("token", "12345");
        System.out.println("invoking addProject");
        return "project_add";
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String saveProject(@ModelAttribute Project project){


        System.out.println(project.getName());

        return "project_add";
    }
}
