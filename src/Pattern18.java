/*
 * 
 *    *
 *   * *
 *  * * *
 *  
 *     
 */
public class Pattern18 {
	
	static void patt() {
		for(int i = 1;i<5;i++) {
			for(int j = 5-1;j>i;j--) {
				System.out.print(" ");
			}
			for(int k = 1;k<=i;k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	static void patt2() {
		for(int i = 1;i<5;i++) {
			for(int j = 5-1;j>i;j--) {
				System.out.print(" ");
			}
			for(int k = 1;k<=i;k++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}
	static void patt3() {
		for(int i = 1;i<5;i++) {
			for(int j = 5-1;j>i;j--) {
				System.out.print(" ");
			}
			for(int k = 1;k<=i;k++) {
				System.out.print(k+" ");
			}
			System.out.println();
		}
	}
	static void patt4() {
		for(int i = 0;i<5;i++) {
			for(int j = 5-1;j>i;j--) {
				System.out.print(" ");
			}
			for(int k = 0;k<=i;k++) {
				System.out.print((char)(k+65)+" ");
			}
			System.out.println();
		}
	}
	static void patt5() {
		//System.out.println("Pattern 3 : \n");
		for(int i = 0 ;i<5;i++) {
			for(int j = 5-1;j>i;j--) {
				System.out.print(" ");
			}
			for(int k = 0 ;k<=i;k++) {
				System.out.print((char)(i+65)+" ");
			}
			System.out.println();
		}
		
	}
	
	public static void main(String arg[]) {
		Pattern18.patt();
		Pattern18.patt2();
		Pattern18.patt3();
		Pattern18.patt5();
		Pattern18.patt4();
		
	}

}
