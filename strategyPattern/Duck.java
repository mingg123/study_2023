package strategyPattern;

public abstract class Duck {

  public FlyBehavior flyBehavior;
  public QuackBehavior quackBehavior;

  public Duck() {}

  public void performQuack() {
    quackBehavior.quack();
  }

  public void swim() {
    System.out.println("모든 오리는 수영한다.");
  }
  public abstract void display();

  public void performFly() {
    flyBehavior.fly();
  }

  // 동적으로 행동 지정하기
  public void setFlyBehavior(FlyBehavior fly) {
    flyBehavior = fly;
  }

  public void setQuackBehavior(QuackBehavior quack) {
    quackBehavior = quack;
  }
}