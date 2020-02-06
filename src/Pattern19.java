
public class Pattern19 {

	
	static void patt() {
		for(int i = 5;i>=1;i--) {
			for(int k = 5;k>i;k--) {
				System.out.print(" ");
			}
			
			for(int j = 1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	static void patt1() {
		for(int i = 5;i>=1;i--) {
			for(int k = 5;k>i;k--) {
				System.out.print(" ");
			}
			
			for(int j = 1;j<=i;j++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}
	
	static void patt2() {
		for(int i = 5;i>=1;i--) {
			for(int k = 5;k>i;k--) {
				System.out.print(" ");
			}
			
			for(int j = 1;j<=i;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
	
	static void patt3() {
		for(int i = 5;i>=0;i--) {
			for(int k = 5;k>i;k--) {
				System.out.print(" ");
			}
			
			for(int j = 0;j<=i;j++) {
				System.out.print((char)(i+65)+" ");
			}
			System.out.println();
		}
	}
	
	static void patt4() {
		for(int i = 5;i>=0;i--) {
			for(int k = 5;k>i;k--) {
				System.out.print(" ");
			}
			
			for(int j = 0;j<=i;j++) {
				System.out.print((char)(j+65)+" ");
			}
			System.out.println();
		}
	}
	
	public static void main(String arg[]) {
		Pattern19.patt();
		Pattern19.patt1();
		Pattern19.patt2();
		Pattern19.patt3();
		Pattern19.patt4();
	}
}
