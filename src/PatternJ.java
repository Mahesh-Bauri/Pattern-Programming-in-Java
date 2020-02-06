
import java.util.Scanner;

public class PatternJ {

	static void print() {
		int n=7;
		int m =5;
		for(int i = 0;i<n;i++) {
			for(int j = 0;j<m;j++) {
				if((i == 0) || (j == m-1 && i != n-1) || (( i == n - 1 ) && (j>0 && j< m - 1)) || ((i == n-2 || i == n-3) && (j == 0))) {
					
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
      PatternJ.print();
    }
}