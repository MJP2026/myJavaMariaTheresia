package com.maria.theresa;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping("/kammer")
	public String kammer() {
		return "Hallo meine neue schöne Kammer!";
	}

	@GetMapping("/name")
	public String name() {
		return "My Name is Maria Theresa";
	}

	@GetMapping("/git")
	public String now_with_git() {
		return "Now it is working with GIT";
	}
}