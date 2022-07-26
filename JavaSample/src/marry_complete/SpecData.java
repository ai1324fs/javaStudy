package marry_complete;

public interface SpecData {
	//조회====================================================================
	public abstract void select_accessProcess(); // 정보 조회 (세부 정보 확인)
	public abstract void select_accessProcess_M();// 사용자 남자 정보조회 (등급화)
	public abstract void select_accessProcess_W();// 사용자 여자 정보조회 (등급화)
	//액션====================================================================
	public abstract void insert_accessProcess(); // 정보 기입
	public abstract void update_accessProcess(); // 정보 수정
	public abstract void delete_accessProcess(); // 정보 삭제
	//로그인==================================================================
	public abstract void login_accessProcess(); // 로그인
	
}
