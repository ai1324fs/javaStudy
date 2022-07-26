package studies;
/*
 * [문제20] output(10,'#')함수를 호출하여 다음과 같이 출력하시오
        조건)출력문에서 for문을 이용하시오

<결과>
# # # # # # # # # # 
 */
public class m20 {
	


	public static void main(String[] args) {
	
	for(int i = 0; i <=5; i++) {
		System.out.print(output1(10,'#'));
	
}
}

	private static char[] output1(int l, char c) {
		char[] output = {c,c};
		return output;
	}
	public static void output2() {
		char[] output = {10, '#'};
	}
}