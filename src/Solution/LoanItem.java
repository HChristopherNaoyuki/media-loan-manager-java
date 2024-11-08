package Solution;

/**
 * Abstract class representing a Loan Item.
 * Provides the basic structure for any item that can be loaned, including
 * common attributes such as item name and rental price, and abstract methods.
 */
public abstract class LoanItem
{
    // Name of the item
    protected String itemName;
    
    // Rental price for the item
    protected double rentalPrice;
    
    /**
     * Constructor for LoanItem
     * @param itemName The name of the item
     * @param rentalPrice The rental price of the item
     */
    public LoanItem(String itemName, double rentalPrice)
    {
        this.itemName = itemName;
        this.rentalPrice = rentalPrice;
    }

    // Getter for itemName
    public String getItemName()
    {
        return itemName;
    }

    // Setter for itemName
    public void setItemName(String itemName)
    {
        this.itemName = itemName;
    }

    // Getter for rentalPrice
    public double getRentalPrice()
    {
        return rentalPrice;
    }

    // Setter for rentalPrice
    public void setRentalPrice(double rentalPrice)
    {
        this.rentalPrice = rentalPrice;
    }

    /**
     * Abstract method to return a String description of the item.
     * To be implemented by subclasses to provide specific details.
     * @return Description of the item.
     */
    public abstract String print();
}
