/*
DIP - Dependency Inversion Principle

Definition:
High-level modules should not depend
on low-level modules.

Both should depend on abstractions.
*/


// Abstraction
interface InputDevice {
    void connect();
}


// Low-level class
class Keyboard implements InputDevice {

    public void connect() {
        System.out.println("Keyboard connected");
    }
}


// High-level class
class Computer {

    InputDevice device;

    Computer(InputDevice device) {
        this.device = device;
    }

    void start() {
        device.connect();
        System.out.println("Computer started");
    }
}


public class DI {

    public static void main(String[] args) {

        InputDevice keyboard = new Keyboard();

        Computer computer = new Computer(keyboard);

        computer.start();

        /*
        Computer does not depend directly on Keyboard.
        It depends on the abstraction (InputDevice).
        */
    }
}