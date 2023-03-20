package factoryMethodPattern;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {

  public String createDough() {
    // return new ThinCrustDough();
    return "ThinCrustDough";
  }

  public String createSauce() {
    // return new MarinaraSauce();
    return "MarinaraSauce";
  }

  public String createCheese() {
    // return new ReggianoCheese();
    return "ReggianoCheese";
  }

  public String[] createVeggies() {
    // String veggies[] = {new Garlic(), new Onion(), new Mushroom(), new RedPepper()};
    String veggies[] = {"Garlic", "Onion", "Mushroom", "RedPepper"};
   return veggies;
  }

  public String createPepperoni() {
    // return new SlicedPepperoni();
    return "SlicedPepperoni";
  }

  public String createClam() {
    // return new FreshClams();
    return "FreshClams";
  }
  
}
