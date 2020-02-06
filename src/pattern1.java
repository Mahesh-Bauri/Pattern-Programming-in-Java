import java.util.Scanner;
public class pattern1 {
	
	public static void main(String arg[]) {
		try {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i = 0;i<n;i++) {
			for(int j = 0 ;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i = n;i>=0;i--) {
			for(int j = i ;j>=0;j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		}catch(Exception e) {}	
	}

}
