package eu.rideg;

public class DeluxeHamburger extends Hamburger {

    // b) Deluxe hamburger - comes with chips and drinks as additions, but no extra additions are allowed.
    // hint:  You have to find a way to automatically add these new additions at the time the deluxe burger
    // object is created, and then prevent other additions being made.
    //  All 3 classes should have a method that can be called anytime to show the base price of the hamburger
    // plus all additionals, each showing the addition name, and addition price, and a grand/final total for the
    // burger (base price + all additions)
    // For the two additional classes this may require you to be looking at the base class for pricing and then
    // adding totals to final price.

    public DeluxeHamburger(String name, String breadRollType, String meat) {
        super("Deluxe burger", "best bread ever", meat);
    }


    private double price = 0;
    private int itemNumber = 0;

    // extra unique fields for deluxe hamburger, specific to this subclass
    private boolean chips;
    private boolean drinks;

    private double chipsPrice;
    private double drinksPrice;


        // constructor
    public DeluxeHamburger(String name, String breadRollType, String meat, boolean chips, boolean drinks, double chipsPrice, double drinksPrice) {
        super(name, breadRollType, meat);
        this.chips = chips;
        this.drinks = drinks;
        this.chipsPrice = 2.5;
        this.drinksPrice = 0.75;
    }

    @Override
    public void calculatePriceAndShowAdditionals(boolean lettuce, boolean tomato, boolean carrot, boolean onion, boolean cheese, boolean nachos, boolean paprika) {
        System.out.println("calculatePriceAndShowAdditionals of hamburger base class was called..");
        System.out.println("price: " + getPrice());
        super.calculatePriceAndShowAdditionals(false, false, false, false, false, false, false);
        super.setMaxAllowedItems(2); // only chips and drinks are the additions. no further addition is allowed!
        System.out.println("price (from hamburger super class): " + this.price);

        calculatePriceAndShowDeluxeAdditionals();

    }

    public void calculatePriceAndShowDeluxeAdditionals() {
        System.out.println("calculatePriceAndShowDeluxeAdditionals() was called.");

        this.itemNumber = getItemNumber(); // itemNumber must be reset to 0 at the beginning. (in case of multiple calling of the function)
        System.out.println("itemNumber in calculatePriceAndShowDeluxeAdditionals() is: " + this.itemNumber);

        this.price = getPrice(); // price must be reset to 0 at the beginning.(in case of multiple calling of the function)
        System.out.println("base price in calculatePriceAndShowDeluxeAdditionals() is: " + this.price);

        this.chips = chips;
        this.drinks = drinks;

        price += this.chipsPrice;
        System.out.println("Chips:"   + this.chipsPrice +" $");
        System.out.println("Actual price: " + this.price);

        price += this.drinksPrice;
        System.out.println("Drinks:"   + this.drinksPrice +" $");
        System.out.println("Total price of " + DeluxeHamburger.this + ": "  + this.price +" $");

    }

    // getters for drinks and chips price
    public double getChipsPrice() {
        return chipsPrice;
    }

    public double getDrinksPrice() {
        return drinksPrice;
    }


}
