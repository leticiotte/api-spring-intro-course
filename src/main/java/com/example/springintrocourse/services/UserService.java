package com.example.springintrocourse.services;

import com.example.springintrocourse.domain.User;
import com.example.springintrocourse.repositories.UserRepository;
import com.example.springintrocourse.services.exceptions.UserNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository repository;
    public User findById(Integer id){
        Optional<User> user = repository.findById(id);
        return user.orElseThrow(() -> new UserNotFoundException("User with id " + id + " not found!"));
    }

    public List<User> findAll() {
        return repository.findAll();
    }

    public User update(Integer id, User userUpdates) {
        User user = findById(id);
        user.setName(userUpdates.getName());
        user.setLogin(userUpdates.getLogin());
        user.setPassword(userUpdates.getPassword());
        return repository.save(user);
    }

    public User create(User user) {
        user.setId(null);
        return repository.save(user);
    }

    public void delete(Integer id) {
        User user = findById(id);
        repository.deleteById(id);
    }
}
