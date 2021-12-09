package decorator.headfirst;

public class StarbuzzCoffee {

  public static void main(String[] args) {

    Beverage coffe = new Coffee();
    coffe = new Milk(coffe);

    System.out.println(coffe.cost());
  }

}
