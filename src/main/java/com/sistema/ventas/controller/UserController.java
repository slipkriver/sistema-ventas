package com.sistema.ventas.controller;

import com.sistema.ventas.entities.Product;
import com.sistema.ventas.entities.User;
import com.sistema.ventas.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService service;

    @GetMapping("/users")
    public List<User> listUser() {
        return service.listUser();
    }

    @PostMapping("/users")
    public void saveUser(@RequestBody User user) {
        service.saveUser(user);
    }

}
