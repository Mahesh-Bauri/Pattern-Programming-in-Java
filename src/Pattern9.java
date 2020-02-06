/*
 * 
 * 3 2 1
 * 3 2 1
 * 3 2 1
 * 
 * 
 * 
 */
public class Pattern9 {
	public static void main(String arg[]) {
		int n = 5;
		int m = 5 ;
		for(int i = n;i>0;i--) {
			for(int j = m;j>0;j--) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}
