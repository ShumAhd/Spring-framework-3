package ro.shum.ProductManagementApp;

import lombok.Data;

@Data
public class Product {

  private Long id;
  private String name;
  private double price;

}