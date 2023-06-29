package Module22;

public class TryStringBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 50000; i++) {
            sb.insert("ABCD".length()/2, "A");
        }
        System.out.println((System.currentTimeMillis() - startTime));
    }
}
