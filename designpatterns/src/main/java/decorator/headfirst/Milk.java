package decorator.headfirst;

public class Milk implements Beverage {

  Beverage beverage;

  public Milk(Beverage beverage) {
    this.beverage = beverage;
  }

  @Override
  public double cost() {
    return 5 + beverage.cost();
  }
}
