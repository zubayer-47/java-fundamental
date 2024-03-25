class Pattern {
    public static void main(String args[]) {
        //?   * * * * *
        //?   * * * * *
        //?   * * * * *
        //?   * * * * *

        for (int i = 0; i < 4; i++) {
            String str = "";

            for (int j = 1; j <= 5; j++) {
                str += "* ";
            }

            System.out.println(str);
        }

        // solution 2
        // for (int i = 0; i < 4; i++) {
        //     for (int j = 1; j <= 5; j++) {
        //         System.out.print(" * ");
        //     }
        //         System.out.println();
        // }
    }
}