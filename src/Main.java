import java.util.Scanner;

public class Main {

    static void number(int a) {
        if (a > 0) {
            System.out.print(" " + a);

            number(a-5);

        }
        System.out.print(" " + a );

    }


    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("N Sayısı :");
        int N = inp.nextInt();

        number(N);

    }

}
