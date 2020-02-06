
import java.util.Scanner;

public class PatternI {

	static void print() {
		int n=21;
		int m =21 ;
		for(int i = 0;i<n;i++) {
			for(int j = 0;j<m;j++) {
				if((j ==  m/2) || ((i == 0 || i == n - 1) )) {
					
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
      PatternI.print();
    }
}