
public class Main {
    public static void main(String[] args) {
        System.out.println(fatorial(5));
        mostrarPares(23);
    }
    public static int fatorial(int n) {
        if (n <= 1) {
            return 1;
        } else {
            return n * fatorial(n - 1);
        }
    }

    public static void mostrarPares(int n) {
        for (int i = 0; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

}