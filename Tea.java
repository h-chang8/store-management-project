/*
 * The Tea class represents a tea beverage.
 * It inherits flavor, price, and size from the Beverage class
 * and adds an isSweetened attribute.
 */
public class Tea extends Beverage {
  // Stores whether the tea is sweetened
  private boolean isSweetened;

  /*
   * Sets the default tea flavor to green,
   * price to 3.50, and size to medium.
   */
  public Tea (){
    super("green", 3.50, "medium");
  }

   /*
   * Initializes the tea's
   * flavor, price, size, and sweetened status.
   */
  public Tea (String flavor, double price, String size, boolean isSweetened){
    super(flavor, price, size);
    this.isSweetened = isSweetened;
  }

  // Returns whether the tea is sweetened
  public boolean getIsSweetened(){
    return isSweetened;
  }

  // Updates whether the tea is sweetened
  public void setIsSweetened(boolean newIsSweetened){
    isSweetened = newIsSweetened;
  }

  /*
   * Returns the beverage information from Beverage's toString()
   * and adds whether the tea is sweetened.
   */
  public String toString(){
    return super.toString() + "\nIs Sweetened? " + isSweetened;
  }
  
}