package Task;

public class Task17 {
	public static void main(String [] args){
		
		int a = 1;
		int z=1;
		do {
			int b = 1;
			do {
				System.out.print(z);
				z++;
				b++;			
			}while (b <= a);
			System.out.println();
			a++;			
		}while (a <= 4);
		

	
	}
}
