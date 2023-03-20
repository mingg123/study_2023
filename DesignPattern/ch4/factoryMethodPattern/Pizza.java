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

import java.util.*;
// public abstract class Pizza {
//     String name;
//     String dough;
//     String sauce;
//     List<String> toppings = new ArrayList<String>();
//     void prepare() {
//         System.out.println("준비 중" + name);
//         System.out.println("도우를 돌리는 중...");
//         System.out.println("소스를 뿌리는 중...");
//         System.out.println("토핑을 올리는 중");
        
//         for (String topping : toppings) {
//             System.out.println(" " + topping);
//         }
//     }
    
//     void bake() {
//         System.out.println("175도에서 25분간 굽기");
//     }
    
//     void cut() {
//         System.out.println("피자를 사선으로 자르기");
//     }
    
//     void box() {
//         System.out.println("상자에 피자 담기");
//     }
    
//     public String getName() {
//         return name;
//     }
// }


public abstract class Pizza {
  String name;
  String dough;
  String sauce;
  String[] veggies[];
  String cheese;
  String pepperoni;
  String clam;

  abstract void prepare();

  
  void bake() {
      System.out.println("175도에서 25분간 굽기");
  }
  
  void cut() {
      System.out.println("피자를 사선으로 자르기");
  }
  
  void box() {
      System.out.println("상자에 피자 담기");
  }
  
  void setName(String name) {
    this.name = name;
  }

  public String getName() {
      return name;
  }

}