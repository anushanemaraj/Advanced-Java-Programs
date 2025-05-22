//1.a Develop a Java program for adding elements [Apple, Banana, Orange] into an LinkedList to perform the following operations with different functions directed as
//follows
//1. Adding elements, 2. Adding element at specific index, 3. Adding multiple elements, 4.
//Accessing elements,5. Updating elements, 6. Removing elements, 7. Searching elements, 8. List
//size, 9. Iterating over list, 10. Using Iterator, 11. Sorting, 12. Sublist, 13. Clearing the list


package lab2;

	import java.util.*;

	public class LinkedListDemo {
	    public static void main(String[] args) {
	        List<String> linkedList = new LinkedList<>();

	        // 1. Adding elements
	        linkedList.add("Apple");
	        linkedList.add("Banana");
	        linkedList.add("Orange");

	        // 2. Adding element at specific index
	        linkedList.add(1, "Grapes");

	        // 3. Adding multiple elements
	        List<String> moreFruits = Arrays.asList("Mango", "Pineapple");
	        linkedList.addAll(moreFruits);

	        // 4. Accessing elements
	        System.out.println("Element at index 2: " + linkedList.get(2));

	        // 5. Updating elements
	        linkedList.set(2, "Kiwi");

	        // 6. Removing elements
	        linkedList.remove("Banana");

	        // 7. Searching elements
	        System.out.println("Contains 'Mango': " + linkedList.contains("Mango"));

	        // 8. List size
	        System.out.println("Size of LinkedList: " + linkedList.size());

	        // 9. Iterating over list using for-each
	        System.out.println("\nIterating with for-each:");
	        for (String fruit : linkedList) {
	            System.out.println(fruit);
	        }

	        // 10. Using Iterator
	        System.out.println("\nIterating with Iterator:");
	        Iterator<String> iterator = linkedList.iterator();
	        while (iterator.hasNext()) {
	            System.out.println(iterator.next());
	        }

	        // 11. Sorting
	        Collections.sort(linkedList);
	        System.out.println("\nSorted LinkedList: " + linkedList);

	        // 12. Sublist
	        System.out.println("Sublist (0 to 2): " + linkedList.subList(0, 2));

	        // 13. Clearing the list
	        linkedList.clear();
	        System.out.println("Cleared LinkedList: " + linkedList);
	    }
	}


