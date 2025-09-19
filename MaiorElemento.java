public class MaiorElemento {
    public static int maiorElemento(int[] arr, int n) {
        if (n == 1) return arr[0];
        return Math.max(arr[n - 1], maiorElemento(arr, n - 1));
    }

    public static void main(String[] args) {
        int[] arr = {3, 8, 1, 6, 2, 9};
        System.out.println("Maior elemento: " + maiorElemento(arr, arr.length));
    }
}
