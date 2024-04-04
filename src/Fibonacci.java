// Questão 2:
public class Fibonacci {
    public static void main(String[] args) {

        int num = 1134903171;

        if (isFibonacci(num)) {
            System.out.print(num + " pertence à sequência de Fibonacci.");
        } else {
            System.out.print(num + " não pertence à sequência de Fibonacci.");
        }
    }
    public static boolean isFibonacci(int n) {
        int a = 0, b = 1;

        if (n == a) return true;

        while (b < n) {
            int temp = b;
            b = a + b;
            a = temp;
        }

        return b == n;
    }
}
