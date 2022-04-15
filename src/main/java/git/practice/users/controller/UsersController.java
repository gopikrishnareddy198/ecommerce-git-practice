package git.practice.users.controller;

import git.practice.users.model.User;
import git.practice.users.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController(value = "/users")
public class UsersController {


    @Autowired
    UserService userService;

    @PostMapping(value = "/signup")
    public void signup(@RequestBody User user){

            userService.validatedetailsAndCreateUser(user);


    }

    @PostMapping(value = "/sigin")
    public void sinin(){

    }
}
