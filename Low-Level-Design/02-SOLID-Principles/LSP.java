
/*
LSP - Liskov Substitution Principle

Definition:
A subclass should be able to replace
its parent class without breaking the program.
*/

// Parent class
class Bird {

    void fly() {
        System.out.println("Bird is flying");
    }
}


// Child class
class Sparrow extends Bird {

    void fly() {
        System.out.println("Sparrow is flying");
    }
}

public class LSP {

    public static void main(String[] args) {

        // Parent reference using child object
        Bird bird = new Sparrow();

        // Works correctly
        bird.fly();

        /*
        Since Sparrow behaves like Bird,
        we can substitute Sparrow wherever Bird is used.
        */
    }
}