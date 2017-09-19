package Task;

public class Task10 {
	public static void main(String [] args){
		
		int a = 1;
		 while (a <= 4){
			 int b = 1;
			 while (b <= a - 1){
				 System.out.print("x");
				 b++;
			 }
				 int c = 1;
				 while (c <= 5 - a ){
					System.out.print( c ); 
					c++;
				 }
			 System.out.println();
			 a++;
		 }
	}
}
