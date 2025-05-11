import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        // Implement the List interface
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Cherry");
        fruits.add("Banana");
        fruits.add("Mango");
        System.out.println("The first fruit in the list is:" + fruits.getFirst());
        for(String fruit : fruits){
            System.out.println(fruit);
        }

        // Implement the List interface
        LinkedList<String> cart = new LinkedList<>();
        cart.addFirst("Block");
        cart.addLast("Cement");
        cart.add("Iron rod");

        for(String item : cart){
            System.out.println(item);
        }

        // Implement the Set interface

        HashSet<String> newSet = new HashSet<>();
        newSet.add("Book");
        newSet.add("Pen");
        newSet.add("Book");

        boolean containItem = newSet.contains("Table");
        int size = newSet.size();
        for(String element: newSet){
            System.out.println(element);
        }
        System.out.println(size);
        System.out.println(containItem);
    }
}