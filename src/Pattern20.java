
public class Pattern20 {
	
	
	static void patt() {
		int n = 4;
		System.out.println("Pattern : \n");
		for(int i = 0;i<=n;i++) {
            for(int j = 0;j<=n;j++) {
            	if(i == (n/2) || j == (n/2) ) {
            		System.out.print("X ");
            	}
            	else {
            		System.out.print("  ");
            	}
                }
            System.out.println();
             }
		 System.out.println();
	}
	static void patt2() {
		int n = 4;
		System.out.println("Pattern 1: \n");
		for(int i = 0;i<=n;i++) {
            for(int j = 0;j<=n;j++) {
            	if(i == (n/2) || j == (n/2) ) {
            		System.out.print("X ");
            	}
            	else {
            		System.out.print("O ");
            	}
                }
            System.out.println();
             }
		 System.out.println();
	}
	static void patt3() {
		int n = 4;
		System.out.println("Pattern 2: \n");
		for(int i = 0;i<=n;i++) {
            for(int j = 0;j<=n;j++) {
            	if(i == j) {
            		System.out.print("O ");
            	}
            	else {
            		System.out.print("X ");
            	}
                }
            System.out.println();
             }
		 System.out.println();
	}
	static void patt4() {
		int n =4;
		System.out.println("Pattern 3: \n");
		for(int i = 0;i<=n;i++) {
            for(int j = 0;j<=n;j++) {
            	if((i == j) || (i+j == n)) {
            		System.out.print("* ");
            	}
            	else {
            		System.out.print("  ");
            	}
                }
            System.out.println();
             }
		 System.out.println();
	}
	static void patt5() {
		int n = 4;
		System.out.println("Pattern 4: \n");
		for(int i = 0;i<=n;i++) {
            for(int j = 0;j<=n;j++) {
            	if((i == j) || (i+j == n)) {
            		System.out.print("X ");
            	}
            	else {
            		System.out.print("O ");
            	}
                }
            System.out.println();
             }
		 System.out.println();
	}
	static void patt6() {
		int n = 4;
		System.out.println("Pattern 5: \n");
		for(int i = 0;i<=n;i++) {
            for(int j = 0;j<=n;j++) {
            	if(i == 0 || j == 0 || i == n || j == n) {
            		System.out.print("* ");
            	}
            	else {
            		System.out.print("# ");
            	}
                }
            System.out.println();
             }
		 System.out.println();
	}
	
	public static void main(String arg[]) {
		Pattern20.patt();
		Pattern20.patt2();
		Pattern20.patt3();
		Pattern20.patt4();
		Pattern20.patt5();
		Pattern20.patt6();
	}

}
