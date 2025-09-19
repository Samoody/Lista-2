public class SomaDigitos {
    public static int somaDigitos(int n) {
        if (n == 0) return 0;
        return (n % 10) + somaDigitos(n / 10);
    }

    public static void main(String[] args) {
        System.out.println("Soma dos dígitos (1234): " + somaDigitos(1234));
    }
}
