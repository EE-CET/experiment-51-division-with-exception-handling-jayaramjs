import java.util.Scanner;

public class DivisionHandling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // We use try-catch to monitor code that might throw an error
        try {
            // Read inputs
            int a = sc.nextInt();
            int b = sc.nextInt();

            // This operation will throw an ArithmeticException if b is 0
            int result = a / b;
            
            // This line only executes if the division was successful
            System.out.println(result);

        } catch (ArithmeticException e) {
            // This block executes ONLY if b was 0
            System.out.println("Divide by zero error");
        } finally {
            // Good practice to close resources
            sc.close();
        }
    }
}
