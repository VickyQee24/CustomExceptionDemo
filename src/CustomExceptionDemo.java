import java.util.Scanner;
// Main Class
    public class CustomExceptionDemo {

        // Method that checks age
        public static void checkAge(int age) throws InvalidAgeException {
            if (age < 18) {
                throw new InvalidAgeException();
            } else {
                System.out.println("Age is valid: " + age);
            }
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter your age: ");
            int age = scanner.nextInt();

            try {
                checkAge(age);
            } catch (InvalidAgeException e) {
                System.out.println("Caught an exception: " + e.getMessage());
            } finally {
                scanner.close();
            }
        }
    }


