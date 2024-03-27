class Pattern {
    public static void main(String args[]) {
        // //?   * * * * *
        // //?   * * * * *
        // //?   * * * * *
        // //?   * * * * *

        // for (int i = 0; i < 4; i++) {
        //     String str = "";

        //     for (int j = 1; j <= 5; j++) {
        //         str += "* ";
        //     }

        //     System.out.println(str);
        // }

        // // solution 2
        // // for (int i = 0; i < 4; i++) {
        // //     for (int j = 1; j <= 5; j++) {
        // //         System.out.print(" * ");
        // //     }
        // //         System.out.println();
        // // }

        // //* Hollow Rectangle

        // //?    * * * * *
        // //?    *       *
        // //?    *       *
        // //?    * * * * *

        // int n = 4;
        // int m = 4;

        // for (int i = 1; i <= n; i++) {
        //     String str = "";

        //     for (int j = 1; j <= m; j++) {
        //         if (i == 1 || i == n){
        //             str += "* ";
        //         } else if (j == 1 || j == m) {
        //             str += "* ";
        //         } else {
        //             str += "  ";
        //         }
        //     }

        //     // //? another simplest inner loop
        //     // for (int j = 1; j <= m; j++) {
        //     //     if (i == 1 || i == n || j == 1 || j == m){
        //     //         str += "* ";
        //     //     } else {
        //     //         str += "  ";
        //     //     }
        //     // }

        //     System.out.println(str);
        // }

        // //* Half Pyramid

        // //?     *
        // //?     * *
        // //?     * * *
        // //?     * * * *
        // //?     * * * * *

        // int n = 5;

        // for (int i = 1; i <= n; i++) {
        //     String str = "";

        //     for (int j = 1; j <= i; j++) {
        //         str += "* ";
        //     }

        //     System.out.println(str);
        // }

        // // another solution
        // // for (int i = 1; i <= n; i++) {
            
        // //     for (int j = 1; j <= i; j++) {
        // //         System.out.print("* ");
        // //     }

        // //     System.out.println();
        // // }

        // //* Inverted Half Pyramid

        // //?     * * * * *
        // //?     * * * * 
        // //?     * * * 
        // //?     * * 
        // //?     * 

        // int n = 5;

        // for (int i = n; i >= 1; i--) {
        //     String str = "";

        //     for (int j = 1; j <= i; j++) {
        //         str += "* ";
        //     }

        //     System.out.println(str);
        // }

        // for (int i = n; i >= 1; i--) {
            
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print("* ");
        //     }

        //     System.out.println();
        // }

        // //* Inverted Half Pyramid (rotate 180deg)

        // //?             *
        // //?           * *
        // //?         * * *
        // //?       * * * *
        // //?     * * * * *

        // int n = 5;

        // for (int i = 1; i <= n; i++) {
        //     String str = "";

        //     for (int j = n; j >= 1; j--) {

        //         if (j <= i) {
        //             str += " *";
        //         } else {
        //             str += "  ";
        //         }
        //     }

        //     System.out.println(str);
        // }

        // //* Half Pyramid with Numbers

        // //? 1
        // //? 1 2
        // //? 1 2 3
        // //? 1 2 3 4
        // //? 1 2 3 4 5

        // int n = 5;
        
        // for (int i =1; i<=n; i++) {
        //     String str = "";
        //     for (int j = 1; j <= i; j++) {
        //         str += j + " ";
        //     }

        //     System.out.println(str);
        // }

        // //* Inverted Half Pyramid with Numbers

        // //? 1 2 3 4 5
        // //? 1 2 3 4 
        // //? 1 2 3 
        // //? 1 2 
        // //? 1 

        // int n = 5;

        // for (int i = n; i >= 1; i--) {
        //     String str = "";

        //     for (int j = 1; j <= i; j++) {
        //         str += j + " ";
        //     }

        //     System.out.println(str);
        // }


        // //* Floyd's Triangle

        // //? 1
        // //? 2   3
        // //? 4   5   6
        // //? 7   8   9   10
        // //? 11  12  13  14  15

        // int n = 5;
        // int num = 1;

        // for (int i = 1; i <= n; i++) {
        //     String str = "";

        //     for (int j = 1; j <= i; j++) {
        //         str += num + " ";
        //         num++;
        //     }

        //     System.out.println(str);
        // }

        //  //* 0 - 1 Triangle

        // //?     1
        // //?     0 1
        // //?     1 0 1
        // //?     0 1 0 1
        // //?     1 0 1 0 1

        // //? Let's assume. Even = 1; Odd = 0;

        // int n = 5;

        // for (int i = 1; i <= n; i++) {

        //     String str = "";

        //     for (int j = 1; j <= i; j++) {
        //         // System.out.print(i % j);
        //         if ((i+j) % 2 == 0) {
        //             str += 1 + " ";
        //         } else {
        //             str += 0 + " ";
        //         }
        //     }

        //     System.out.println(str);

        // }

        // //* Butterfly Pattern
        
        // //?     *             *
        // //?     * *         * *
        // //?     * * *     * * *
        // //?     * * * * * * * *
        // //?     * * * * * * * *
        // //?     * * *     * * *
        // //?     * *         * *
        // //?     *             *

        // int n = 4;
        // int totalSell = 8;

        // for (int i = 1; i <= n; i++) {
        //     String str = "";
            
        //     for (int j = 1; j <= i; j++) {
        //         str += "*";
        //     }

        //     int spaces = 2 * (n - i);

        //     for (int j = 1; j <= spaces; j++) {
        //         str += " ";
        //     }

        //     for (int j = 1; j <= i; j++) {
        //         str += "*";
        //     }

        //     System.out.println(str);
        // }

        // for (int i = n; i >= 1; i--) {

        //     String str = "";

        //     for (int j = 1; j <= i; j++) {
        //         str += "*";
        //     }

        //     int spaces = 2 * (n - i);

        //     for (int j = 1; j <= spaces; j++) {
        //         str += " ";
        //     }

        //     for (int j = 1; j <= i; j++) {
        //         str += "*";
        //     }

        //     System.out.println(str);

        // }

         //* Solid Rhombus Pattern

        //?     *****
        //?    *****
        //?   *****
        //?  *****
        //? *****


        int n = 5;

        for (int i = 1; i <= n; i++) {

            String str = "";
            
            int spaces = n - i;

            for (int j = 1; j <= spaces; j++) {
                str += " ";
            }

            for (int j = 1; j <= n; j++) {
                str += "*";
            }

            System.out.println(str);
        }
    }
}