package itc.i4gic.themeleaf;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class HelloThymeleaf {
   @GetMapping("/hello")
   public String hello(Model model) {
      model.addAttribute("message", "Hello world");
       return "helloworld";
   }
}
