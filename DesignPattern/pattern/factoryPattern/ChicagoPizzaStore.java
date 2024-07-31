package factoryPattern;

public class ChicagoPizzaStore extends PizzaStore {
    Pizza pizza = null;

    PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();
    protected Pizza createPizza(String type) {
        if (type.equals("cheese")) {
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("시카고 스타일 치즈 피자");
        } else if(type.equals("clam")) {
            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("시카고 스타일 조개 피자");
        } else if(type.equals("pepperoni")) {
            pizza = new PepperoniPizza(ingredientFactory);
            pizza.setName("시카고 스타일 페퍼로니 피자");
        } else if(type.equals("veggie")) {
            pizza = new VeggiePizza(ingredientFactory);
            pizza.setName("시카고 스타일 야채 피자");
        }
        return pizza;
    }
//    @Override
//    protected Pizza createPizza(String type) {
//        if(type.equals("cheese")) {
//            return new ChicagoStyleCheesePizza();
//        } else if(type.equals("pepperoni")) {
//            return new ChicagoStylePepperoniPizza();
//        }
//        return null;
//    }
}
