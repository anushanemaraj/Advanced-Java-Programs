package Program2;
public class StringBufferVsStringBuilder {
    public static void main(String[] args) {
        int iterations = 10000;
        String text = "AIET";

        // Performance test with StringBuffer
        StringBuffer stringBuffer = new StringBuffer();
        long startTimeBuffer = System.nanoTime();
        for (int i = 0; i < iterations; i++) {
            stringBuffer.append(text);
        }
        long endTimeBuffer = System.nanoTime();
        long durationBuffer = endTimeBuffer - startTimeBuffer;
        System.out.println("Time taken by StringBuffer: " + durationBuffer + " ns");

        // Performance test with StringBuilder
        StringBuilder stringBuilder = new StringBuilder();
        long startTimeBuilder = System.nanoTime();
        for (int i = 0; i < iterations; i++) {
            stringBuilder.append(text);
        }
        long endTimeBuilder = System.nanoTime();
        long durationBuilder = endTimeBuilder - startTimeBuilder;
        System.out.println("Time taken by StringBuilder: " + durationBuilder + " ns");

        // Compare the result
        if (durationBuffer > durationBuilder) {
            System.out.println("StringBuilder is faster.");
        } else if (durationBuffer < durationBuilder) {
            System.out.println("StringBuffer is faster.");
        } else {
            System.out.println("Both performed equally.");
        }
    }
}
