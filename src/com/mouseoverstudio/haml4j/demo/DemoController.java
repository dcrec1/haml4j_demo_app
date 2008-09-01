package com.mouseoverstudio.haml4j.demo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.vraptor.annotations.Component;
import org.vraptor.annotations.Out;

@Component
public class DemoController {

	@Out
	private String title;

	@Out
	private String information;

	@Out
	private String header1;

	@Out
	private String header2;

	@Out
	private List<Entry> entries;

	public String ampersand() {
		return "ok";
	}

	public String basic() {
		title = "I was born in the controller";
		return "ok";
	}

	public String big() {
		title = "Haml4j test with a big file";
		header1 = "Header title number 1";
		header2 = "Header title number 2";
		entries = new ArrayList<Entry>();
		entries.add(new Entry("Title 1", new Date(), "fewgew gew gewggw"));
		entries.add(new Entry("Title 2", new Date(), "ewr wer t43t43btrn5"));
		entries.add(new Entry("Title 3", new Date(), "ijt hrt rgrehrhg reg"));
		return "ok";
	}

	public String condition() {
		return "ok";
	}

	public String escape() {
		return "ok";
	}

	public String haiku() {
		title = "Hamlj4 Demonstration";
		information = "VRaptor urls are sexy, together with Haml even more!";
		return "ok";
	}

	public String loop() {
		return "ok";
	}

}
