package com.lanihuang.simplewebapp.beans;

public class Product {

  private String code;
  private String name;
  private float price;
  private int barCode;
  private String city;
  private String state;

  public Product() {

  }

  public Product(String code, String name, float price) {
    this.code = code;
    this.name = name;
    this.price = price;
    this.barCode = barCode;
    this.city = city;
    this.state = state;
  }

  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public float getPrice() {
    return price;
  }

  public void setPrice(float price) {
    this.price = price;
  }
  
  public String getState(){
    return state;
  }
  
  public void setState(String State){
    this.state = state;
  }
  
  public String getCity(){
    return city;
  }
  
  public void setCity(){
    this.city = city;
  }
}
