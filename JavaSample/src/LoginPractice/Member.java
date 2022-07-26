package LoginPractice;

public class Member { //DB table(member)과 일치
	
	private String id; //id field (member_name)
	private String pw; //pw field (member_no)
	
	public String getid() {
		return id;
	}
	public String getpw() {
		return pw;
	}
	public void setid(String id) {
		this.id = id;
	}
	public void setpw(String pw) {
		this.pw = pw;
	}
}