public class VariableScope {
    // Global variable
    static int x = 10;

    public static void main(String[] args) {
        // Local variable
        int x = 20;
        System.out.println("Local variable x: " + x);

        // Accessing global variable
        System.out.println("Global variable x: " + VariableScope.x);
    }
}