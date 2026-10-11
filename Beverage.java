/*
 * The Beverage class represents a beverage with a flavor,
 * price, and size.
 */

public class Beverage {
  // Instance variables to store the beverage's information
  private String flavor;
  private double price;
  private String size;

   /*
   * Sets the default flavor to "original",
   * price to 2.50, and size to "medium".
   */
  public Beverage(){
    this("original", 2.50, medium);
  }

  // Initializes the beverage's attributes
  public Beverage (String flavor, double price, String size){
    this.flavor = flavor;
    this.price = price;
    this.size = size;
  }

  // Returns the beverage's flavor
  public String getFlavor(){
    return flavor;
  }

  // Returns the beverage's price
  public double getPrice(){
    return price;
  }

  // Returns the beverage's size
  public String getSize(){
    return size;
  }

  // Updates the beverage's flavor
  public void setFlavor(String newFlavor){
    flavor = newFlavor;
  }

  // Updates the beverage's price
  public void setPrice(double newPrice){
    if (newPrice < 0){
      price = 0;
    } else {
      price = newPrice;
    }
  }

  // Updates the beverage's size
  public void setSize(String newSize){
    size = newSize;
  }

  /*
   * Returns a String containing the beverage's flavor,
   * price, and size.
   */
   public String toString(){
    return "Flavor: " + flavor + "\nPrice: " + price + "\nSize: " + size;
  }

  
  
}