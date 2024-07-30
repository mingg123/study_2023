package factoryPattern;
import java.util.List;
import java.util.ArrayList;

public abstract class Pizza {
    String name;
    String dough;
    String sauce;
    List<String> toppings = new ArrayList<String>();

    public void prepare() {
        System.out.println("준비 중 " + name);
        for(String topping : toppings) {
            System.out.println("토핑: " + topping);
        }
    }

    public void bake() {
        System.out.println("bake");
    }

    public void cut() {
        System.out.println("cut");
    }

    public void box() {
        System.out.println("box");
    }

    public String getName() {
        return name;
    }
}
