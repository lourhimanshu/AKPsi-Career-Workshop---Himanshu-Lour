import java.util.*;

public class Solution {
    static void func(ArrayList<String> mylist) {
        Iterator<String> it = mylist.iterator();

        while (it.hasNext()) {
            if (it.next().equals("###")) { // Find "###"
                break; // Stop at "###"
            }
        }

        while (it.hasNext()) { // Print elements after "###"
            System.out.println(it.next());
        }
    }

    public static void main(String[] args) {
        ArrayList<String> mylist = new ArrayList<>();
        mylist.add("42");
        mylist.add("10");
        mylist.add("###");
        mylist.add("Hello");
        mylist.add("Java");

        func(mylist);
    }
}