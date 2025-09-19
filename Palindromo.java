public class Palindromo {
    public static boolean ehPalindromo(String s, int inicio, int fim) {
        if (inicio >= fim) return true;
        if (s.charAt(inicio) != s.charAt(fim)) return false;
        return ehPalindromo(s, inicio + 1, fim - 1);
    }

    public static void main(String[] args) {
        String palavra = "radar";
        System.out.println("É palíndromo? " + ehPalindromo(palavra, 0, palavra.length() - 1));
    }
}
