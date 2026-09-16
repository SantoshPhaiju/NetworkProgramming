package FirstClass;

public class Main {
    public static void main(String[] args) {
        // Program to take the command line arguments and print the sum of the two numbers

        try {
            Integer a = Integer.parseInt(args[0]);
            Integer b = Integer.parseInt(args[1]);
            int sum = a + b;
            System.out.println("Sum of " + a + " and " + b + " is " + sum);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Please enter two numbers: " + e);
        }
    }
}
