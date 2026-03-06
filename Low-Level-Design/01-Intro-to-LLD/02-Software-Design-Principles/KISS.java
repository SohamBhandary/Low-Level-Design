

/*
KISS Principle (Keep It Simple, Stupid)

Definition:
The KISS principle states that systems and code should be kept
as simple as possible. We should avoid unnecessary complexity
and prefer clear, easy-to-understand solutions.

Benefit:
- Easier to read
- Easier to maintain
- Fewer bugs
*/

public class KISS {

    // Simple method to check if a number is even
    // Instead of writing complex logic, we use a simple condition
    static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static void main(String[] args) {

        int num = 10;

        // Simple and readable logic
        if (isEven(num)) {
            System.out.println("Number is Even");
        } else {
            System.out.println("Number is Odd");
        }
    }
}