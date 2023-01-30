/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package duke.choice;

/**
 *
 * @author JJ
 */
public class Clothing {
    private String description;
    private double price;
    private String size = "M";
    
    //Exercise 5-1: Apply encapsulation
    //Add two constants to Clothing Class
    //minimum price and tax rate
    private final double minPrice = 10.0;
    private final double tax = 0.2;
    
    //Exercise 5-1: Apply encapsulation
    /*
    //right click select insert code: Getter & Setter plus encapsulate
    //netBeans will replace all direct Clothing & Customer variable references 
    //in the main method of the ShopApp classn with corresponding set & get method invocations.
    */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        //add logic to the getPrice method to automatically add tax
        return price + (price*tax);
    }

    public void setPrice(double price) {
        //this.price = price;
        //add logic to setPrice method that ensures price is never smaller than the minimum value
        this.price = (price > minPrice)? price : minPrice;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
    
}