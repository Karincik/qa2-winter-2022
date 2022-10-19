package hw1;

import org.junit.jupiter.api.Test;

public class BagObjectPractice {
   @Test
    public void workingWithBag() {
       Bag firstBag = new Bag();
       firstBag.setBrand("Furla");
       firstBag.setColor("Red");
       firstBag.setPrice(85.00);
       firstBag.setType("Small Bag");

       Bag secondBag = new Bag();
       secondBag.setBrand("Levi's");
       secondBag.setColor("Black");
       secondBag.setPrice(65.50);
       secondBag.setType("Backpack");

       System.out.println("Hi, Dima!");
       System.out.println("1st bag");
       System.out.println(firstBag.getBrand());

       System.out.println("2nd bag");
       System.out.println(secondBag.getBrand());


    }
}
