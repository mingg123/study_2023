package factoryPattern;

public class FreshClams implements Clams{
    public Clams createClams() {
        return new FreshClams();
    }
}
