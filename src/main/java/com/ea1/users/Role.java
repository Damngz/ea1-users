package com.ea1.users;

public class Role {
  private int id;
  private String name;

  public Role(int id, String name) {
    this.id = id;
    this.name = name;
  }

  // Getters y setters
  public int getId() {
    return id;
  }

  public String getName() {
    return name;
  }
}
