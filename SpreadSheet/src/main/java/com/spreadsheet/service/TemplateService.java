package com.spreadsheet.service;

import java.util.List;

import com.spreadsheet.model.Template;

public interface TemplateService {

	void addTemplate(Template template);
	List<Template> loadAllTemplate();
	void addAllTemplate(List<Template> template);
	void deleteAllTemplate();
}
