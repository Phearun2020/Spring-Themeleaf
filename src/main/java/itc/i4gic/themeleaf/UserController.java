package itc.i4gic.themeleaf;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class UserController {
   
   @GetMapping("/if-unless")
   public String users(Model model) {
      List<User> users = new ArrayList<>();
      users.add(new User("Teacher1", "sok@gmail.com", "Teacher"));      
      users.add(new User("Student1", "student1@gmail.com", "Student"));      
      users.add(new User("Student2", "student2@gmail.com", "Student"));
      model.addAttribute("users", users);
      return "if-unless";
   }

   @GetMapping("/switch-case")
   public String switchTest(Model model) {
      User user = new User("Teacher2", "teacher2@gmail.com", "Teacher");
      model.addAttribute("user", user);
      return "switch-case";
   }
   
}
