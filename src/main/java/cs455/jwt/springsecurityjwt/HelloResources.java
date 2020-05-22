package cs455.jwt.springsecurityjwt;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloResources {

    @GetMapping("/hello")
    public String hello() {
        return "Hello World";
    }
}
