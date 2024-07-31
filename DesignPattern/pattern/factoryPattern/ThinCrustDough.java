package factoryPattern;

public class ThinCrustDough implements Dough{
    public ThinCrustDough createDough(){
        return new ThinCrustDough();
    }
}
