package factoryMethodPattern;

public class PizzaTestDrive {
    public static void main(String[] args) {

        // PizzaStore nyStore = new NYPizzaStore();
        // PizzaStore chicagoStore = new ChicagoPizzaStore();

        // Pizza pizza = nyStore.orderPizza("cheese");
        // System.out.println("에단이 주문한 " + pizza.getName());

        // pizza = chicagoStore.orderPizza("cheese");
        // System.out.println("조엘이 주문한 " + pizza.getName());

        PizzaStore nyPizzaStore = new NYPizzaStore();
        nyPizzaStore.orderPizza("cheese");
        // Pizza pizz = creatPizza("cheese");
    }
}