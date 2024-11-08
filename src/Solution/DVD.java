package Solution;

/**
 * Represents a DVD item that can be loaned.
 * Inherits from LoanItem and implements the print method to describe the DVD.
 */
public class DVD extends LoanItem
{
    /**
     * Constructor for DVD
     * @param itemName The name of the DVD
     * @param rentalPrice The rental price of the DVD
     */
    public DVD(String itemName, double rentalPrice)
    {
        super(itemName, rentalPrice);
    }

    /**
     * Provides a string representation of the DVD for display.
     * @return Formatted string with DVD details.
     */
    @Override
    public String print()
    {
        return "DVD titled '" + itemName + "' rents for R" + rentalPrice;
    }
}
