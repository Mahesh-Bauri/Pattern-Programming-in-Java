/*
 * 
  
*
**
***
****


*/
public class Pattern13 {
	
	public static void pat() {
		int n = 5;
		int m = 5;
		System.out.println("\n Patter1 : \n");
		for(int i = 1;i<n;i++) {
			for(int j = 1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}
	public static void pat1() {
		int n = 5;
		int m = 5;
		System.out.println("\n Patter2 : \n");
		for(int i = 1;i<n;i++) {
			for(int j = 1;j<=i;j++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
		
	}
	
	public static void pat2() {
		int n = 5;
		int m = 5;
		System.out.println("\n Patter3 : \n");
		for(int i = 1;i<n;i++) {
			for(int j = 1;j<=i;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
	}
	
	public static void asc() {
		char n = 'D';
	//	char m = 'D';
		System.out.println("\n ASCII Pattern : \n");
		for(char i = 'A'; i<n;i++) {
			for(char j = 'A';j<=i;j++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}
	
	public static void asc1() {
		char n = 'D';
	//	char m = 'D';
		System.out.println("\n ASCII Pattern2 : \n");
		for(char i = 'A'; i<n;i++) {
			for(char j = 'A';j<=i;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
	

	public static void main(String arg[]) {
		Pattern13.pat();
		Pattern13.pat1();
		Pattern13.pat2();
		Pattern13.asc();
		Pattern13.asc1();
		
		
	}
}
