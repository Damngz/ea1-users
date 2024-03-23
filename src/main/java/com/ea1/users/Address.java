package com.ea1.users;

public class Address {
  private int id;
  private String region;
  private String city;
  private String street;
  private int postalCode;

  public Address(int id, String region, String city, String street, int postalCode) {
    this.id = id;
    this.region = region;
    this.city = city;
    this.street = street;
    this.postalCode = postalCode;
  }

  // Getters y setters
  public int getId() {
    return id;
  }

  public String getRegion() {
    return region;
  }

  public String getCity() {
    return city;
  }

  public String getStreet() {
    return street;
  }

  public int getPostalCode() {
    return postalCode;
  }
}
