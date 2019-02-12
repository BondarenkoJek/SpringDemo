package ua.bondarenkojek.controller;

import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class PagesController {

    @GetMapping("/")
    public String getIndexPage() {
        return "index";
    }

    @GetMapping("/login")
    public String getLoginPage(Authentication authentication, ModelMap model, HttpServletRequest request) {
        if (authentication != null) {
            return "redirect:/";
        }

        if (request.getParameterMap().containsKey("error"))
            model.addAttribute("error", true);
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
