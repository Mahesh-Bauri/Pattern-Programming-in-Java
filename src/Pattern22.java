/*

*******************
********* *********
********   ********
*******     *******
******       ******
*****         *****
****           ****
***             ***
**               **
*                 *
*                 *
**               **
***             ***
****           ****
*****         *****
******       ******
*******     *******
********   ********
********* *********
*******************



*/
public class Pattern22 {

	
	static void print() {
		
		int n = 10;
		int px = n;
		int py = n;
		
		for(int i = 1;i<=n;i++) {
			for(int j = 1 ;j < n*2;j++) {
				if(j>px && j < py ) {
					
					System.out.print(" ");
					
				}
				else {
					System.out.print("*");
				}
			}
			System.out.println();
			px--;
			py++;
		}
		
		
	}
	static void print1() {
		
		int n = 10;
		int px = 1;
		int py = n * 2 -1;
		
		for(int i = 1;i<=n;i++) {
			for(int j = 1 ;j < n*2;j++) {
				if(j>px && j<py ) {
					
					System.out.print(" ");
					
				}
				else {
					System.out.print("*");
				}
			}
			System.out.println();
			px++;
			py--;
		}
		
		
	}
	
	public static void main(String arg[]) {
		Pattern22.print();
		Pattern22.print1();
	}
}
