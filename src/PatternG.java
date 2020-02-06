
import java.util.Scanner;

public class PatternG {

	static void print() {
		int n=8;
		int m =8;
		for(int i = 0;i<n;i++) {
			for(int j = 0;j<m;j++) {
				if((j == 0) && (i != 0 && i != n-1) || ((i == 0 ) && (j > 0 && j<m-1)) 
						|| ((i == n-1) && (j>0 && j<m-2))
						|| ((i == n/2) && (j>2 && j <= m-1 )) 
						|| ((i == n-3 || i == n-2 ) && (j == m-2))) {
					
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
      PatternG.print();
    }
}