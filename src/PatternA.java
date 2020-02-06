
public class PatternA {
	
	static void print() {
		int m = 20;
		int n = 19;
		for(int i = 0;i<m;i++) {
			for(int j = 0;j<n;j++) {
				if(((j == 0 || j == n-1) && i != 0 ) || ((i == n/2 || i == 0) && (j > 0 && j<n-1) )   ) {
				System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	
	
	
public static void main(String arg[]) {
	PatternA.print();
}
}
