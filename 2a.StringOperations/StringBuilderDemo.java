//StringBuilder Demo

package adjlab3;
public class StringBuilderDemo {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Java");
        sb.append(" Programming");
        sb.insert(0, "Learn ");
        sb.replace(6, 10, "Master");
        System.out.println("StringBuilder result: " + sb.toString());
    }
}
