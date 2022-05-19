package example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class PrintHello {
	@GetMapping(value = "/hi")
	String display() {
		return "hello";
	}

}