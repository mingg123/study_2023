package strategyPattern;

public class MallardDuck  extends Duck{

  public MallardDuck() {
    flyBehavior = new FlyWithWings();
    quackBehavior = new Quack();
  }

  @Override
  public void display() {
  System.out.println("저는 물 오리 입니다.");
  }
  
}
