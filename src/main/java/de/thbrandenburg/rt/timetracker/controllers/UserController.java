package de.thbrandenburg.rt.timetracker.controllers;

import de.thbrandenburg.rt.timetracker.entities.User;
import de.thbrandenburg.rt.timetracker.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class UserController {

    @Autowired
    UserRepository userRepository;

    @GetMapping("/getUser")
    public String getUser(Model model, @RequestParam long id) {
        User user = userRepository.findById(id).orElseThrow();
        System.out.println(user);
        model.addAttribute("user", user);
        return "user/userDetails";
    }

    @GetMapping("/getUsers")
    public String getUser(Model model) {
        List<User> users = (List<User>) userRepository.findAll();
        for(User user : users) {
            System.out.println(user.getName());
            System.out.println(user);
        }
        model.addAttribute("users",  userRepository.findAll());
        return "user/userList";
    }

    @PostMapping("createUser")
    public User createUser(@RequestParam String name, @RequestParam String password) {
        //alternative
//        User myUser1 = new User();
//        myUser1.setName(name);
//        myUser1.setPassword(password);

        User myUser = User.builder().name(name).password(password).build();
        userRepository.save(myUser);
        return myUser;
    }
}
