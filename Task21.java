package Task;

public class Task21 {
	public static void main(String [] args){
		
		int a = 1;
		do {
			int b = 4;
			do {
				if (a == 5){
					System.out.print("");
				}else{
					System.out.print("x");
				}
				b--;
			}while (b >= a);
			int c = 1;
			do {
				System.out.print(c);
				c++;
			}while (c <= a);
			int d = a - 1;
			do {
				if ( d == 0){
					System.out.print("");
				}else{
					System.out.print(d);
				}
				d--;
			}while (d >= 1);
			int e = 4;
			do {
				if (a == 5){
					System.out.print("");
				}else{
					System.out.print("x");
				}
				e--;
			}while (e >= a);
			System.out.println();
			a++;
		}while (a <= 5);
	}

}
