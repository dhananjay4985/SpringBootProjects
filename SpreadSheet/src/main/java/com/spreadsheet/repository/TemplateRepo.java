package com.spreadsheet.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spreadsheet.model.Template;

@Repository
public interface TemplateRepo extends JpaRepository<Template, Long> {

	
}
