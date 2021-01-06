package co.rachel.epex.board.service;

import java.util.ArrayList;

import co.rachel.epex.board.vo.BorderVo;

public interface BorderService {
	ArrayList<BorderVo> selectList(); //전체 리스트 가져오기 
	BorderVo select(BorderVo vo ); //하나의 레코드 가져오기
	int insert(BorderVo vo); //레코드 삽입
	int update(BorderVo vo); //레코드 수정
	int delete(BorderVo vo); //레코드 삭제
	
	//디폴트 프로텍티드가 되면 내 패키지 내에서만 쓸수있어. 다른쪽에서 쓰게하려면 public 써라.
	//ciud가장 기본 완료
	//서비스에 인터페이스 만들어놨음 


}
