package factoryPattern;

public class PizzaTestDrive {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        nyStore.orderPizza("cheese");
        Pizza pizza = nyStore.createPizza("cheese");

        PizzaStore nyStore2 = new ChicagoPizzaStore();
        nyStore2.orderPizza("cheese");
        Pizza pizza2 = nyStore.createPizza("cheese");


//        Pizza pizza2 = nyStore.orderPizza("pepperoni");
//
//        PizzaStore chicagoStore = new ChicagoPizzaStore();
//        Pizza pizza3 = chicagoStore.orderPizza("cheese");

    }
}
