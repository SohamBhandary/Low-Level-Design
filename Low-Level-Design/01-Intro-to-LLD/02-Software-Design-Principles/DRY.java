

/*
DRY Principle (Don't Repeat Yourself)

Definition:
The DRY principle states that we should avoid writing the same
logic multiple times in a program. Instead, we should place the
common logic in a single method and reuse it wherever needed.

Benefit:
- Reduces code duplication
- Makes code easier to maintain
- Changes need to be made in only one place
*/

public class DRY {

    // Common method for calculating square
    // Instead of repeating this logic everywhere
    static int square(int number) {
        return number * number;
    }

    public static void main(String[] args) {

        int a = 5;
        int b = 8;

        // Reusing the same method instead of repeating logic
        System.out.println("Square of a: " + square(a));
        System.out.println("Square of b: " + square(b));
    }
}