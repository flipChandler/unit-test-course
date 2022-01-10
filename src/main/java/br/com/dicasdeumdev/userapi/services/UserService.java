package br.com.dicasdeumdev.userapi.services;

import br.com.dicasdeumdev.userapi.domains.User;

public interface UserService {

    User findById(Integer id);
}