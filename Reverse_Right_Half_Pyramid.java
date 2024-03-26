/*
Output :

* * * * * 
* * * * 
* * * 
* * 
*   
    
*/

public class Reverse_Right_Half_Pyramid {

    public static void main(String[] args) {
        int r = 5, c = 5;
        for (int i = r; i >= 1; i--) {

            for (int j = i; j >= 1; j--)
                System.out.print("* ");

            System.out.println();
        }
    }

}
