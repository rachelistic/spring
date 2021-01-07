package co.rachel.spex.member.serviceImpl;

import java.sql.SQLException;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.rachel.spex.member.service.MemberDao;
import co.rachel.spex.member.service.MemberService;
import co.rachel.spex.member.vo.MemberVo;

@Service("memberService")
public class MemberServiceImpl implements MemberService {
	@Autowired
	private MemberDao dao;

	
	
	@Override
	public ArrayList<MemberVo> MemberList() throws SQLException{
		// TODO Auto-generated method stub
	
		return dao.MemberList();
	}

	@Override
	public MemberVo memberSelect(MemberVo vo) throws SQLException{
		// TODO Auto-generated method stub
		return dao.memberSelect(vo);
	}

	@Override
	public int memberInsert(MemberVo vo) throws SQLException{
		// TODO Auto-generated method stub
		return dao.memberInsert(vo);
	}

	@Override
	public int memberUpdate(MemberVo vo)throws SQLException {
		// TODO Auto-generated method stub
		return dao.memberUpdate(vo);
	}

	@Override
	public int memberDelete(MemberVo vo) throws SQLException{
		// TODO Auto-generated method stub
		return dao.memberDelete(vo);
	}

	@Override
	public boolean memberLoginCheck(MemberVo vo) throws SQLException{
		// TODO Auto-generated method stub
		return dao.memberLoginCheck(vo);
	}

}
