import java.util.Scanner;

public class PrimeNumberChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Check if the number is prime
        if (isPrime(number)) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }

        scanner.close();
    }

    // Method to check if a number is prime
    public static boolean isPrime(int num) {
        // Handle edge cases
        if (num <= 1) {
            return false;
        }
        // Check divisibility from 2 to the square root of num
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false; // num is divisible by i, so it's not prime
            }
        }
        return true; // num is prime
    }
}

