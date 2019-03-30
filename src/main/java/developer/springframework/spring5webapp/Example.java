package developer.springframework.spring5webapp;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.web.bind.annotation.*;

@RestController
@EnableAutoConfiguration
public class Example {

    @RequestMapping("/")
    String home() {

        System.out.println(" This is example");
        System.out.println(" This is example");

        return "Hello World! " +  " working ";
    }


}