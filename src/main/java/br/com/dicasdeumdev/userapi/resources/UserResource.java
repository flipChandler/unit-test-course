package br.com.dicasdeumdev.userapi.resources;

import br.com.dicasdeumdev.userapi.domains.User;
import br.com.dicasdeumdev.userapi.services.UserService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
@AllArgsConstructor
public class UserResource {

    private UserService userService;

    @GetMapping(value = "/{id}")
    public ResponseEntity<User> findById(@PathVariable Integer id) {
        return ResponseEntity.ok(userService.findById(id));
    }
}