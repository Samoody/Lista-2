public class SomaArray {
    public static int somaArray(int[] arr, int n) {
        if (n == 0) return 0;
        return arr[n - 1] + somaArray(arr, n - 1);
    }

    public static void main(String[] args) {
        int[] arr = {3, 8, 1, 6, 2, 9};
        System.out.println("Soma do array: " + somaArray(arr, arr.length));
    }
}
