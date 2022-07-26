import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Helloworld5  { 	
	
	
	public static void main(String[] args) throws IOException {   //번지: 3000 가정, 구로구
		Helloworld5 helloworld3 =  new Helloworld5();

//public final class Scanner extends Object	implements Iterator<String>, Closeable
		Scanner sc = new Scanner(System.in);
		System.out.print("인사말을 입력해 주세요 : ");
		  
		String  Hello = sc.nextLine();
					
		System.out.println("인사말은 : " + Hello);		
		System.out.println("======위에는 Scanner class example=======");
		
		BufferedReader br = 
				new BufferedReader(new InputStreamReader(System.in));
		// memory = buffer = 8192Kbyte = pointer(C) = Address(번지) 		
		System.out.println(br);// Address value 
		
		System.out.print("인사말을 입력해 주세요 : ");
		String str = br.readLine();
		System.out.println("Buffered 인사말: " + str); 
		
	}

	
}

 //memory: RAM => 16GB
// 접근제한자
/*
 * 생략: 
 * private: 같은 패키지의 같은 클래스내에 존재하는 경우에, 정보은닉(캡슐화)
 * protected: 상속관계 있는 같은 패키지와 클래스의 경우에 
 * public: 
 * 
 * method 형식
 * 
 * public static void Hello() {
 * 
 * 
 *  }
 * 
 * buffer : 임시 기억장치
 * 
 * 
 * 
 * 
 */







