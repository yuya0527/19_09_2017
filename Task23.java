package Task;

public class Task23 {
	public static void main (String [] args){
		
		int a = 4;
		do {
			int b = a;
			do {
				System.out.print(b);
				b--;
			}while (b >= 1);
			System.out.println();
			a--;
		}while (a >= 1);
		
	}

}
