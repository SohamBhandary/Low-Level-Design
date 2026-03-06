

/*
SRP - Single Responsibility Principle

Definition:
A class should have only ONE responsibility
and only ONE reason to change.

In simple words:
One class = One job.
*/

// Class responsible only for holding user data
class User {

    String name;

    User(String name) {
        this.name = name;
    }
}


// Class responsible only for printing user details
class UserPrinter {

    void printUser(User user) {
        System.out.println("User Name: " + user.name);
    }
}


public class SRP {

    public static void main(String[] args) {

        // Creating a user object
        User user = new User("Soham");

        // Printing user details using another class
        UserPrinter printer = new UserPrinter();
        printer.printUser(user);

        /*
        Why this follows SRP?

        User class → handles only user data
        UserPrinter class → handles only printing

        Each class has a single responsibility.
        */
    }
}