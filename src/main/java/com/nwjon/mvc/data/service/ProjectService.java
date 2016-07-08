package com.nwjon.mvc.data.service;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

import com.nwjon.mvc.data.entities.Project;

public class ProjectService {

		private List<Project> projects = new LinkedList<>();
		
		public ProjectService(){
			Project javaProject = this.createProject("Java Project", "This is a Java Project", 1 );
			Project javascriptProject = this.createProject("Javascript Project", "This is a Javascript Project", 2);
			Project htmlProject = this.createProject("HTML Project", "This is an HTML project", 3);
			
			this.projects.addAll(Arrays.asList(new Project[]{javaProject, javascriptProject, htmlProject}));
		}
		
		public List<Project> findAll(){
			return this.projects;
		}
		
		public Project find(int projectId){
			return this.projects.stream().filter(i -> i.getProjectId() == projectId).collect(Collectors.toList()).get(0);
		}

		private Project createProject(String title, String description, int projectId) {
			Project project = new Project();
			project.setProjectId(projectId);
			project.setName(title);
			project.setAuthorizedFunds(new BigDecimal("100000"));
			project.setAuthorizedHours(new BigDecimal("1000"));
			project.setSpecial(false);
			project.setType("multi");
			project.setYear("2015");
			project.setDescription(description);
			return project;
		}
		
		
		
}
