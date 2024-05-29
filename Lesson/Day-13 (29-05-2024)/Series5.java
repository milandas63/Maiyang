
public class Series5 {

	public static void main(String[] args) {
		// b)  1, 4, 8, 13, 16, 20, 25, ...................
		int seed = 1;
		int add = 3;
		
		for(int i=0; i<15; i++) {
			System.out.print(seed+", ");
			seed = seed+add;
			add++;
			if(add>5) add = 3;
		}

	}

}
