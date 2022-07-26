package studies;

import java.util.Scanner;
// 제대로 이해하지 못했음
public class m9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		sc.close();
		char[] change = a.toCharArray();
		//문자열을 배열로
		for(int i = 0; i<change.length; i++) {
		//단어 길이만큼 돌린다
		if(change[i] >= 'A' && change[i] <= 'Z') {
			//만약 배열에 들어있는 알파벳이 위 조건식에 해당한다면
			change[i] = (char) (change[i] + 32);
			//값에 + 32 해주어 대문자를 소문자로 바꾼다(아스키 코드값에 의하면 대문자와 소문자는 32의 차이가 나며 대문자가 더 작은값이다)
		}else if(change[i] >= 'a' && change[i] <= 'z') {
			//만약 배열에 들어있는 알파벳이 위 조건식에 해당한다면
			change[i] = (char) (change[i] - 32);
			//값에 - 32 해주어 소문자를 대문자로 바꾼다(아스키 코드값에 의하면 소문자와 대문자는 32의 차이가 나며 소문자가 더 큰값이다)
		}else {
			System.out.println("입력 데이터 오류");
			break;
		}
		}
		System.out.println(change);
	}
}
