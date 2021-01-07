package co.rachel.spex.member.service;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;
import co.rachel.spex.member.vo.MemberVo;

public class MemberRowMapper implements RowMapper<MemberVo> {

	@Override
	public MemberVo mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		MemberVo vo = new MemberVo();
		
		vo.setMemberId(rs.getString("memberid"));
		vo.setMemberName(rs.getString("membername"));
		vo.setPassword(rs.getString("password"));
		vo.setMemberauth(rs.getString("memberauth"));
		vo.setMemberpoint(rs.getInt("memberpoint"));
		
		return vo;
	}

}
