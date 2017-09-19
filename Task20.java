package Task;

public class Task20 {
	public static void main(String [] args){
		
		int a = 1;
		 do {
			 int b = 4;
			 do {
				 if(a == 5){
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
		 System.out.println();
		 a++;
	}while (a <= 5);
	}
}
