/*
 * AAA
 * BB
 * C
 * 
 * 
 * A = 65
 * Z = 90
 * 
 */
public class Pattern15 {
	
	
	public static  void  prints() {
		System.out.println("Pattern 1: ");
		for(int i = 0 ;i<=5;i++) {
			for(int j = 5;j>=i;j--) {
				System.out.print((char)(i+65)+" ");
			}
			System.out.println();
		}
		System.out.println();	
	}
	public static  void  prints2() {
		System.out.println("Pattern 2: \n");
		for(int i = 0 ;i<=5;i++) {
			for(int j = 5;j>=i;j--) {
				System.out.print((char)(j+65)+" ");
			}
			System.out.println();
		}
		System.out.println();	
	}
	public static  void  prints3() {
		System.out.println("Pattern 1: ");
		for(int i = 5 ;i>=0;i--) {
			for(int j = 0;j<=i;j++) {
				System.out.print((char)(i+65)+" ");
			}
			System.out.println();
		}
		System.out.println();	
	}
	public static  void  prints4() {
		System.out.println("Pattern 1: ");
		for(int i = 5 ;i>=0;i--) {
			for(int j = 0;j<=i;j++) {
				System.out.print((char)(j+65)+" ");
			}
			System.out.println();
		}
		System.out.println();	
	}
	
	
	public static void main(String arg[]) {
		
		Pattern15.prints();
		Pattern15.prints2();
		Pattern15.prints3();
		Pattern15.prints4();
		
	}

}
