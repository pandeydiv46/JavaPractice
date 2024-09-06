public class hollowRectangle {
   /* public static void main(String args[]) {
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4; j++) {
                if ((i == 2 && j == 2) || (i == 2 && j == 3) ||(i == 3 && j == 2) || (i == 3 && j == 3)) {

                    System.out.print("  ");
                } else System.out.print("* ");


            }System.out.println(" ");
        }

    }*/

    public static void main(String args[]) {
        int n = 5;
        int m = 4;
        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                if(i == 0 || i == n-1 || j == 0 || j == m-1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

}
