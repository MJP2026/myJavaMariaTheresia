package com.maria.theresa;

import com.maria.theresa.api.HelloApi;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController implements HelloApi {

	@Override
	public ResponseEntity<String> getName() {
		return ResponseEntity.ok("My Name is Maria Theresa");
	}

	@Override
	public ResponseEntity<String> getKammer() {
		return ResponseEntity.ok("Hallo meine neue schöne Kammer!");
	}

	@Override
	public ResponseEntity<String> getGit() {
		return ResponseEntity.ok("Now it is working with GIT");
	}

	@Override
	public ResponseEntity<String> getBall() {
		return ResponseEntity.ok("I have a ball");
	}
}