package br.com.dicasdeumdev.userapi.configs;

import br.com.dicasdeumdev.userapi.domains.User;
import br.com.dicasdeumdev.userapi.repositories.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.List;

@Configuration
@Profile("test")
@AllArgsConstructor
public class AppConfig {

    private UserRepository userRepository;

    @Bean
    public void startDB() {
        User user1 = new User(null, "Felipe", "felipe@gmail.com", "123");
        User user2 = new User(null, "Susi", "susi@gmail.com", "456");
        User user3 = new User(null, "Jack", "jack@gmail.com", "789");
        User user4 = new User(null, "Louis", "louis@gmail.com", "987");

        userRepository.saveAll(List.of(user1, user2, user3, user4));
    }
}