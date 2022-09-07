import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Eleman sayısını giriniz :");
        int number = inp.nextInt();
        int a = 0, b = 1, total =0;

        for (int i = 1; i <= number; i++) {

            total = a + b;
            System.out.println(a + "+" + b + "=" + total);

            a = b;
            b = total;

            System.out.println();
        }
    }
}