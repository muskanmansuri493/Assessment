
public class CreatingClassObjectMethod {

    // Member variables (if any)

    // Constructor
    public CreatingClassObjectMethod() {
        // Initialization code (if any)
    }

    // Method to perform addition
    public int add(int a, int b) {
        return a + b;
    }

    // Main method to run the program
    public static void main(String[] args) {
        // Create an object of the Calculator class
        CreatingClassObjectMethod myCalculator = new CreatingClassObjectMethod();

        // Call the add method using the object
        int sum = myCalculator.add(10, 20);

        // Print the result
        System.out.println("The sum is: " + sum);
    }
}