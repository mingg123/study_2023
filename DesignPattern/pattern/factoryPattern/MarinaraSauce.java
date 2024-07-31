package factoryPattern;

public class MarinaraSauce implements Sauce{
    public Sauce createSauce() {
        return new MarinaraSauce();
    }
}
