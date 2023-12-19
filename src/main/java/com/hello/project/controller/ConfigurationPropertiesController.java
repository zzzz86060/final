package com.hello.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.hello.project.model.StudentProperties;

@RestController
public class ConfigurationPropertiesController {
	 @Autowired
	 StudentProperties studentProperties;

	 @RequestMapping("/testConfigurationProperties")
	 public String  testConfigurationProperties() {
		 return studentProperties.toString();
	 }
}
