
//import java.util.Scanner;

public class PatternK {

	static void print() {
		int n= 7;
		int m = 5;
		for(int i = 0;i<n;i++) {
			for(int j = 0;j<m;j++) {
				if((j ==  0) || ((2 * (i - 1) == i + j) || (i + j == m - 1))) {
					
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
      PatternK.print();
    }
}