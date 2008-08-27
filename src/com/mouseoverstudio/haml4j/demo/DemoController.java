package com.mouseoverstudio.haml4j.demo;

import org.vraptor.annotations.Component;
import org.vraptor.annotations.Out;

@Component
public class DemoController {
	
	@Out
	private String title;
	
	@Out
	private String information;
	
	public String basic() {
		title = "I was born in the controller";
		return "ok";
	}
	
	public String haiku() {
		title = "Hamlj4 Demonstration";
		information = "VRaptor urls are sexy, together with Haml even more!";
		return "ok";
	}

}
