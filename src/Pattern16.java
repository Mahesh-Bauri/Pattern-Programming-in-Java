
public class Pattern16 {

	static void prints() {
		System.out.println("Pattern 1 : \n");
		for(int i = 5 ;i>=1;i--) {
			for(int j = 1;j<=5;j++) {
				
				
				
				if(j<i) {
					System.out.print("  ");
					
				}
				else {
					System.out.print("* ");
				}
				
			}
			System.out.println();
		}
	}
	static void prints1() {
		System.out.println("Pattern 1 : \n");
		for(int i = 1 ;i<=5;i++) {
			for(int j = 5;j>=1;j--) {
				
				
				
				if(j>i) {
					System.out.print("  ");
					
				}
				else {
					System.out.print(i+" ");
				}
				
			}
			System.out.println();
		}
	}
	

	public static void main(String arg[]) {
		
		Pattern16.prints();
		Pattern16.prints1();
		Pattern15.prints2();
	//	Pattern15.prints3();
	//	Pattern15.prints4();
		
	}
}
