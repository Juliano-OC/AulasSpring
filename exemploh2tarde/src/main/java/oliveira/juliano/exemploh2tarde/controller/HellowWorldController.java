package oliveira.juliano.exemploh2tarde.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HellowWorldController {

    @GetMapping("/")
    public String index() {
        return "Seja bem vindo ao sistema!";
    }
}