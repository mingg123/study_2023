package strategyPattern;

public class main {
  public static void main(String[] args) {
    Duck mallard = new MallardDuck();
    mallard.performFly();
    mallard.performQuack();

    mallard.setFlyBehavior(new FlyNoWay());
    mallard.performFly();
  } 
}
