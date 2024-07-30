package factoryPattern;

public class PizzaTestDrive {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        Pizza pizza = nyStore.orderPizza("cheese");

        Pizza pizza2 = nyStore.orderPizza("pepperoni");

        PizzaStore chicagoStore = new ChicagoPizzaStore();
        Pizza pizza3 = chicagoStore.orderPizza("cheese");

    }
}
