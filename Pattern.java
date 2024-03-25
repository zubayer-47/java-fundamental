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

        //* Half Pyramid with Numbers

        //? 1
        //? 1 2
        //? 1 2 3
        //? 1 2 3 4
        //? 1 2 3 4 5

        int n = 5;
        
        for (int i =1; i<=n; i++) {
            String str = "";
            for (int j = 1; j <= i; j++) {
                str += j + " ";
            }

            System.out.println(str);
        }

    }
}