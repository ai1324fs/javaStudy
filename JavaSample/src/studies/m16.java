package studies;

public class m16 {
	public static void main(String[] args) {
		for (int n = 1; n<100; n++) {
			int result = 0;
			if (n%3 == 0) {
				result += n;
			}
			
			if (n %5 ==0) {
				result += n;
			}
			System.out.println(result);
		}
	}
}
