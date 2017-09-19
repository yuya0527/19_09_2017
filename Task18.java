package Task;

public class Task18 {
	public static void main(String [] args){
		
		int a = 1;
		do {
			int b = a;
			do {
				System.out.print(b);
				b--;
			}while (b >= 1);
			System.out.println();
			a++;
		}while (a <= 5);
	}

}
