
import java.util.Scanner;

public class PatternE {

	static void print() {
		int n=7;
		int m =6;
		for(int i = 0;i<n;i++) {
			for(int j = 0;j<m;j++) {
				if((j == 0) || (i == 0 || i == n/2 || i == n-1)) {
					
				System.out.print("*");
					
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

   

    public static void main(String[] args) {
      PatternE.print();
    }
}