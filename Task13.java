package Task;

public class Task13 {
	public static void main(String [] args){
		
		int a = 1;
		while (a <= 4){
			int b = 4;
			while (b >= a){
				System.out.print("x");
				b--;
			}
			int c = 1;
			while (c <= a){
				System.out.print(c);
				c++;
			}
			int d = a - 1;
			while (d >= 1){
				System.out.print(d);
				d--;
			}
			int e = 4;
			while (e >= a){
				System.out.print("x");
				e--;
			}
			System.out.println();
			a++;
		}
		int f = 5;
		while (f >= 1){
			int g = 5 - f;
			while (g >= 1){
				System.out.print("x");
				g--;
			}
			int h = 1;
			while (h <= f){
				System.out.print(h);
				h++;
			}
			int i =f - 1;
			while (i >= 1){
				System.out.print(i);
				i--;
			}
			int j = 5 - f;
			while (j >= 1){
				System.out.print("x");
				j--;
			}
			System.out.println();
			f--;
		}
	}

}
