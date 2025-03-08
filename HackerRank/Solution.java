class Animal {
    void walk() {
        System.out.println("I am walking");
    }
}

class Bird extends Animal {
    void fly() {
        System.out.println("I am flying");
    }

    // Adding sing method to the Bird class
    void sing() {
        System.out.println("I am singing");
    }
}

public class Solution {
    public static void main(String[] args) {
        // Create an instance of Bird class inside the main method
        Bird bird = new Bird();
        
        // Calling methods of Bird class
        bird.walk();  // Calls the walk method from Animal class
        bird.fly();   // Calls the fly method from Bird class
        bird.sing();  // Calls the sing method from Bird class
    }
}