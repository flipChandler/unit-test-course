package br.com.dicasdeumdev.userapi.repositories;

import br.com.dicasdeumdev.userapi.domains.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer> {
    Optional<User> findByEmail(String email);
}