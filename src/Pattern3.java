import java.util.Scanner;
public class Pattern3 {
	
	public static void main(String arg[]) {
		try {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		
		for(int k = n;k>0;k--) {
			for(int l = 0 ;l<k;l++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int k = n;k>0;k--) {
			for(int l = 0 ;l<=n;l++) {
				if(l<k) {
				System.out.print("");
				}
				else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
/*		
		for(int i = 0;i<n;i++) {
			for(int j = 0 ;j<n;j++) {
				if(j<i) {
				System.out.print(" ");
				}
				else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		for(int i = n;i>0;i--) {
			for(int j = 1 ;j<=n;j++) {
				if(j<i) {
				System.out.print(" ");
				}
				else {
					System.out.print("*");
				}
			}
			System.out.println();
		}  */
		
		}catch(Exception e) {}	
	}

}
