package SpringBootTest.my_first_application;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	@RequestMapping("/")
	public String home() {
		//System.out.println("here");
		return "Spring boot is working. Good work!!";
	}
}