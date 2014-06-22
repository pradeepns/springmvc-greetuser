import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
@RequestMapping("/greetUser/{username}")
public class GreetUser {
	
	@RequestMapping(method=RequestMethod.GET)
	public String greetUser(@PathVariable String username, Model model) {
		model.addAttribute("message", "Hello user " + username);
		return "helloworld";
	}
}
