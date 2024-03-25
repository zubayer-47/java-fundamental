import java.util.*;

class Main{
    public static void main(String args[]) {
        // for (int i = 1; i <= 10; i++) {
        //     System.out.println("Loop running " + i + " times");
        // }

        // int i = 1;

        // while(i <= 10) {

        //     System.out.println("Loop running " + i + " times");

        //     i++;

        // }

        // do {
        //     System.out.println("Loop running " + i + " times");

        //     i++;
        // } while (i > 10);


        //* Sum of First n Natural Numbers;

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();


        // /**
        //  ** 3
        //  ** 1 + 2 + 3 = 6
        //  */

        // int sum = 0;

        // for (int i = 1; i <= n; i++) {
        //     sum += i;
        // }

        // System.out.println(sum);

        //* print table of a number input by the user.

        for (int i = 1; i <= 10; i++) {
            System.out.print(n + " * " + i + " = ");
            System.out.println(n * i);
        }
    }
}