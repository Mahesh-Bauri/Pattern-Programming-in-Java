/*
 * 
 5 5 5 5 5 
 4 4 4 4 4 
 3 3 3 3 3 
 2 2 2 2 2 
 1 1 1 1 1 


 * 
 * 
 * 
 * 
 */
public class Pattern7 {
	public static void main(String arg[]) {
		int n = 5;
		int m = 5 ;
		for(int i = n;i>0;i--) {
			for(int j = m;j>0;j--) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}
}
