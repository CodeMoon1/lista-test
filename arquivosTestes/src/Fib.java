import java.util.Scanner;

public class Fib {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, n1 = 0, n2 = 0, n3 = 0;
        boolean x = false;
        System.out.println("informe o valor para a verificação");
        n = sc.nextInt();
        int fib[] = new int[n + 1];
        if (n >= 0) {
            for (int i = 0; i <= n; i++) {
                n1 = n2 + n3;
                fib[i] = n1;
                n3 = n2;
                n2 = n1;
                if (n1 == 0)
                    n3++;
            }
            for (int c = 0; c < fib.length; c++) {
                if (fib[c] == n) {
                    x = true;
                }
            }
            if (x == true) {
                System.out.println("O número informado pertence a sequência");
            } else
                System.out.println("O número informado não pertence a sequência");
        }
    }
}