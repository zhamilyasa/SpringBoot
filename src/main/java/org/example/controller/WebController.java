package org.example.controller;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.example.model.entity.User;
import org.example.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@RequestMapping(value = "/ui", method = RequestMethod.POST)
@RequiredArgsConstructor
@Getter
@Setter
public class WebController {
    @GetMapping("/users")
    public String users(Model user, UserService userService) {
        List<User> users = (List<User>) userService.getByUsername();
        user.addAttribute("color", "red");
        user.addAttribute("users", users);

        return "index.html";
    }

}
