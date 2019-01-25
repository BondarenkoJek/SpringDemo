package ua.bondarenkojek.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import ua.bondarenkojek.model.Developer;
import ua.bondarenkojek.service.DeveloperService;

@Controller
public class DevController {
    @Autowired
    private DeveloperService developerService;

    @GetMapping("/")
    public String index() {
        developerService.add(Developer.builder().build());
        return "index";
    }
}
