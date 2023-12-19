package com.hello.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hello.project.model.LoginBean;

@Controller
public class LoginController {
	@RequestMapping("/toLogin")
	public String toLogin(Model model) {
		/*loginBean与login.html页面中的th:object="${loginBean}"相同，类似于Spring MVC的表单绑定。*/
		model.addAttribute("loginBean", new LoginBean());
		return "login";
	}
	@RequestMapping("/login")
	 public String greetingSubmit(@ModelAttribute LoginBean loginBean) {
/*@ModelAttribute LoginBean loginBean接收login.html页面中的表单数据，并将loginBean对象保存到model中返回给result.html页面显示。*/
		System.out.println("测试提交的数据：" + loginBean.getUname());
	    return "result";
	 }
}
