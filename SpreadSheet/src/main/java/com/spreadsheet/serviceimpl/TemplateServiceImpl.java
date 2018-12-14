package com.spreadsheet.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spreadsheet.model.Template;
import com.spreadsheet.repository.TemplateRepo;
import com.spreadsheet.service.TemplateService;

@Service("templateService")
public class TemplateServiceImpl implements TemplateService{
	
	@Autowired
	TemplateRepo templateRepo;
	
	@Override
	public void addTemplate(Template template) {
		System.out.println("Single template :"+template.toString());
		templateRepo.save(template);			
	}

	@Override
	public List<Template> loadAllTemplate() {
		return templateRepo.findAll();
	}

	@Override
	public void addAllTemplate(List<Template> templateList) {		
		System.out.println("Inside addAllTemplates");
		deleteAllTemplate();	
		for(Template template :templateList) {			
			System.out.println("Printing ...."+template.toString());
			templateRepo.save(template);
		}
		//templateList.forEach(template->template.toString());
		//templateList.forEach(template -> templateRepo.save(template));	
	}

	@Override
	public void deleteAllTemplate() {
		System.out.println("Inside deletemethod");
		templateRepo.deleteAll();
	}	
}
