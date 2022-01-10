package br.com.dicasdeumdev.userapi.services;

import br.com.dicasdeumdev.userapi.domains.User;

import java.util.List;

public interface UserService {

    User findById(Integer id);
    List<User> findAll();
}