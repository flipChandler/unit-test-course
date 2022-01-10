package br.com.dicasdeumdev.userapi.services.impl;

import br.com.dicasdeumdev.userapi.domains.User;
import br.com.dicasdeumdev.userapi.domains.dtos.UserDTO;
import br.com.dicasdeumdev.userapi.repositories.UserRepository;
import br.com.dicasdeumdev.userapi.services.UserService;
import br.com.dicasdeumdev.userapi.services.exceptions.ObjectNotFoundException;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Service
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;
    private ModelMapper mapper;

    @Override
    public User findById(Integer id) {
        Optional<User> optional = userRepository.findById(id);
        return optional.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado!"));
    }

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public User create(UserDTO dto) {
        return userRepository.save(mapper.map(dto, User.class));
    }
}