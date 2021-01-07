package co.rachel.epex.board.web;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import co.rachel.epex.board.service.BorderService;
import co.rachel.epex.board.vo.BorderVo;

@Controller //어노테이션 붙여줌
public class BorderController {
	@Autowired
	private BorderService borderService;
	//리퀘스트 맵핑해서 borderlist라고 들어오면 메소드 만들어줄것 
	@RequestMapping("/border/list")
	public String list(Model model) {
		
		ArrayList<BorderVo> list = new ArrayList<BorderVo>();
		list= borderService.selectList();
		model.addAttribute("borderlist",list); //""는 jsp에서 사용할 이름
		
		return "border/list";
		
		
	}
	
	@RequestMapping("/border/input") //입력폼을 호출한다. 
	public String input() {
		
			return "border/input"; 
	}
	@RequestMapping("/border/borderinput") //디비에 저장하는 메소드 (.do가 들어가면 맵퍼명, 그냥은 메소드명, 그냥은 jsp페이지명) 
	public String borderinput(BorderVo vo, Model model) {
		int n = 0;
		String viewPath = null;
		n = borderService.insert(vo);
		if(n !=0) {
			viewPath="redirect:list"; //맵퍼명
		}else {
			viewPath="border/inputfail";
		}

		
		return viewPath; //입력한 후 목록으로 돌려준다.
	}


}
