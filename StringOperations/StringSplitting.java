package adjlab3;
public class StringSplitting {
    public static void main(String[] args) {
        String str = "Red,Green,Blue";
        String[] colors = str.split(",");
        for (String color : colors) {
            System.out.println(color);
        }
    }
}
