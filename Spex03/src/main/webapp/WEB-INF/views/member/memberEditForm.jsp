<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Member Edit Form</title>
</head>
<body>

	<div align="center">
	<h1>회원 수정</h1>
	<div>	
		<form id="frm" name="frm" action="memberUpdate.do" method="post">
			<div>
				<table border=1>
					<tr>
						<th>회원 아이디</th>
						<td><input type="text" name="memberId" id="memberId" value="${vo.memberId}" readonly></td>
						
					</tr>
					<tr>
						<th>회원 이름</th>
						<td><input type="text" name="memberName" id="memberName" value="${vo.memberName}"></td>
					</tr>
					<tr>
						<th>비밀번호</th>
						<td><input type="password" name="password" id="password" value="${vo.password}"></td>
					</tr>
					<tr>
						<th>회원 권한</th>
						<td><input type="text" name="memberauth" id="memberauth"  value="${vo.memberauth}"></td>
					</tr>
				</table>
				<input type="submit" value="수정하기"> 
				<input type="button" value="취소하기" onclick="location.href='memberList.do'" >


			</div>
	</form>

	</div>
	</div>



</body>
</html>