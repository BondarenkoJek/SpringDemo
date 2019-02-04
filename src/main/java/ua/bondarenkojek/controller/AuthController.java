package ua.bondarenkojek.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import ua.bondarenkojek.model.Developer;


@Controller
@RequestMapping("/")
public class AuthController {

    @GetMapping
    public String getPage() {
        return "redirect:login";
    }

    @GetMapping("login")
    public String getLoginPage() {
        return "login";
    }

//    @PostMapping("login")
//    public ResponseEntity login() {
//
//    }

    @GetMapping("registration")
    public String getRegistrationPage() {
        return "registration";
    }
}
