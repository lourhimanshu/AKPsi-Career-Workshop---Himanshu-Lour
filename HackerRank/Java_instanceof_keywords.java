import java.util.*;

class Student {}
class Rockstar {}
class Hacker {}

public class Solution {
    static void count(ArrayList<Object> mylist) {
        int students = 0, rockstars = 0, hackers = 0;

        for (Object obj : mylist) {
            if (obj instanceof Student) {
                students++;
            } else if (obj instanceof Rockstar) {
                rockstars++;
            } else if (obj instanceof Hacker) {
                hackers++;
            }
        }

        System.out.println(students + " " + rockstars + " " + hackers);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // Read the number of inputs
        ArrayList<Object> mylist = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String type = sc.next(); // Read the type of object
            if (type.equals("Student")) {
                mylist.add(new Student());
            } else if (type.equals("Rockstar")) {
                mylist.add(new Rockstar());
            } else if (type.equals("Hacker")) {
                mylist.add(new Hacker());
            }
        }
        sc.close();

        count(mylist);
    }
}