/*
 * 
 * A A A
 * B B B
 * C C C
 * 
 * 
 */
public class Pattern11 {
	public static void main(String arg[]) {
		char n = 'D';
		char m = 'D';
		for(char i = 'A' ;i< n;i++) {
			for(char j='A';j< m;j++)
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}
}
