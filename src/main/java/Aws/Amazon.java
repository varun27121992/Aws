package Aws;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Amazon {
	@GetMapping(value="/go")
	public String Japan() {
		return "Anime";
	}

}
