package ua.bondarenkojek.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import ua.bondarenkojek.model.Developer;
import ua.bondarenkojek.service.DeveloperService;

@Controller
@RequestMapping("/")
public class DevController {
    @Autowired
    private DeveloperService developerService;

    @GetMapping
    public String index() {
        return "index";
    }

    @GetMapping("developer/{id}")
    public String getDeveloper(@PathVariable("id") Long id, Model model) {
        Developer developer = developerService.get(id);
        System.out.println(developer.getId());
        model.addAttribute("developer", developer);
        return "developer";
    }
}
