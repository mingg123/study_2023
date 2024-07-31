package factoryPattern;

public class SlicedPepperoni implements Pepperoni{
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }
}
