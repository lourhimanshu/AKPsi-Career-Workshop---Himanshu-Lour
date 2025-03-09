import java.util.Scanner;

abstract class Book {
    String title;

    abstract void setTitle(String s);

    String getTitle() {
        return title;
    }
}

class MyBook extends Book {
    // Implementing the abstract method setTitle
    void setTitle(String s) {
        title = s;
    }
}

public class Main {
    public static void main(String[] args) {
        // Create Scanner object to take input
        Scanner sc = new Scanner(System.in);
        
        // Create an instance of MyBook
        MyBook new_novel = new MyBook();
        
        // Read the title from input
        String title = sc.nextLine();
        
        // Set the title using the setTitle method
        new_novel.setTitle(title);
        
        // Output the title
        System.out.println("The title is: " + new_novel.getTitle());
    }
}
