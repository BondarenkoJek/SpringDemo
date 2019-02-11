package ua.bondarenkojek.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import ua.bondarenkojek.dto.DeveloperDto;
import ua.bondarenkojek.service.DeveloperService;
import ua.bondarenkojek.util.DtoUtil;

import java.util.List;

@Controller
@RequestMapping("/developer")
public class DeveloperController {
    @Autowired
    private DeveloperService developerService;

    @GetMapping("/")
    public String index(Model model) {
        List<DeveloperDto> developers = developerService.findAll();
        model.addAttribute("developers", developers);
        return "index";
    }

    @GetMapping("/jqDev")
    public String index() {

        return "developerJquery";
    }

    @GetMapping("/all")
    @ResponseBody
    public List<DeveloperDto> getAll() {
        List<DeveloperDto> developers = developerService.findAll();
        return developers;
    }

    @GetMapping("/info/{id}")
    public String getDeveloper(@PathVariable("id") Long id, Model model) {
        DeveloperDto developer = developerService.get(id);
        model.addAttribute("developer", developer);
        return "developerInfo";
    }

    @GetMapping("/create")
    public String createDeveloper() {
        return "createDeveloper";
    }

    @PostMapping("/create")
    public String createDeveloper(@ModelAttribute DeveloperDto developer) {
        developerService.add(DtoUtil.parseDtoToDeveloper(developer));
        return "redirect:/developer/";
    }

    @DeleteMapping("/{id}")
    @ResponseBody
    public ResponseEntity deleteDeveloper(@PathVariable("id") Long id) {
        developerService.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
