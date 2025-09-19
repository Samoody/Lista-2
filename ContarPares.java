public class ContarPares {
    public static int contarPares(int[] arr, int n) {
        if (n == 0) return 0;
        int count = (arr[n - 1] % 2 == 0) ? 1 : 0;
        return count + contarPares(arr, n - 1);
    }

    public static void main(String[] args) {
        int[] arr = {3, 8, 1, 6, 2, 9};
        System.out.println("Quantidade de pares: " + contarPares(arr, arr.length));
    }
}
