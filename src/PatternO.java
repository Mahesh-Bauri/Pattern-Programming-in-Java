
//import java.util.Scanner;

public class PatternO {

	static void print() {
		int n= 20;
		int m = 20;
		for(int i = 0;i<n;i++) {
			for(int j = 0;j<m;j++) {
				if(((j == 0 ||j == m-1) && (i != 0  && i != n - 1 )) ||  (( i == 0 || i == n -1) && (j != 0 && j != m -1 ))) {
					
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
      PatternO.print();
    }
}