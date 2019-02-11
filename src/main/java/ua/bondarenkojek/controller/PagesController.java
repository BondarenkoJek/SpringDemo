package ua.bondarenkojek.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PagesController {

    @GetMapping("/login")
    public String getLoginPage() {
        return "login";
    }

    @GetMapping("/registration")
    public String getRegistrationPage() {
        return "registration";
    }
    @GetMapping("/developers")
    public String getDevelopers() {
        return "developers";
    }

    @GetMapping("/projects")
    public String getProjects() {
        return "projects";
    }
}
