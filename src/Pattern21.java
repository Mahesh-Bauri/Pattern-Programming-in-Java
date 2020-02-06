
public class Pattern21 {

	static void pattern() {
		int z=1;
		int n = 5;
		for(int i = 1;i<=n;i++) {
			for(int j = n-1;j>=i;j--) {
				System.out.print(" ");
			}
			for(int k = 1;k<=z;k++) {
				System.out.print("*");
			}
			z +=2;
			System.out.println();
		}
	}
	static void pattern1() {
		int z=1;
		int n = 5;
		for(int i = 1;i<=n;i++) {
			for(int j = n-1;j>=i;j--) {
				System.out.print("  ");
			}
			for(int k = 1;k<=z;k++) {
				System.out.print(i+" ");
			}
			z +=2;
			System.out.println();
		}
	}
	static void pattern2() {
		int z=1;
		int n = 5;
		for(int i = 1;i<=n;i++) {
			for(int j = n-1;j>=i;j--) {
				System.out.print("  ");
			}
			for(int k = 1;k<=z;k++) {
				System.out.print(k+" ");
			}
			z +=2;
			System.out.println();
		}
	}
	static void pattern3() {
		int z=1;
		int n = 5;
		
		for(int i = 1;i<=n;i++) {
			for(int j = n-1;j>=i;j--) {
				System.out.print("  ");
			}
			
			for(int k = z;k>=1;k--) {
				
				System.out.print(k+" ");
				
			}
			
			z +=2;
			System.out.println();
		}
	}
	static void pattern4() {
		int z=1;
		int n = 5;
		for(int i = 1;i<=n;i++) {
			for(int j = n-1;j>=i;j--) {
				System.out.print("  ");
			}
			for(int k = 1;k<=z;k++) {
				System.out.print(z+" ");
			}
			z +=2;
			System.out.println();
		}
	}
	static void pattern5() {
		int z=1;
		int n = 5;
		for(int i = 1;i<=n;i++) {
			for(int j = n-1;j>=i;j--) {
				System.out.print("  ");
			}
			for(int k = 1;k<=z;k++) {
				System.out.print(Math.abs(k-i)+" ");
			}
			z +=2;
			System.out.println();
		}
	}
	static void pattern6() {
		int z=1;
		int n = 5;
		for(int i = 1;i<=n;i++) {
			for(int j = n-1;j>=i;j--) {
				System.out.print(" ");
			}
			for(int k = 1;k<=z;k++) {
				System.out.print("*");
			}
			z +=2;
			System.out.println();
		}
	}
	static void pattern7() {
		int z=1;
		int n = 5;
		for(int i = 1;i<=n;i++) {
			for(int j = n-1;j>=i;j--) {
				System.out.print(" ");
			}
			for(int k = 1;k<=z;k++) {
				System.out.print("*");
			}
			z +=2;
			System.out.println();
		}
	}
	static void pattern8() {
		int z=1;
		int n = 5;
		for(int i = 1;i<=n;i++) {
			for(int j = n-1;j>=i;j--) {
				System.out.print(" ");
			}
			for(int k = 1;k<=z;k++) {
				System.out.print("*");
			}
			z +=2;
			System.out.println();
		}
	}
	static void pattern9() {
		int z=1;
		int n = 5;
		for(int i = 1;i<=n;i++) {
			for(int j = n-1;j>=i;j--) {
				System.out.print(" ");
			}
			for(int k = 1;k<=z;k++) {
				System.out.print("*");
			}
			z +=2;
			System.out.println();
		}
	}
	static void pattern10() {
		int z=1;
		int n = 5;
		for(int i = 1;i<=n;i++) {
			for(int j = n-1;j>=i;j--) {
				System.out.print(" ");
			}
			for(int k = 1;k<=z;k++) {
				System.out.print("*");
			}
			z +=2;
			System.out.println();
		}
	}
	static void pattern11() {
		int z=1;
		int n = 5;
		for(int i = 1;i<=n;i++) {
			for(int j = n-1;j>=i;j--) {
				System.out.print(" ");
			}
			for(int k = 1;k<=z;k++) {
				System.out.print("*");
			}
			z +=2;
			System.out.println();
		}
	}
	static void pattern12() {
		int z=1;
		int n = 5;
		for(int i = 1;i<=n;i++) {
			for(int j = n-1;j>=i;j--) {
				System.out.print(" ");
			}
			for(int k = 1;k<=z;k++) {
				System.out.print("*");
			}
			z +=2;
			System.out.println();
		}
	}
	
	public static void main(String arg[]) {
		Pattern21.pattern();
		Pattern21.pattern1();
		Pattern21.pattern2();
		Pattern21.pattern3();
		Pattern21.pattern4();
	//	Pattern21.pattern5();
	}
}
