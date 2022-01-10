package br.com.dicasdeumdev.userapi.services;

import br.com.dicasdeumdev.userapi.domains.User;
import br.com.dicasdeumdev.userapi.domains.dtos.UserDTO;

import java.util.List;

public interface UserService {

    User findById(Integer id);
    List<User> findAll();
    User create(UserDTO dto);
    User update(UserDTO userDTO);
    void delete(Integer id);
}