package factoryPattern;

public class ReggianoCheese implements Cheese{
    public Cheese createCheese() {
        return new ReggianoCheese();
    }
}
