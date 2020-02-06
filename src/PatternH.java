
import java.util.Scanner;

public class PatternH {

	static void print() {
		int n=7;
		int m =8;
		for(int i = 0;i<n;i++) {
			for(int j = 0;j<m;j++) {
				if((j == 0 || j == m-1) || (i == n/2)) {
					
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
      PatternH.print();
    }
}