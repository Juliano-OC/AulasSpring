package OliveiraJuliano.ExemploGradleWEBRestController.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Juliano Oliveira
 * @version 1.0
 * @since 4/18/2020
 */
@RestController
public class HelloWorldController {

    @GetMapping("/")
    public String index() {
        return "Hello World!";
    }

}