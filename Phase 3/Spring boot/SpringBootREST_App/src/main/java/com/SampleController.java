package com;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

	// http://localhost:8080/sayHello 
	@RequestMapping(value = "sayHello",method = RequestMethod.GET)
	public String sayHello() {
		return "Welcome to Spring Restfull Web Service using Spring boot";
	}
	
	@RequestMapping(value = "sayHtml",method = RequestMethod.GET,produces = MediaType.TEXT_HTML_VALUE)
	public String sayHtml() {
		return "<h2>Welcome to Spring Restfull Web Service using Spring boot</h2>";
	}

	@RequestMapping(value = "sayPlain",method = RequestMethod.GET,produces = MediaType.TEXT_PLAIN_VALUE)
	public String sayPlain() {
		return "<h2>Welcome to Spring Restfull Web Service using Spring booth</h2<<<<";
	}
	
	@RequestMapping(value = "sayXml",method = RequestMethod.GET,produces = MediaType.TEXT_XML_VALUE)
	public String sayXml() {
		return "<Abc>Welcome to Spring Restfull Web Service using Spring boot</Abc>";
	}
}
