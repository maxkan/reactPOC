package core;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Maksym on 5/25/2017.
 */
@Controller
public class MainController {

    @RequestMapping("/")
    public String index() {
        return "index.html";
    }
}
