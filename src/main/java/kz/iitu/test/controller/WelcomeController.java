package kz.iitu.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WelcomeController {
    @GetMapping({"/index", "/"})
    public String getWelcome() {
        return "welcome";
    }
    @GetMapping({"/register", "/"})
    public String registerPage() {
        return "register";
    }
}
