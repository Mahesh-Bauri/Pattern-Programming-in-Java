
//import java.util.Scanner;

public class PatternN {

	static void print() {
		int n= 11;
		int m = 11;
		for(int i = 0;i<n;i++) {
			for(int j = 0;j<m;j++) {
				if((j == 0) || (j == m - 1)  || (i == j)) {
					
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
      PatternN.print();
    }
}