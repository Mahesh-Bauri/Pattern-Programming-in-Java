
import java.util.Scanner;

public class PatternB {

	static void print() {
		int n=10;
		int m = 10;
		for(int i = 0;i<n;i++) {
			for(int j = 0;j<m;j++) {
				if((j == 0) || (j == m-1) && ((i != 0) && (i != m/2) && (i != m-1) ) || ((i == 0 || i == m/2 || i == m-1) && (j>0 && j<m-1))) {
					
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
      PatternB.print();
    }
}