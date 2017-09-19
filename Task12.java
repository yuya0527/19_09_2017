package Task;

public class Task12 {
	public static void main(String [] args){
		
		int a = 4;
		while (a >= 1){
			int b = 4 - a;
			while (b >= 1){
				System.out.print("x");
				b--;
			}
			int c = 1;
			while (c <= a){
				System.out.print(c);
				c++;
			}
			int d = a -1;
			while (d >= 1){
				System.out.print(d);
				d--;
			}
			int e = 4 - a;
			while (e >= 1){
				System.out.print("x");
				e--;
			}
			
			System.out.println();
			a--;
		}
		}
	}


