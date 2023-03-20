//
//Pizza orderPiza(String type) {
//    Pizza Pizza;
//
//    if(type.equals("cheese")) {
//        pizza = new CheesePizza();
//    } else if(type.equals("greek")) {
//        pizza = new GreekPizza();
//    } else if(type.equals("pepperoni")) {
//        pizza = new PepperoniPizza();
//    }
//    pizza.prepare();
//    pizza.bake();
//    pizza.cut();
//    pizza.box();
//    return pizza;
//}

package factoryMethodPattern;
public abstract class Pizza {
    String name;
    String dough;
    String sauce;
    List<string> toppings = new ArrayList<String>();
    void prepare() {
        System.out.println("준비 중" + name);
        System.out.println("도우를 돌리는 중...");
        System.out.println("소스를 뿌리는 중...");
        System.out.println("토핑을 올리는 중");
        
        for (string topping : toppings) {
            System.out.println(" " + topping);
        }
    }
    
    void bake() {
        System.out.println("175도에서 25분간 굽기");
    }
    
    void cut() {
        System.out.println("피자를 사선으로 자르기");
    }
    
    void box() {
        System.out.println("상자에 피자 담기");
    }
    
    public String getName() {
        return name;
    }
}