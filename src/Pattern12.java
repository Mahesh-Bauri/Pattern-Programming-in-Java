/*
 * 
 * C C C
 * B B B
 * A A A
 * 
 * 
 */
public class Pattern12 {
	public static void main(String arg[]) {
		char n = 'D';
		char m = 'D';
		for(char i = n ;i >= 'A';i--) {
			for(char j= m;j >= 'A';j--)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}
