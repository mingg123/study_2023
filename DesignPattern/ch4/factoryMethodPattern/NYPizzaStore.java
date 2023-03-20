package factoryMethodPattern;
// public class NYPizzaStore extends PizzaStore {
//     Pizza createPizza(String item) {
//         if (item.equals("cheese")) {
//             return new NYStyleCheesePizza();
//         } else if (item.equals("veggie")) {
//             // return new NYStyleVeggiePizza();
//         } else if (item.equals("clam")) {
//             // return new NYStyleClamPizza();
//         } else if (item.equals("pepperoni")) {
//             // return new NYStylePeperoniPizza();
//         } else return null;
//         return null;
//     }
// }

public class NYPizzaStore extends PizzaStore {

  protected Pizza createPizza(String item) {
    Pizza pizza = null;
    PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();

    if(item.equals("cheese")) {
      pizza = new CheesePizza(ingredientFactory);
      pizza.setName("뉴욕 스타일 치즈 피자");
    }
    return pizza;
  }

}