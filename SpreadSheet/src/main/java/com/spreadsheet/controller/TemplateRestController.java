package com.spreadsheet.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spreadsheet.model.Template;
import com.spreadsheet.service.TemplateService;


@RestController
@RequestMapping(value="/spread-sheet")
@CrossOrigin(origins="http://localhost:4200",allowedHeaders="*")
public class TemplateRestController {
	
	@Autowired
	@Qualifier("templateService")
	private TemplateService templateService;


	@GetMapping(value="/alltemplates")
	public List<Template> getAllTemplates(){
		return templateService.loadAllTemplate();
	}	

	@PostMapping(value="/alltemplates")
	public void addOnUpload(@RequestBody List<Template> templateList) {
		for(Template template :templateList) {			
			System.out.println("Template :"+ template.toString());
		}
		templateService.addAllTemplate(templateList);
	}
	@PostMapping(value="/template")
	public void addTemplate(@RequestBody Template template) {		
		System.out.println("Single Template :"+template.toString());
		templateService.addTemplate(template);
	}
	
	
}
