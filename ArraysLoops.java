public class ArraysLoops {
    public static void main(String[] args) {
        // Array to store names
        String[] names = {"Zach", "Harry", "Scott", "Ruiz", "Michael", "Jordan", "Kobe", "Bryant", "Stephen", "Curry"};

        // Loop to check and print the elements in the array: "names"
        System.out.println("Names Array: ");
        for(int i = 0; i < names.length; i++){
            System.out.println(names[i]); // Print each name in the array
        }

        // Array to store numbers
        int[] numbers = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21, 23, 25, 27, 29, 31, 33, 35, 37, 39};
        int sum = 0; // Variable to store the sum of numbers

        System.out.println("\nNumbers Array: ");

        // Loop to check and print the numbers in the array: "numbers"
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]); // Print each number in the array
            sum += numbers[i]; // Add each number to the sum
        }
        System.out.println("Sum: " + sum); // Print the total sum of the numbers

        // 2D array (matrix) of integers
        int[][] integers = {{1,2,3}, {3,4,5}, {5,6,7}, {7,8,9}};

        // Loop to print 2D array using traditional nested for loops
        System.out.println("\nFor Loop: ");
        for (int i = 0; i < integers.length; i++) {
            for(int j = 0; j < integers[i].length; j++) {
                System.out.print(integers[i][j] + " "); // Print element at row i, column j
            }
            System.out.println(); // Move to the next line after each row
        }

        // Loop to print 2D array using enhanced for loop
        System.out.println("\nEnhanced For Loop: ");
        for (int[] rows : integers) {
            for (int values : rows) {
                System.out.print(values + " "); // Print each value in the current row
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}