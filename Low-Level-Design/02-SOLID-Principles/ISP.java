/*
ISP - Interface Segregation Principle

Definition:
Clients should not be forced to depend
on interfaces they do not use.

Instead of one large interface,
we create smaller specific interfaces.
*/


// Interface for working
interface Workable {
    void work();
}

// Interface for eating
interface Eatable {
    void eat();
}


// Human can work and eat
class Human implements Workable, Eatable {

    public void work() {
        System.out.println("Human working");
    }

    public void eat() {
        System.out.println("Human eating");
    }
}


// Robot only works
class Robot implements Workable {

    public void work() {
        System.out.println("Robot working");
    }
}

public class ISP {

    public static void main(String[] args) {

        Human human = new Human();
        Robot robot = new Robot();

        human.work();
        human.eat();

        robot.work();

        /*
        Robot does not need eat(),
        so we did not force it to implement it.
        */
    }
}