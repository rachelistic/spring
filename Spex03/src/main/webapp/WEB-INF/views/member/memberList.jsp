<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>

<script type="text/javascript">
function formAction(str){

	if(str == "1"){
		frm.action="memberEditForm.do";


	else if(str == "2"){
		frm.action="memberDelete.do";
	
		}
	}
}

</script>

<meta charset="UTF-8">
<title>Member List</title>
</head>
<body>
	<div align="center">
		<h1>회원 목록</h1>
		<h3>
			<a href="memberInsertForm.do">회원추가</a>
		</h3>
		<table border=1>
			<tr>
				<th>아이디</th>
				<th>이름</th>
				<th>비밀번호</th>
				<th>권한</th>
				<th>포인트</th>
				<th>기능</th>
				
			</tr>
			<c:forEach var="member" items="${members }">

				<tr>
					<td>${member.memberId} &nbsp;&nbsp;</td>
					<td>${member.memberName} &nbsp;&nbsp;</td>
					<td>${member.password} &nbsp;&nbsp;</td>
					<td>${member.memberauth} &nbsp;&nbsp;</td>
					<td>${member.memberpoint} &nbsp;&nbsp;</td>

					<td>
					<form id="frm" name="frm" method="post" action="memberEditForm.do">
					<input value="${member.memberId}" id="id" name="id"	type="hidden"> 
					<button type="submit">수정</button>
					<button type="button" onclick='location.href="memberDelete.do?id=${member.memberId}"'>삭제</button>
					</form></td>

				
				</tr>
			</c:forEach>
		</table>
		<br />




	</div>
</body>

</html>