package co.rachel.spex.member.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import co.rachel.spex.member.vo.MemberVo;

@Repository("MemberDao")
public class MemberDao implements MemberService{
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public ArrayList<MemberVo> MemberList() {
		String sql = "select * from member";
		return (ArrayList<MemberVo>) jdbcTemplate.query(sql, new MemberRowMapper());
		
	}
	@Override
	public MemberVo memberSelect(MemberVo vo) {
		String sql = "select * from member where memberid = ?";
		Object[] args = {vo.getMemberId()};
		return jdbcTemplate.queryForObject(sql, args,new MemberRowMapper());
	}
	@Override
	public int memberInsert(MemberVo vo) {
		String sql ="INSERT INTO MEMBER (MEMBERID,MEMBERNAME,PASSWORD,MEMBERAUTH)"
				+ "VALUES(?,?,?,?)";
		Object[] args = {vo.getMemberId(),vo.getMemberName(),vo.getPassword(),vo.getMemberauth()};
		return jdbcTemplate.update(sql,args);
	}
	@Override
	public int memberUpdate(MemberVo vo) {
		String sql ="UPDATE MEMBER SET MEMBERNAME=?, PASSWORD=?,MEMBERAUTH=? WHERE MEMBERID=?";
		Object[] args = {vo.getMemberName(), vo.getPassword(), vo.getMemberauth(), vo.getMemberId()};
		return jdbcTemplate.update(sql,args);
	}
	@Override
	public int memberDelete(MemberVo vo) {
		String sql = "DELETE FROM MEMBER WHERE MEMBERID=?";
		return jdbcTemplate.update(sql, vo.getMemberId());
	}
	@Override
	public boolean memberLoginCheck(MemberVo vo) {
		boolean check= false;
		String sql = "SELECT COUNT(*) FROM MEMBER WHERE MEMBERID=? AND PASSWORD=?";
		Object[]args = {vo.getMemberId(), vo.getPassword()};
		int n = jdbcTemplate.queryForObject(sql, args, Integer.class);
		if (n!=0) check = true;
		return check;
	}
	 
	
}
