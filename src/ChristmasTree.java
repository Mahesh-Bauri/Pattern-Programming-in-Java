
public class ChristmasTree {
	
	
	static void space(int n,int m) {
		 
		for(int i = 1;i<=n;i++) {
			for(int j = 1;j<=m;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}
	
	
	
	
	static void pattern() {
	//	System.out.println("Pattern 4 : \n");
		for(int i = 3 ;i<6;i++) {
            System.out.print("                       ");
			for(int j = 6-1;j>i;j--) {
				System.out.print(" ");
			}
			for(int k = 3 ;k<=i;k++) {
				System.out.print(" ");
			}
			System.out.println();
		}
		
		
		}
	static void pattern1() {
	//	System.out.println("Pattern 4 : \n");
		
		for(int i = 2 ;i<6;i++) {
			System.out.print("                      ");
		
			for(int j = 6-1;j>i;j--) {
				System.out.print(" ");
			}
			for(int k = 2 ;k<=i;k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		}
	static void pattern2() {
	//	System.out.println("Pattern 4 : \n");
		
		for(int i = 1 ;i<6;i++) {
			System.out.print("                     ");
			for(int j = 6-1;j>i;j--) {
				
				System.out.print(" ");
			}
			for(int k = 1 ;k<=i;k++) {
				System.out.print("^ ");
			}
			System.out.println();
		}
		
		}
	static void pattern3() {
	//	System.out.println("Pattern 4 : \n");
		
		for(int i = 0 ;i<6;i++) {
			
				System.out.print("                    ");
			
			for(int j = 6-1;j>i;j--) {
				System.out.print(" ");
			}
			for(int k = 0 ;k<=i;k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		}
	static void pattern4() {
		//	System.out.println("Pattern 4 : \n");
			
			for(int i = 0 ;i<9;i++) {
				
					System.out.print("                    ");
				
				for(int j = 9-1;j>i;j--) {
					System.out.print(" ");
				}
				for(int k = 0 ;k<=i;k++) {
					System.out.print("* ");
				}
				System.out.println();
			}
			
			}
	static void pattern5() {
		//	System.out.println("Pattern 4 : \n");
			
			for(int i = 0 ;i<7;i++) {
				
					System.out.print("                   ");
				
				for(int j = 7-1;j>i;j--) {
					System.out.print(" ");
				}
				for(int k = 0 ;k<=i;k++) {
					System.out.print("^ ");
				}
				System.out.println();
			}
			
			}
	static void pattern6() {
		//	System.out.println("Pattern 4 : \n");
			
			for(int i = 0 ;i<10;i++) {
				
					System.out.print("                ");
				
				for(int j = 10-1;j>i;j--) {
					System.out.print(" ");
				}
				for(int k = 0 ;k<=i;k++) {
					System.out.print("^ ");
				}
				System.out.println();
			}
			
			}
	
	
	static void mat() {
		for(int i = 1;i<=5;i++) {
			System.out.print("                        ");
			for(int j = 1;j<=3;j++) {
				System.out.print("|");
			}
			System.out.println();
		}
	}
	static void mat1() {
		for(int i = 1;i<=2;i++) {
			System.out.print("                    ");
			for(int j = 1;j<=11;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	
	public static void main(String arg[]) {
		
	//	ChristmasTree.space(3,6);
		//ChristmasTree.pattern();
		ChristmasTree.pattern2();
		ChristmasTree.pattern5();
		ChristmasTree.pattern6();
		ChristmasTree.mat();
		ChristmasTree.mat1();
	//	ChristmasTree.pattern1();
		
	//	ChristmasTree.pattern3();
	//	
	//	
	//	ChristmasTree.pattern4();
		
	}
}
