package Solution;

/**
 * UseLoanItem class to test the LoanItem, Book, and DVD classes.
 * Demonstrates the creation of book and DVD items and displays their details.
 */
public class UseLoanItem
{
    public static void main(String[] args)
    {
        // Create an instance of Book
        LoanItem book = new Book("Java for Dummies", 559.99);

        // Create an instance of DVD
        LoanItem dvd = new DVD("Argo", 29.99);

        // Print details of each loan item
        System.out.println(book.print());
        System.out.println(dvd.print());
    }
}
