/*
  Output :
  	
* * * * * 
* * * * * 
* * * * * 
* * * * * 
* * * * * 
	
 */

public class Square_Fill {
	public static void main(String[] args) {

		int r = 5, c = 5;
		for (int i = 1; i <= r; i++) {

			for (int j = 1; j <= c; j++)
				System.out.print("* ");

			System.out.print("\n");
		}

	}

}