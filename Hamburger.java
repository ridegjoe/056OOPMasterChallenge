package eu.rideg;

public class Hamburger {
    // The variables are set to private, in order to keep them encapsulated from other classes.
    private String name; // base, healthy, deluxe
    private String breadRollType;
    private String meat;            // beef, pork, chicken
    private boolean lettuce;
    private boolean tomato;
    private boolean carrot;
    private boolean onion;
    private boolean cheese;
    private boolean nachos;
    private boolean paprika;

    private double basePrice= 2;

    private double lettucePrice = 1;
    private double tomatoPrice = 2;
    private double carrotPrice = 0.5;
    private double onionPrice = 0.75;
    private double cheesePrice = 1.25;
    private double nachosPrice= 0.75;
    private double paprikaPrice= 1.75;

    private double price = 0;

    private int itemNumber;
    private int maxAllowedItems=4; // for base burger it is 4. for healthy burger (later) 6. for deluxe burger 0.

    // The constructor with default values
    public Hamburger() {
        this("default name", "default breadRollType", "default meat");
        System.out.println("Empty hamburger constructor with default parameters called.");
    }

    // "The constructor should only include the roll type, meat and price, can also include name of burger or you
    // can use a setter." Description by Tim Buchalka
    public Hamburger(String name, String breadRollType, String meat) {
        System.out.println("Hamburger constructor with parameters called.");
        this.name = "base ";
        this.breadRollType = breadRollType;
        this.meat = meat;
        //       this.price = price;
    }

    // "Maybe a new method should be created as input generator(type of hamburgers, extras, etc)" Description by Tim Buchalka
     public void calculatePriceAndShowAdditionals(boolean lettuce, boolean tomato, boolean carrot, boolean onion, boolean cheese, boolean nachos, boolean paprika) {
        this.itemNumber = 0; // itemNumber must be reset to 0 at the beginning. (in case of multiple calling of the function)
        this.price = 0; // price must be reset to 0 at the beginning.(in case of multiple calling of the function)

        this.lettuce = lettuce;
        this.tomato = tomato;
        this.carrot = carrot;
        this.onion = onion;
        this.cheese = cheese;
        this.nachos = nachos;
        this.paprika = paprika;

         System.out.println("");
         if (this.lettuce) {
            itemNumber++;
         }
         if (this.tomato) {
             itemNumber++;
         }
         if (this.carrot) {
             itemNumber++;
         }
         if (this.onion) {
             itemNumber++;
         }
         if (this.cheese) {
             itemNumber++;
         }
         if (this.nachos) {
             itemNumber++;
         }
         if (this.paprika) {
             itemNumber++;
         }

         // test for maximum number of allowed items
         System.out.println("");
         System.out.println(this.name + " burger -> this.maxAllowedItems: " + this.maxAllowedItems);
         System.out.println(this.name + " burger -> maxAllowedItems: " + maxAllowedItems);
         System.out.println("");
         // end of test

         System.out.println("Number of additionals after counting: " + itemNumber);
         if ((this.itemNumber>=0) && (this.itemNumber<=this.maxAllowedItems)) {
             if (name.equals("base")) {
                 System.out.println("The following type of burger was selected: " + this.name);
                 price += this.getBasePrice();
                 System.out.println("Base price is: " +this.getBasePrice());
             }
             System.out.println("Price of " + this.name + " hamburger without additional cost: " + basePrice);
             price += basePrice;
             if (lettuce) {
                 price += this.getLettucePrice();
                 System.out.println("Lettuce: " + this.lettucePrice +" $");
//                 System.out.println("Actual price is " + price +" $"); // test
             }
             if (tomato) {
                 price += this.getTomatoPrice();
                 System.out.println("Tomato: "  + this.tomatoPrice +" $");
//                 System.out.println("Actual price is " + price +" $"); // test
             }
             if (carrot) {
                 price += this.getCarrotPrice();
                 System.out.println("Carrot: "  + this.carrotPrice +" $");
//                 System.out.println("Actual price is " + price +" $"); // test
             }
             if (onion) {
                 price += this.getOnionPrice();
                 System.out.println("Onion:"  + this.onionPrice +" $");
//                 System.out.println("Actual price is " + price +" $"); // test
             }
             if (cheese) {
                 price += this.getCheesePrice();
                 System.out.println("Cheese: "  + this.cheesePrice +" $");
//                 System.out.println("Actual price is " + price +" $"); // test
             }
             if (nachos) {
                 price += this.getNachosPrice();
                 System.out.println("Nachos: "  + this.nachosPrice +" $");
//                 System.out.println("Actual price is " + price +" $"); // test
             }
             if (paprika) {
                 price += this.getPaprikaPrice();
                 System.out.println("Chips:"   + this.paprikaPrice +" $");
//                 System.out.println("Actual price is " + price +" $"); // test
             }
             System.out.println("Total price of " + this.name + ": " + price +" $");
         }
         else if(this.itemNumber < 0) {
             System.out.println("The number of additionals is negative: " +this.itemNumber );
         }
         else {
             System.out.println("The number of additionals " +this.itemNumber + " exeeds maximum: " + this.maxAllowedItems  );
             System.out.println("The price will not be calculated. Please reduce the number of selected additionals to " + this.maxAllowedItems +" !");
         }
     }

    // getters for enabling private fields from main class
    private double getBasePrice() {
        return basePrice;
    }

    private double getLettucePrice() {
        return lettucePrice;
    }

    private double getTomatoPrice() {
        return tomatoPrice;
    }

    private double getCarrotPrice() {
        return carrotPrice;
    }

    private double getOnionPrice() {
        return onionPrice;
    }

    private double getCheesePrice() {
        return cheesePrice;
    }

    private double getNachosPrice() {
        return nachosPrice;
    }

    private double getPaprikaPrice() {
        return paprikaPrice;
    }

    public double getPrice() {
        return price;
    }

    public int getItemNumber() {
        return itemNumber;
    }

//    public int getMaxAllowedItems() {
//        return maxAllowedItems;
//    }

    // Getter and setter for maximum allowed number of items (4 for super, 6 for sub class of "healthy burger")
    public int getMaxAllowedItems() {
        return maxAllowedItems;
    }

    public void setMaxAllowedItems(int maxAllowedItems) {
        this.maxAllowedItems = maxAllowedItems;
    }

}
