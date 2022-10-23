package org.example;

import org.example.models.User;
import org.example.service.UserService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )throws Exception {
        UserService userService=new UserService();
        User user =new User(
                "Asan",
                "Asanov",
                "+996778543213",
                "asan1@gmail.com",
                "asan"
        );
        User user1=new User(
                "Uson",
                "Usonov",
                "+996778543310",
                "uson1@gmail.com",
                "uson"
        );
        userService.register(user);
        userService.register(user1);
        userService.findAll().forEach(System.out::println);
    }
}
