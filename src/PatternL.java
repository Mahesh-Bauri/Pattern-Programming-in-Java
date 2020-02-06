
//import java.util.Scanner;

public class PatternL {

	static void print() {
		int n= 7;
		int m = 7;
		for(int i = 0;i<n;i++) {
			for(int j = 0;j<m;j++) {
				if((j ==  0) || (i == n - 1)) {
					
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
      PatternL.print();
    }
}