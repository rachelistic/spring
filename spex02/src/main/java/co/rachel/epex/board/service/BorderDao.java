package co.rachel.epex.board.service;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.sql.DataSource;

import co.rachel.epex.board.vo.BorderVo;

/*@Repository("/BorderDao") 세터에 의한 주입방법은 어노테이션 없어도됨*/

public class BorderDao implements BorderService {

	private DataSource dataSource; // 세터 주입방법
	private Connection conn;
	private PreparedStatement psmt;
	private ResultSet rs;

	private String SELECTLIST = "SELECT * FROM BORDER";
	private String INSERT = "INSERT INTO BORDER(BORDERID, BORDERTITLE,BORDERWRITER,BORDERCONTENT)"
			+ "VALUES(?,?,?,?)";

	public void setDataSource(DataSource dataSource) { // 요렇게 셋터를 만들어놓고 bean객체에서 주입
		this.dataSource = dataSource;
	}

	@Override
	public ArrayList<BorderVo> selectList() {
		ArrayList<BorderVo> list = new ArrayList<>();
		BorderVo vo;
		try {
			conn = dataSource.getConnection();
			System.out.println("DB연결 성공");
			psmt = conn.prepareStatement(SELECTLIST);
			rs = psmt.executeQuery();
			while (rs.next()) {
				vo = new BorderVo();
				vo.setBorderId(rs.getInt("borderid"));
				vo.setBordertitle(rs.getString("bordertitle"));
				vo.setBorderwriter(rs.getString("borderwriter"));
				vo.setBordercontent(rs.getString("bordercontent"));
				vo.setBorderdate(rs.getDate("borderdate"));
				vo.setBorderhit(rs.getInt("borderhit"));

				list.add(vo);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return list;
	}

	@Override
	public BorderVo select(BorderVo vo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int insert(BorderVo vo) {
		int n = 0;
		try {
			conn = dataSource.getConnection();
			System.out.println("DB연결해서 insert");
			psmt = conn.prepareStatement(INSERT);
			psmt.setInt(1, vo.getBorderId());
			psmt.setString(2, vo.getBordertitle());
			psmt.setString(3, vo.getBorderwriter());
			psmt.setString(4, vo.getBordercontent());
			/* psmt.setDate(5, vo.getBorderdate()); */
			n = psmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return n;
	}

	@Override
	public int update(BorderVo vo) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(BorderVo vo) {
		// TODO Auto-generated method stub
		return 0;
	}

	private void close() {
		try {
			if (rs != null)
				rs.close();
			if (psmt != null)
				psmt.close();
			if (conn != null)
				conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
