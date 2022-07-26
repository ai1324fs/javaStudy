package LoginPractice;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import LoginPractice.Member;
import LoginPractice.MemberDAO;

class nowlogin{
	public static void main(String[] args) 
	{
		HashMap<String, String> map = new HashMap<String, String>();
		
		MemberDAO dao = new MemberDAO();
		ArrayList<Member> members = new ArrayList<Member>();
		
		try {
			members = dao.getMembers();	

		for(int i=0; i<members.size();i++)
			map.put(members.get(i).getid(),members.get(i).getpw());
		
		Scanner sc = new Scanner(System.in);	// 화면으로부터 라인단위로 입력받는다.

		while(true) {
			System.out.println("id와 password를 입력해주세요.");
			System.out.print("id :");
			String id = sc.nextLine().trim();

			System.out.print("password :");
			String password = sc.nextLine().trim();
			System.out.println();

			if(!map.containsKey(id)) {
				System.out.println("입력하신 id는 존재하지 않습니다. 다시 입력해주세요.");
				continue;
			} else {
				if(!(map.get(id)).equals(password)) {
				 System.out.println("비밀번호가 일치하지 않습니다. 다시 입력해주세요.");
				} else {
					System.out.println("id와 비밀번호가 일치합니다.");							
					break;
				}
			}
		} // while
		} catch(SQLException e) {
			System.out.println("예외처리 :"+e.getMessage()); // 예외 메시지 (console) 인쇄
			e.printStackTrace();
		} catch(Exception e) {
			System.out.println("예외처리 6:"+e.getMessage());
			e.printStackTrace();
		}
	} // main
}