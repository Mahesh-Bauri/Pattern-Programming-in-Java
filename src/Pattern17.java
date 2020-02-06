/*
 * 
      *
    * *
  * * *  
    
 * 
 */

public class Pattern17 {

	
	static void patt() {
		System.out.println("Pattern 0 : \n");
		for(int i = 1 ;i<5;i++) {
			for(int j = 5-1;j>i;j--) {
				System.out.print("  ");
			}
			for(int k = 1 ;k<=i;k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println();
	}

	static void patt1() {
		
		System.out.println("Pattern 1 : \n");
		for(int i = 1 ;i<5;i++) {
			for(int j = 5-1;j>i;j--) {
				System.out.print("  ");
			}
			for(int k = 1 ;k<=i;k++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
		System.out.println();
	}

	static void patt2() {
		System.out.println("Pattern 2 : \n");
		for(int i = 1 ;i<5;i++) {
			for(int j = 5-1;j>i;j--) {
				System.out.print("  ");
			}
			for(int k = 1 ;k<=i;k++) {
				System.out.print(k+" ");
			}
			System.out.println();
		}
		System.out.println();
	}

	static void patt3() {
		System.out.println("Pattern 3 : \n");
		for(int i = 0 ;i<5;i++) {
			for(int j = 5-1;j>i;j--) {
				System.out.print("  ");
			}
			for(int k = 0 ;k<=i;k++) {
				System.out.print((char)(i+65)+" ");
			}
			System.out.println();
		}
		System.out.println();
	}
	static void patt4() {
		System.out.println("Pattern 4 : \n");
		for(int i = 0 ;i<5;i++) {
			for(int j = 5-1;j>i;j--) {
				System.out.print("  ");
			}
			for(int k = 0 ;k<=i;k++) {
				System.out.print((char)(k+65)+" ");
			}
			System.out.println();
		}
		System.out.println();
	}
	
	public static void main(String arg[]) {
		Pattern17.patt();
		Pattern17.patt1();
		Pattern17.patt2();
		Pattern17.patt3();
		Pattern17.patt4();
	}
}
