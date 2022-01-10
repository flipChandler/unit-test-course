package br.com.dicasdeumdev.userapi.repositories;

import br.com.dicasdeumdev.userapi.domains.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
