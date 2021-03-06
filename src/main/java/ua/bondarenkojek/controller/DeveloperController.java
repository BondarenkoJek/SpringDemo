package ua.bondarenkojek.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ua.bondarenkojek.dto.DeveloperDto;
import ua.bondarenkojek.service.DeveloperService;

import java.util.List;

@RestController
@RequestMapping("/developers")
public class DeveloperController {

    @Autowired
    private DeveloperService developerService;

    @GetMapping("/")
    public List<DeveloperDto> getAll() {
        List<DeveloperDto> developers = developerService.findAll();
        return developers;
    }

    @PostMapping("/")
    public ResponseEntity create() {
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PutMapping("/")
    public ResponseEntity update() {
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity delete(@PathVariable("id") Long id) {
        developerService.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}

