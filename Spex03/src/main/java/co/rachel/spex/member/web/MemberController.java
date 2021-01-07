package co.rachel.spex.member.web;

import java.sql.SQLException;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import co.rachel.spex.member.service.MemberService;
import co.rachel.spex.member.vo.MemberVo;

@Controller
public class MemberController {

	@Autowired
	private MemberService memberService; //멤버 서비스 임플에 서비스라고 했기때문에 자동주입 가능해, ms에 자동주입하고 ms이용.
	
	@RequestMapping("/memberList.do")
	public String memberList(Model model) throws SQLException {//전송위해 모델 객체를 사용
			ArrayList<MemberVo> members = new ArrayList<MemberVo>();
			members = memberService.MemberList();
			model.addAttribute("members", members);
		return "member/memberList";
		
	}
	@RequestMapping("/memberInsertForm.do")
	public String memberInsert(){
		return "member/memberInsertForm";//입력폼을 호출한당.
	}
	
	@PostMapping("/memberInsert.do")
	public String memberInsert(MemberVo vo,Model model) throws SQLException{
		String viewPath =null;
		int n = memberService.memberInsert(vo);
		if(n!=0)
			viewPath="redirect:memberList.do"; //매핑메소드 (맵퍼를) 호출
		else
			viewPath ="member/memberInsertFail"; // jsp페이지를 호출할때
		return viewPath;
	}
	
	@RequestMapping("/memberEditForm.do")
	public String memberEditForm(String id, Model model) throws SQLException{ //멤버 한명 수정 폼
		MemberVo vo = new MemberVo();
		vo.setMemberId(id);
		System.out.println(id);
		vo = memberService.memberSelect(vo);
		model.addAttribute("vo", vo);
		return "member/memberEditForm";
	}
	
	@PostMapping("/memberUpdate.do")
	public String memberEdit(MemberVo vo, Model model) throws SQLException{
		String viewPath = null;
		int n = memberService.memberUpdate(vo);
		if(n!=0)
			viewPath="redirect:memberList.do";
		else 
			viewPath = "member/memberInsertFail";
		return viewPath;
		
	}
	
	@RequestMapping("/memberDelete.do")
	public String memberDelete(String id, Model model) throws SQLException{
		MemberVo vo = new MemberVo();
		vo.setMemberId(id);
		System.out.println(id+"삭제합니다.");
		String viewPath=null;
		int n = memberService.memberDelete(vo);
		if(n!=0)
			viewPath="redirect:memberList.do";
		else 
			viewPath = "member/memberInsertFail";
		return viewPath;
	}
	@RequstMapping("/memberLoginForm.do")
	pub
}
