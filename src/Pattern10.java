/*
 * 
 * A A A
 * B B B
 * C C C
 * 
 * 
 * 
 * 
 */
public class Pattern10 {
	
	public static void main(String arg[]) {
	int n = (int)'F';
	int m = (int)'F';
	
	for(int i = 'A';i<n;i++) {
		for(int j = 'A';j<m;j++) {
			System.out.print((char)i+" ");
		}
		System.out.println();
	}
	}

}
