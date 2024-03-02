import java.util.Scanner;

public class StringInvertida {
    public static void main(String[] args) {
        /* Z Y X W V U T S R Q P O N M L K J I H G F E D C B A */
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite uma palavra");
        String p = sc.nextLine();
        int t = p.length();
        for (int i = p.length() - 1; i > -1; i--) {
            System.out.print(p.charAt(i));
        }

    }
}
