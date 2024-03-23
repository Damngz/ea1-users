package com.ea1.users;

import java.util.List;

public class User {
  private int id;
  private String username;
  private String password;
  private String email;
  private String name;
  private List<Address> addresses;
  private List<Role> roles;

  public User(int id, String username, String password, String email, String name, List<Address> addresses, List<Role> roles) {
    this.id = id;
    this.username = username;
    this.password = password;
    this.email = email;
    this.name = name;
    this.addresses = addresses;
    this.roles = roles;
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

  public List<Role> getRoles() {
    return roles;
  }
}
