/*
  Output :
 
 * * * * *
   * * * *
     * * *
       * *
         *
 */

public class Reverse_Left_Half_Pyramid {
    public static void main(String[] args) {
        int r = 5, c = 5;
        for (int i = 0; i < r; i++) {

            for (int k = 0; k < i; k++)
                System.out.print("  ");

            for (int j = 0; j < c - i; j++)
                System.out.print(" *");

            System.out.println();
        }
    }
}
