package co.rachel.epex.board.serviceImpl;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.rachel.epex.board.service.BorderDao;
import co.rachel.epex.board.service.BorderService;
import co.rachel.epex.board.vo.BorderVo;

@Service("borderService")
public class BorderServiceImpl implements BorderService {
	
	@Autowired
	private BorderDao dao;
	
	@Override
	public ArrayList<BorderVo> selectList() {
		// TODO Auto-generated method stub
		return dao.selectList();
	}

	@Override
	public BorderVo select(BorderVo vo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	   public int insert(BorderVo vo) {
	      // TODO Auto-generated method stub
	      return dao.insert(vo);
	   }
//=========================================
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

}
