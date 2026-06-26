class Singleton {

    
    private static Singleton instance;


    private Singleton() {
        System.out.println("Singleton Object Created");
    }

    
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public void display() {
        System.out.println("Welcome to Singleton Design Pattern");
    }
}

public class Singleton_Pattern {

    public static void main(String[] args) {

        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();

        obj1.display();

        System.out.println("Object 1 HashCode : " + obj1.hashCode());
        System.out.println("Object 2 HashCode : " + obj2.hashCode());

        if (obj1 == obj2) {
            System.out.println("Both references point to the same object.");
        } else {
            System.out.println("Different objects are created.");
        }
    }
}