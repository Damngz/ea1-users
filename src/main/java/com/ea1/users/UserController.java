package com.ea1.users;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {
  private List<User> users = new ArrayList<>();

  public UserController() {
    users.add(new User(
      0,
      "admin",
      "admin",
      "admin@usersstore.cl",
      "Admin",
      Arrays.asList(
        new Address(1, "Metropolitana", "Santiago", "Avenida Cuatro Poniente 2357", 9250000)
      ),
      Arrays.asList(
        new Role(0, "Admin")
      ))
    );
    users.add(new User(
      1,
      "user1",
      "userPassword1",
      "user1@fictional.cl",
      "User 1",
      Arrays.asList(
        new Address(1, "Metropolitana", "Santiago", "Avenida Apoquindo 4500", 7550000)
      ),
      Arrays.asList(
        new Role(1, "Usuario"),
        new Role(2, "Cliente nivel 1")
      ))
    );
    users.add(new User(
      2,
      "user2",
      "userPassword2",
      "user2@fictional.cl",
      "User 2",
      Arrays.asList(
        new Address(1, "Metropolitana", "Santiago", "Avenida Kennedy 4500", 7550000),
        new Address(2, "Metropolitana", "Santiago", "Calle Agustinas 1000", 8320000),
        new Address(2, "Metropolitana", "Santiago", "Avenida Las Condes 20837", 7013029)
      ),
      Arrays.asList(
        new Role(1, "Usuario"),
        new Role(2, "Cliente nivel 3")
      ))
    );
  }

  @GetMapping("/users")
  public List<User> getUsers() {
    return users;
  }

  @GetMapping("/users/{id}")
  public ResponseEntity<?> getUser(@PathVariable int id) {
    for (User user : users) {
      if (user.getId() == id) {
        return ResponseEntity.ok(user);
      }
    }

    ErrorMessage errorMessage = new ErrorMessage(404, "No se encontró un usuario con el id: " + id);
    return ResponseEntity.status(HttpStatus.NOT_FOUND).body(errorMessage);
  }
}
