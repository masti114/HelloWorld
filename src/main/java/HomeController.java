import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

public class HomeController {

    @Controller
    public class Homecontroller{
        @RequestMapping("/")
        public String homePage(){
            return "index";
        }

    }
}
