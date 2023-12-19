package com.hello.project.model;

import java.util.List;
import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component//使用Component注解，声明一个组件，被控制器依赖注入
@ConfigurationProperties(prefix = "obj")//obj为配置文件中key的前缀
public class StudentProperties {
	private String sname;
	private int sage;
	private List<String> hobby;
	private Map<String, String> city;
	
	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public int getSage() {
		return sage;
	}

	public void setSage(int sage) {
		this.sage = sage;
	}

	public List<String> getHobby() {
		return hobby;
	}

	public void setHobby(List<String> hobby) {
		this.hobby = hobby;
	}

	public Map<String, String> getCity() {
		return city;
	}

	public void setCity(Map<String, String> city) {
		this.city = city;
	}

	@Override
    public String toString() {
        return "StudentProperties [sname=" + sname 
        		+ ", sage=" + sage 
        		+  ", hobby0=" + hobby.get(0) 
        		+ ", hobby1=" + hobby.get(1) 
        		+ ", city=" + city +  "]";
    }
}
