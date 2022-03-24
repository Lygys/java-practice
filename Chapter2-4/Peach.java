package practice;
import java.math.BigDecimal;

class Peach extends Fruit {
  Peach(String name, BigDecimal price) {
    super(name, price);
  }

  @Override
  protected String getName() {
    return name;
  }

  @Override
  protected BigDecimal getPrice() {
    return price;
  }
}

