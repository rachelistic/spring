package co.rachel.spex.member.service;
import java.sql.SQLException;
import java.util.ArrayList;
import co.rachel.spex.member.vo.MemberVo;

public interface MemberService {
	ArrayList<MemberVo> MemberList() throws SQLException; //멤버전체 목록조회
	MemberVo memberSelect(MemberVo vo) throws SQLException;//멤버 한명 조회하는것
	int memberInsert(MemberVo vo) throws SQLException;
	int memberUpdate(MemberVo vo) throws SQLException;
	int memberDelete(MemberVo vo) throws SQLException;
	
	MemberVo memberLoginCheck(MemberVo vo) throws SQLException; //맴버 로그인 체크
	

}
