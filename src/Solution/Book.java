package Solution;

/**
 * Represents a Book item that can be loaned.
 * Inherits from LoanItem and implements the print method to describe the book.
 */
public class Book extends LoanItem
{
    /**
     * Constructor for Book
     * @param itemName The name of the book
     * @param rentalPrice The rental price of the book
     */
    public Book(String itemName, double rentalPrice)
    {
        super(itemName, rentalPrice);
    }

    /**
     * Provides a string representation of the book for display.
     * @return Formatted string with book details.
     */
    @Override
    public String print()
    {
        return "Book titled '" + itemName + "' rents for R" + rentalPrice;
    }
}
