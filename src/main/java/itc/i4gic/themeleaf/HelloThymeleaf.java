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

   @GetMapping("/hi")
   public String task01(Model model) {
      model.addAttribute("message", "Hello Task01");
       return "hi";
   }
   
   @GetMapping("/style")
   public String task02() {
       return "html-css-js";
   }

   @GetMapping("/bootstrap")
   public String task03() {
       return "add-bootstrap";
   }
}
