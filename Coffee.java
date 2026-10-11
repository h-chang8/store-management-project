/*
 * The Coffee class represents a coffee beverage.
 * It inherits flavor, price, and size from the Beverage class
 * and adds an isHot attribute.
 */
public class Coffee extends Beverage {
  // Stores whether the coffee is hot
  private boolean isHot;

   /*
   * Sets the default coffee flavor to black,
   * price to 3.00, and size to medium.
   */
  public Coffee (){
    super("black", 3.00, "medium");
  }

  
  /*
   * Initializes the coffee's
   * flavor, price, size, and temperature.
   */
  public Coffee (String flavor, double price, String size, boolean isHot){
    super(flavor, price, size);
    this.isHot = isHot;
  }

  // Returns whether if coffee is hot
  public boolean getIsHot(){
    return isHot;
  }

  // Updates whether if coffee is hot
  public void setIsHot(boolean newIsHot){
    isHot = newIsHot;
  }

  
  /*
   * Returns the beverage information from Beverage's toString()
   * and adds whether the coffee is hot.
   */
  public String toString(){
    return super.toString() + "\nIs Hot? " + isHot;
  }
  
}