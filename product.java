import java.util.Scanner; // Importing the Scanner class from java.util package

class Details { // Definition of the Details class
    String pname; // Instance variable to store product name
    int pcode, pprice; // Instance variables to store product code and price

    // Constructor definition for Details class
    Details() { // Constructor to initialize pname, pcode, and pprice
        Scanner input = new Scanner(System.in); // Creating a Scanner object for user input
        System.out.println("Enter the product code:"); // Prompting user to enter product code
        pcode = input.nextInt(); // Reading integer input for product code
        input.nextLine(); // Consuming newline left after nextInt() to prevent skipping input
        System.out.println("Enter the product name:"); // Prompting user to enter product name
        pname = input.nextLine(); // Reading string input for product name
        System.out.println("Enter the product price:"); // Prompting user to enter product price
        pprice = input.nextInt(); // Reading integer input for product price
    }
}

public class product { // Definition of the main class named product
    public static void main(String[] args) { // Main method, the entry point of the program
        Details p1 = new Details(); // Creating an object p1 of Details class, prompting user input
        Details p2 = new Details(); // Creating another object p2 of Details class, prompting user input
        Details p3 = new Details(); // Creating another object p3 of Details class, prompting user input

        System.out.println("Product 1 details:"); // Printing header for product 1 details
        // Printing details of product 1: name, code, and price
        System.out.println("Product Name: " + p1.pname + ", Product Code: " + p1.pcode + ", Product Price: " + p1.pprice);
        
        System.out.println("Product 2 details:"); // Printing header for product 2 details
        // Printing details of product 2: name, code, and price
        System.out.println("Product Name: " + p2.pname + ", Product Code: " + p2.pcode + ", Product Price: " + p2.pprice);
        
        System.out.println("Product 3 details:"); // Printing header for product 3 details
        // Printing details of product 3: name, code, and price
        System.out.println("Product Name: " + p3.pname + ", Product Code: " + p3.pcode + ", Product Price: " + p3.pprice);
        
        // Comparing product prices to find the highest priced product
        if (p1.pprice > p2.pprice) { // Checking if price of p1 is greater than p2
            if (p1.pprice > p3.pprice) { // Checking if price of p1 is also greater than p3
                System.out.println("Product 1 price is greater: " + p1.pprice); // Printing message if p1 has highest price
            } else {
                System.out.println("Product 3 price is greater: " + p3.pprice); // Printing message if p3 has highest price
            }
        } else { // If price of p1 is not greater than p2
            if (p2.pprice > p3.pprice) { // Checking if price of p2 is greater than p3
                System.out.println("Product 2 price is greater: " + p2.pprice); // Printing message if p2 has highest price
            } else {
                System.out.println("Product 3 price is greater: " + p3.pprice); // Printing message if p3 has highest price
            }
        }
    }
}
