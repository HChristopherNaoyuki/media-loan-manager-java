# LoanSystem

**LoanSystem** is a simple Java-based system designed to manage items that can be rented, like books and DVDs. Think of it as a library or rental store where items are borrowed for a period of time at a set price.

## Project Overview

The system uses an object-oriented approach to represent **loanable items**. There are two main types of items: **Books** and **DVDs**. Each item has two key properties: its **name** (e.g., "Java for Dummies" or "Argo") and its **rental price** (e.g., $29.99). The goal is to display these details in a structured way.

We achieve this by defining a **LoanItem** class as a blueprint (or abstract class) that defines the common features all loanable items share. Then, we create specific item types (like Book and DVD) that extend this blueprint and implement the details for each type.

## Key Components

### 1. **LoanItem Class (Abstract)**

The **LoanItem** class is like a general "template" for loanable items. It knows what properties an item has (like name and rental price), but it doesn’t specify exactly how each type of item will display those properties. This allows us to later create different types of loanable items with their own unique behavior.

### 2. **Book Class**

The **Book** class is a specialized version of the LoanItem. It represents a book and knows how to display the book’s details, such as the title and rental price, in a specific format (e.g., "Book titled 'Java for Dummies' rents for $29.99").

### 3. **DVD Class**

Similar to the Book class, the **DVD** class represents a DVD. It also knows how to format and display its details, such as the title and rental price (e.g., "DVD titled 'Argo' rents for $19.99").

### 4. **UseLoanItem Class**

This is the "test drive" of our system. It creates examples of both a book and a DVD, then prints out their details. It’s like a cashier in a rental store checking out the items before handing them over to customers!

## How It Works

1. **Create a loanable item**: First, we create instances of either a **Book** or a **DVD**, providing a name and rental price.
2. **Print details**: The system then prints out the details of these items in a user-friendly format.

For example:
- A book might print: `"Book titled 'Java for Dummies' rents for $29.99"`
- A DVD might print: `"DVD titled 'Argo' rents for $19.99"`

This simple structure can easily be extended to include other types of loanable items, like CDs, games, or even electronic devices!

## Example Code

Here’s how the system works:

```java
public class UseLoanItem
{
    public static void main(String[] args)
    {
        // Create a Book and a DVD
        LoanItem book = new Book("Java for Dummies", 29.99);
        LoanItem dvd = new DVD("Argo", 19.99);

        // Print out the details of each item
        System.out.println(book.print());
        System.out.println(dvd.print());
    }
}
```

### Output:
```
Book titled 'Java for Dummies' rents for $29.99
DVD titled 'Argo' rents for $19.99
```

## Running the Project

1. Clone the repository:  
   ```
   git clone https://github.com/HChristopherNaoyuki/media-loan-manager-java.git
   ```
   
2. Compile and run the Java files:  
   ```
   javac UseLoanItem.java LoanItem.java Book.java DVD.java
   java UseLoanItem
   ```

---
