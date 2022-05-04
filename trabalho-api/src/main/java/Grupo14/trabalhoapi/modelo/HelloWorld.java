package Grupo14.trabalhoapi.modelo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {
	@RequestMapping("/")
	@ResponseBody
	public String hello() {
		return "Hello World";
	}
}
