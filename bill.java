// Importing the java.util package to use Scanner and Date classes
import java.util.*;

// Definition of an interface Billgen with a method calculate()
interface Billgen {
    int calculate(); // Method signature for calculating total bill amount
}

// Class productB implementing the Billgen interface
class productB implements Billgen {
    // Instance variables for product details
    String name;
    int prodid, quantity, unitprice, total;
    
    // Default constructor
    productB() {}
    
    // Parameterized constructor to initialize product details
    productB(String n, int p, int q, int u) {
        name = n;
        prodid = p;
        quantity = q;
        unitprice = u;
    }
    
    // Implementation of the calculate method to compute total cost
    public int calculate() {
        total = quantity * unitprice; // Calculate total cost based on quantity and unit price
        return total; // Return the computed total
    }
}

// Main class Bill to handle input, processing, and output
public class Bill {
    public static void main(String[] args) {
        productB[][] order; // Declaration of a 2D array to store product orders
        System.out.println("Enter number of orders:"); // Prompting user to input number of orders
        Scanner sc = new Scanner(System.in); // Creating a Scanner object to read user input
        int n = sc.nextInt(); // Reading number of orders from user
        order = new productB[n][]; // Initializing the 2D array with number of orders
        
        // Loop to iterate through each order
        for (int i = 0; i < n; i++) {
            System.out.println("Enter number of products for order " + (i + 1) + ":"); // Prompting user for number of products in each order
            int m = sc.nextInt(); // Reading number of products in current order
            order[i] = new productB[m]; // Initializing the array for products in current order
            
            // Loop to iterate through each product in the current order
            for (int j = 0; j < m; j++) {
                System.out.println("Enter product " + (j + 1) + " name:"); // Prompting user for product name
                String a = sc.next(); // Reading product name
                System.out.println("Enter product id:"); // Prompting user for product id
                int b = sc.nextInt(); // Reading product id
                System.out.println("Enter product quantity:"); // Prompting user for product quantity
                int c = sc.nextInt(); // Reading product quantity
                System.out.println("Enter product unit price:"); // Prompting user for product unit price
                int d = sc.nextInt(); // Reading product unit price
                productB pb = new productB(a, b, c, d); // Creating a new productB object with read inputs
                order[i][j] = pb; // Storing the product object in the 2D array
                order[i][j].total = order[i][j].calculate(); // Calculating and storing the total cost for the product
            }
        }

        // Loop to iterate through each order and display details
        for (int i = 0; i < n; i++) {
            int sum = 0; // Variable to store total sum for the current order
            System.out.println("Order no: " + (i + 1)); // Printing order number
            Date date = java.util.Calendar.getInstance().getTime(); // Getting current date and time
            System.out.println(date); // Printing current date and time
            System.out.println("............."); // Printing separator
            // Printing headers for product details
            System.out.printf("%5s %20s %15s %10s %10s\n", "Product ID", "Name", "Quantity", "Unit Price", "Total");
            System.out.println("...................................................."); // Printing separator

            // Loop to iterate through each product in the current order and display details
            for (int j = 0; j < order[i].length; j++) {
                // Printing product details formatted with proper spacing
                System.out.printf("%5d %20s %15d %10d %10d\n", order[i][j].prodid, order[i][j].name, order[i][j].quantity, order[i][j].unitprice, order[i][j].total);
            }

            System.out.println("...................................................."); // Printing separator
            
            // Loop to calculate total sum for the current order
            for (int k = 0; k < order[i].length; k++) {
                sum += order[i][k].total; // Adding product total to sum
            }
            
            System.out.println("Net amount: " + sum); // Printing net amount for the current order
            System.out.println("...................................................."); // Printing separator
        }
    }
}

