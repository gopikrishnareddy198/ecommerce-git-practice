package git.practice.users.service;

import git.practice.users.model.User;

public class UserService {


    public void validatedetailsAndCreateUser(User user) {
        System.out.println("Created by TL2 ");
        try {
            Class.forName("ojdbc");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


    }
}
