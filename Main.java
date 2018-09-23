package eu.rideg;


public class Main {

    public static void main(String[] args) {
// TIM BUCHALKA'S JAVA MASTERCLASS CHALLENGE START
//
        // The purpose of the application is to help a fictitious company called Bills Burgers to manage
        // their process of selling hamburgers.
        // Our application will help Bill to select types of burgers, some of the additional items (additions) to
        // be added to the burgers and pricing.
        // We want to create a base hamburger, but also two other types of hamburgers that are popular ones in Bills store.
        // The basic hamburger should have the following items.
        // Bread roll type, meat and up to 4 additional additions (things like lettuce, tomato, carrot, etc) that
        // the customer can select to be added to the burger.
        // Each one of these items gets charged an additional price so you need some way to track how many items got added
        // and to calculate the final price (base burger with all the additions).
        // This burger has a base price and the additions are all separately priced (up to 4 additions, see above).
        // Create a Hamburger class to deal with all the above.
        // The constructor should only include the roll type, meat and price, can also include name of burger or you
        // can use a setter.
        // Also create two extra varieties of Hamburgers (subclasses) to cater for
        // a) Healthy burger (on a brown rye bread roll), plus two addition items that can be added.
        // The healthy burger can have 6 items (Additions) in total.
        // hint:  you probably want to process the two additional items in this new class (subclass of Hamburger),
        // not the base class (Hamburger), since the two additions are only appropriate for this new class
        // (in other words new burger type).
        // b) Deluxe hamburger - comes with chips and drinks as additions, but no extra additions are allowed.
        // hint:  You have to find a way to automatically add these new additions at the time the deluxe burger
        // object is created, and then prevent other additions being made.
        //  All 3 classes should have a method that can be called anytime to show the base price of the hamburger
        // plus all additionals, each showing the addition name, and addition price, and a grand/final total for the
        // burger (base price + all additions)
        // For the two additional classes this may require you to be looking at the base class for pricing and then
        // adding totals to final price.
//
// END OF CHALLENGE FOR OBJECT-ORIENTED PROGRAMMING
//
//      link to the Java course of Tim Buchalka at udemy.com:
//      https://www.udemy.com/java-the-complete-java-developer-course/

// The code with the solution is made by myself.

        System.out.println("BEGINNING OF BASE BURGER TEST #########################################");
        Hamburger hamburger = new Hamburger ("base","Barbecue","Beef"); // By defining parameters you call the constructor
        hamburger.calculatePriceAndShowAdditionals(true,true,true,true,false,false, false);

        hamburger.calculatePriceAndShowAdditionals(true,true,true,true,true,true, true);

        hamburger.calculatePriceAndShowAdditionals(false,false,false,false,false,false, false);

        hamburger.calculatePriceAndShowAdditionals(true,false,true,true,true,true, false);
        System.out.println("END OF BASE BURGER TEST ###############################################");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("BEGINNING OF HEALTHY BURGER TEST ######################################");

        Hamburger healthyBurger = new HealthyBurger ("base","Barbecue","Beef");
        healthyBurger.calculatePriceAndShowAdditionals(true,true,true,true,false,false, false);

        healthyBurger.calculatePriceAndShowAdditionals(true,true,true,true,true,false, false);

        healthyBurger.calculatePriceAndShowAdditionals(false,false,false,false,false,false, false);
        System.out.println("END OF HEALTHY BURGER TEST #############################################");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("BEGINNING OF DELUXE BURGER TEST ########################################");

        Hamburger deluxeBurger = new DeluxeHamburger ("deluxe","Barbecue","Beef", false, false,1.75,1.25);
        deluxeBurger.calculatePriceAndShowAdditionals(true,true,true,true,false,false, false);

        deluxeBurger.calculatePriceAndShowAdditionals(true,true,true,true,true,false, false);

        deluxeBurger.calculatePriceAndShowAdditionals(false,false,false,false,false,false, false);
        System.out.println("END OF DELUXE BURGER TEST ###############################################");
    }
}
