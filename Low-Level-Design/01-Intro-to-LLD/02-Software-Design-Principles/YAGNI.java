

/*
YAGNI Principle (You Aren't Gonna Need It)

Definition:
The YAGNI principle states that developers should not add
functionality until it is actually required.

In simple words:
Do not build features for the future if they are not needed now.

Benefit:
- Keeps code simple
- Avoids unnecessary complexity
- Saves development time
*/

public class YAGNI {

    // Simple method to add two numbers
    // We only implement what is needed right now
    static int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {

        // Currently we only need addition
        int result = add(10, 20);

        System.out.println("Sum: " + result);

        /*
        We are NOT adding extra methods like:
        multiply()
        divide()
        power()

        because the application does not need them yet.
        This follows the YAGNI principle.
        */
    }
}