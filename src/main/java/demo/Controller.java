package demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Training on 2017. 08. 11..
 */

@RestController
public class Controller {

    @RequestMapping("/")
    public String home(){
        return "Hello, spring boot!";
    }
}
