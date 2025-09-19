public class MDC {
    public static int mdc(int a, int b) {
        if (b == 0) return a;
        return mdc(b, a % b);
    }

    public static void main(String[] args) {
        System.out.println("MDC de 48 e 18: " + mdc(48, 18));
    }
}
