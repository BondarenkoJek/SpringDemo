package ua.bondarenkojek.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import ua.bondarenkojek.dto.UserDto;
import ua.bondarenkojek.dto.UserLoginInput;
import ua.bondarenkojek.dto.UserRegistrationInput;
import ua.bondarenkojek.model.User;
import ua.bondarenkojek.service.UserService;

@Controller
@RequestMapping("/")
public class AuthController {

    @Autowired
    private UserService userService;

    @GetMapping
    public String getPage() {
        return "redirect:login";
    }

    @GetMapping("login")
    public String getLoginPage() {
        return "login";
    }

    @PostMapping("login")
    public ResponseEntity login(@RequestBody UserLoginInput userLoginInput) {
        UserDto userDto = userService.geUserByLogin(userLoginInput.getLogin());

        HttpStatus status = HttpStatus.NOT_FOUND;

        if (userDto != null && userDto.getPassword().equals(userLoginInput.getPassword())) {
            status = HttpStatus.OK;
        }

        return new ResponseEntity(status);
    }

    @GetMapping("registration")
    public String getRegistrationPage() {
        return "registration";
    }

    @PostMapping("registration")
    @ResponseBody
    public ResponseEntity registration(@RequestBody UserRegistrationInput user) {
        userService.add(user);
        return new ResponseEntity(HttpStatus.OK);
    }
}
