package br.com.dicasdeumdev.userapi.services.impl;

import br.com.dicasdeumdev.userapi.domains.User;
import br.com.dicasdeumdev.userapi.services.exceptions.ObjectNotFoundException;
import br.com.dicasdeumdev.userapi.repositories.UserRepository;
import br.com.dicasdeumdev.userapi.services.UserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Service
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    @Override
    public User findById(Integer id) {
        Optional<User> optional = userRepository.findById(id);
        return optional.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado!"));
    }

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }
}