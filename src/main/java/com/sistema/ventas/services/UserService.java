package com.sistema.ventas.services;

import com.sistema.ventas.entities.Product;
import com.sistema.ventas.entities.User;
import com.sistema.ventas.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public List<User> listUser() {
        return repository.findAll();
    }

    public void saveUser(User user){
        repository.save(user);
    }

    public User getUserById(Integer id){
        return repository.findById(id).get();
    }
}
