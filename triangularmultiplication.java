class triangle {
    public static void main(String[] args) {
        int n = 5; // Number of rows in the triangle (adjust as needed)
        
        // Outer loop controls the number of rows
        for (int i = 1; i <= n; i++) {
            // Inner loop prints numbers for each row
            for (int j = 1; j <= i; j++) {
                // Print the product of i and j followed by a space
                System.out.print(i * j + " ");
            }
            // Move to the next line after printing all numbers for the current row
            System.out.println();
        }
    }
}
