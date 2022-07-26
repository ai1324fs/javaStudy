package studies;

public class m5 {
	/*입력 Input name : 민들래
	kor : 90 
	eng : 70 
	mat : 75

	--출력--
	이름 : 민들래
	합계점수 : 235점
	평균점수 :  78.3   <-- 소수 1자리까지출력하시오
	*/
	public static void main(String[] args) {
		int kor = 90;
		int eng = 70;
		int mat = 75;
		
		int total = kor+eng+mat;
		double aver = total / (3.0) ;
		System.out.println("이름 : 아무개");
		System.out.println("합계점수 : "+ total);
		System.out.println("평균점수 : "+ String.format("%.1f",aver) );
		//String.format("%.?f",(소수점 몇번째까지 표출 그뒤는 자르기))
	}
}
