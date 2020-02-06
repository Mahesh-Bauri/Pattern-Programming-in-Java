/*
 * 

****
***
**
*



 * 
 */
public class Pattern14 {

	static void inv() {
		int n = 5;
		int m = 5;
		System.out.println("\n Pattern : \n");
		for(int i = 1 ;i<=n;i++) {
			for(int j = m ;j>=i;j--) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	static void inv1() {
		int n = 5;
		int m = 5;
		System.out.println("\n Pattern1 : \n");
		for(int i = n ;i>=1;i--) {
			for(int j = 1 ;j<=i;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
	
	static void inv2() {
		int n = 5;
		int m = 5;
		System.out.println("\n Pattern2 : \n");
		for(int i = 1 ;i<=n;i++) {
			for(int j = m ;j>=i;j--) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}
	
	static void inv3() {
		int n = 5;
		int m = 5;
		System.out.println("\n Pattern3 : \n");
		for(int i = 1 ;i<=n;i++) {
			for(int j = m ;j>=i;j--) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
	
	static void inv4() {
		int n = 5;
		int m = 5;
		System.out.println("\n Pattern4 : \n");
		for(int i = n ;i>=1;i--) {
			for(int j = 1 ;j<=i;j++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}
	
	static void inv5() {
		int n = 5;
		int m = 5;
		System.out.println("\n Pattern5 : \n");
		for(int i = n ;i>=1;i--) {
			for(int j = 1 ;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	
	
	public static void main(String arg[]) {
		Pattern14.inv();
		Pattern14.inv1();
		Pattern14.inv2();
		Pattern14.inv3();
		Pattern14.inv4();
		
		
	}
}
