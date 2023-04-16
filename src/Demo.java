import java.util.ArrayList;

public class Demo {
    public static void main(String[] args) {
        // Create a new ArrayList
        ArrayList<String> myList = new ArrayList<String>();

        // Add elements to the ArrayList
        myList.add("apple");
        myList.add("banana");
        myList.add("cherry");
        myList.add("banana");
        myList.add("dates");

        // Print the elements of the ArrayList
        System.out.println("My list contains:");
        for (String item : myList) {
            System.out.println(item);
        }

        // Get the size of the ArrayList
        int size = myList.size();
        System.out.println("My list has " + size + " elements.");

        // Check if the ArrayList contains an element
        boolean containsBanana = myList.contains("banana");
        System.out.println("My list contains banana: " + containsBanana);

        // Get the index of the first occurrence of an element
        int bananaIndex = myList.indexOf("banana");
        System.out.println("The index of banana is: " + bananaIndex);

        // Get the index of the last occurrence of an element
        int lastBananaIndex = myList.lastIndexOf("banana");
        System.out.println("The last index of banana is: " + lastBananaIndex);

        // Remove an element from the ArrayList
        myList.remove("banana");

        // Print the elements of the ArrayList again
        System.out.println("My list now contains:");
        for (String item : myList) {
            System.out.println(item);
        }

        // Remove all elements from the ArrayList
        myList.clear();

        // Check if the ArrayList is empty
        boolean isEmpty = myList.isEmpty();
        System.out.println("My list is empty: " + isEmpty);
    }
}
