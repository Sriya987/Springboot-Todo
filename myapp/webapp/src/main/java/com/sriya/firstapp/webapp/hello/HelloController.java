package com.sriya.firstapp.webapp.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
public class HelloController {
	//say-hello => hello
	@RequestMapping("say-hello")
	@ResponseBody
	public String SayHello() {
		return "Hello! What're u learning today";
	}
	@RequestMapping("say-hello-html")
	@ResponseBody
	public String SayHelloHtml() {
		StringBuffer sb=new StringBuffer();
		sb.append("<html>");
		sb.append("<head>");
		sb.append("<title>");
		sb.append("Html page");
		sb.append("</title>");
		sb.append("</head>");
		sb.append("<body>");
		sb.append("Hello Guys from html body");
		sb.append("</body>");
		sb.append("<lhtml>");
		return sb.toString();
	}
	//jsp
	@RequestMapping("say-hello-jsp")
	public String SayHelloJsp(){
		return "sayHello";
	}
}
