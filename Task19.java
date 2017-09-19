package Task;

public class Task19 {
	public static void main(String [] args){
		
		int a = 1;
		do {
			int b = 4;
			do {
				System.out.print(b);
				b--;
			}while (b >= 1);
			System.out.println();
			a++;
		}while (a <= 4);
	}

}
