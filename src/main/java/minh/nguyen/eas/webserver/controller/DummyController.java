package minh.nguyen.eas.webserver.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DummyController {

	@RequestMapping("/")
	public String sayHi() {
		return "Hi!";
	}
	
}
