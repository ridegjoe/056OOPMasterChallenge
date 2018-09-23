package eu.rideg;

public class HealthyBurger extends Hamburger {


    public HealthyBurger(String name, String breadRollType, String meat) {
        super("Healthy burger", "brown rye bread roll", meat);
    }

    @Override
    public void calculatePriceAndShowAdditionals(boolean lettuce, boolean tomato, boolean carrot, boolean onion, boolean cheese, boolean nachos, boolean paprika) {
        super.calculatePriceAndShowAdditionals(lettuce, tomato, carrot, onion, cheese, nachos, paprika);
        super.setMaxAllowedItems(6);
        System.out.println("Overriding base hamburger for healthy was performed.");
    }


}
