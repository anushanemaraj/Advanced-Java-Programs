//1. Write a java program for getting different colors through ArrayList interface and search whether
//the color "Red" is available or not

package javalab;
import java.util.ArrayList;
public class ColorSearch {
	public static void main (String[]args) {
		ArrayList<String> list = new ArrayList<>(); 
	
	list.add("blue");
    list.add("red");
    list.add("Orange");
    boolean contains = list.contains("red");
    System.out.println("Contains red?: " + contains);
    
}
}
