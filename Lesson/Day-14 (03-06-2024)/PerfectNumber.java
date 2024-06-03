
public class PerfectNumber {

	static boolean isPefect(int n) {
		int sum = 1;
		for (int i = 2; i * i <= n; i++) {
			if (n % i == 0) {
				if (i * i != n)
					sum = sum + i + n / i;
				else
					sum = sum + i;
			}
		}
		if (sum == n && n != 1)
			return true;
		return false;
	}

	public static void main(String[] args) {
		for (int n = 2; n < 1000000; n++) {
			if (isPefect(n))
				System.out.println(n);
		}
	}
}
