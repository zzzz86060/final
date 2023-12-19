package com.hello.project.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LogTestController {
	private final Log log = LogFactory.getLog(LogTestController.class);

	@RequestMapping("/testLog")
	public String testLog() {
		System.out.println("测试");
		log.info("测试日志");
		return "测试日志" ;
	}
}
