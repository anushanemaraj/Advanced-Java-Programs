package lab1;
import java.util.*;

public class ArrayList {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();

        // 1. Adding elements
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Orange");

        // 2. Adding element at specific index
        arrayList.add(1, "Grapes");

        // 3. Adding multiple elements
        List<String> moreFruits = Arrays.asList("Mango", "Pineapple");
        arrayList.addAll(moreFruits);

        // 4. Accessing elements
        System.out.println("Element at index 2: " + arrayList.get(2));

        // 5. Updating elements
        arrayList.set(2, "Kiwi");

        // 6. Removing elements
        arrayList.remove("Banana");

        // 7. Searching elements
        System.out.println("Contains 'Mango': " + arrayList.contains("Mango"));

        // 8. List size
        System.out.println("Size of ArrayList: " + arrayList.size());

        // 9. Iterating over list using for-each
        System.out.println("\nIterating with for-each:");
        for (String fruit : arrayList) {
            System.out.println(fruit);
        }

        // 10. Using Iterator
        System.out.println("\nIterating with Iterator:");
        Iterator<String> iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // 11. Sorting
        Collections.sort(arrayList);
        System.out.println("\nSorted ArrayList: " + arrayList);

        // 12. Sublist
        System.out.println("Sublist (0 to 2): " + arrayList.subList(0, 2));

        // 13. Clearing the list
        arrayList.clear();
        System.out.println("Cleared ArrayList: " + arrayList);
    }
}
