package git.practice.users.controller;

import git.practice.users.model.User;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController(value = "/users")
public class UsersController {

    @PostMapping(value = "/signup")
    public void signup(@RequestBody User user){

    }


}
