package factoryPattern;

public class ChicagoStylePepperoniPizza extends Pizza {
    public ChicagoStylePepperoniPizza() {
        name = "시카고 스타일 페퍼로니 피자";
        dough = "두꺼운 크러스트 도우";
        sauce = "피자 소스";
        toppings.add("페퍼로니");
    }
}
