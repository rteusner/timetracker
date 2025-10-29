package de.thbrandenburg.rt.timetracker.controllers;

import de.thbrandenburg.rt.timetracker.entities.User;
import de.thbrandenburg.rt.timetracker.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    UserRepository userRepository;

    @GetMapping("/helloUser1")
    public String hello(@RequestParam long id) {
        System.out.println(userRepository.findById(id).toString());
        return "test";
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
