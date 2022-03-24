package practice;
import java.math.BigDecimal;

abstract class Fruit {
  String name;
  BigDecimal price;

  Fruit(String name, BigDecimal price) {
    this.name = name;
    this.price = price;
  }

  abstract protected String getName();

  abstract protected BigDecimal getPrice();
}