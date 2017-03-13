package pl.mbudzinski;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by marcin on 24.02.17.
 */
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String helloWorld() {

        return "Hello World";
    }


}
