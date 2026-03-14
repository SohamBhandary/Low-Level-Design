// File: SingletonExamples.java

public class SingletonExamples {

    public static void main(String[] args) {

        // EAGER SINGLETON
        EagerSingleton obj1 = EagerSingleton.getInstance();
        EagerSingleton obj2 = EagerSingleton.getInstance();
        System.out.println("Eager Singleton same object? " + (obj1 == obj2));

        // LAZY SINGLETON
        LazySingleton l1 = LazySingleton.getInstance();
        LazySingleton l2 = LazySingleton.getInstance();
        System.out.println("Lazy Singleton same object? " + (l1 == l2));

        // THREAD SAFE SINGLETON (SYNCHRONIZED)
        ThreadSafeSingleton t1 = ThreadSafeSingleton.getInstance();
        ThreadSafeSingleton t2 = ThreadSafeSingleton.getInstance();
        System.out.println("ThreadSafe Singleton same object? " + (t1 == t2));

        // DOUBLE CHECKED LOCKING
        DoubleCheckedSingleton d1 = DoubleCheckedSingleton.getInstance();
        DoubleCheckedSingleton d2 = DoubleCheckedSingleton.getInstance();
        System.out.println("Double Checked Singleton same object? " + (d1 == d2));

        // BILL PUGH SINGLETON
        BillPughSingleton b1 = BillPughSingleton.getInstance();
        BillPughSingleton b2 = BillPughSingleton.getInstance();
        System.out.println("Bill Pugh Singleton same object? " + (b1 == b2));
    }
}


/*
---------------------------------------------------------
1. EAGER INITIALIZATION SINGLETON
---------------------------------------------------------
Object is created when the class is loaded.
Advantage: Thread safe
Disadvantage: Object created even if not used.
*/
class EagerSingleton {

    // Instance created at class loading time
    private static final EagerSingleton instance = new EagerSingleton();

    // Private constructor prevents object creation from outside
    private EagerSingleton() {}

    // Global access point
    public static EagerSingleton getInstance() {
        return instance;
    }
}


/*
---------------------------------------------------------
2. LAZY INITIALIZATION SINGLETON
---------------------------------------------------------
Object is created only when getInstance() is called.
Advantage: Saves memory
Disadvantage: Not thread safe
*/
class LazySingleton {

    private static LazySingleton instance;

    private LazySingleton() {}

    public static LazySingleton getInstance() {

        // Object created only when needed
        if(instance == null){
            instance = new LazySingleton();
        }

        return instance;
    }
}


/*
---------------------------------------------------------
3. THREAD SAFE SINGLETON (SYNCHRONIZED METHOD)
---------------------------------------------------------
Ensures only one thread can access the method at a time.
Advantage: Thread safe
Disadvantage: Slower due to synchronization
*/
class ThreadSafeSingleton {

    private static ThreadSafeSingleton instance;

    private ThreadSafeSingleton() {}

    // synchronized ensures only one thread executes at a time
    public static synchronized ThreadSafeSingleton getInstance(){

        if(instance == null){
            instance = new ThreadSafeSingleton();
        }

        return instance;
    }
}


/*
---------------------------------------------------------
4. DOUBLE CHECKED LOCKING
---------------------------------------------------------
Improves performance by synchronizing only when needed.
Used in multithreaded environments.
*/
class DoubleCheckedSingleton {

    // volatile prevents instruction reordering
    private static volatile DoubleCheckedSingleton instance;

    private DoubleCheckedSingleton() {}

    public static DoubleCheckedSingleton getInstance(){

        // First check without locking
        if(instance == null){

            synchronized(DoubleCheckedSingleton.class){

                // Second check with locking
                if(instance == null){
                    instance = new DoubleCheckedSingleton();
                }
            }
        }

        return instance;
    }
}


/*
---------------------------------------------------------
5. BILL PUGH SINGLETON (BEST PRACTICE)
---------------------------------------------------------
Uses static inner helper class.
Thread safe without synchronization.
Recommended in interviews.
*/
class BillPughSingleton {

    private BillPughSingleton(){}

    // Inner static helper class
    private static class SingletonHelper{

        private static final BillPughSingleton INSTANCE = new BillPughSingleton();
    }

    // Instance created only when this method is called
    public static BillPughSingleton getInstance(){
        return SingletonHelper.INSTANCE;
    }
}