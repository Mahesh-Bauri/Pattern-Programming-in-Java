
//import java.util.Scanner;

public class PatternM {

	static void print() {
		int n= 11;
		int m = 11;
		for(int i = 0;i<n;i++) {
			for(int j = 0;j<m;j++) {
				if((j == 0) || (j == m - 1) || ((i <=  Math.ceil(n/2)) && (i == j)) || ((i<= Math.ceil(n/2)) && (i + j == m - 1))) {
					
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
      PatternM.print();
    }
}