package com.ea1.users;

import java.util.List;

public class User {
  private int id;
  private String username;
  private String password;
  private String email;
  private String name;
  private List<Address> addresses;
  private Role role;

  public User(int id, String username, String password, String email, String name, List<Address> addresses, Role role) {
    this.id = id;
    this.username = username;
    this.password = password;
    this.email = email;
    this.name = name;
    this.addresses = addresses;
    this.role = role;
  }

  // Getters y setters
  public int getId() {
    return id;
  }

  public String getUsername() {
    return username;
  }

  public String getPassword() {
    return password;
  }

  public String getEmail() {
    return email;
  }

  public String getName() {
    return name;
  }

  public List<Address> getAddresses() {
    return addresses;
  }

  public Role getRole() {
    return role;
  }
}
