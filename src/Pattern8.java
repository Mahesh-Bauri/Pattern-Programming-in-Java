/*
 * 
 * 1 2 3
 * 1 2 3
 * 1 2 3
 * 
 * 
 */



public class Pattern8 {
	public static void main(String arg[]) {
		int n = 4;
		int m = 4;
		for(int i = 1;i<n;i++) {
			for(int j = 1;j<m;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}
