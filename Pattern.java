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

        // * Hollow Rectangle

        // ?    * * * * *
        // ?    *       *
        // ?    *       *
        // ?    * * * * *

        int n = 4;
        int m = 4;

        for (int i = 1; i <= n; i++) {
            String str = "";

            for (int j = 1; j <= m; j++) {
                if (i == 1 || i == n){
                    str += "* ";
                } else if (j == 1 || j == m) {
                    str += "* ";
                } else {
                    str += "  ";
                }
            }

            // //? another simplest inner loop
            // for (int j = 1; j <= m; j++) {
            //     if (i == 1 || i == n || j == 1 || j == m){
            //         str += "* ";
            //     } else {
            //         str += "  ";
            //     }
            // }

            System.out.println(str);
        }
    }
}