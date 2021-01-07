<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Register Member</title>
</head>
<body>
	<div align="center">
	<h1>회원 등록 화면</h1>
	<div>	
		<form id="frm" name="frm" action="memberInsert.do" method="post">
			<div>
				<table border=1>
					<tr>
						<th>회원 아이디</th>
						<td><input type="text" name="memberId" id="memberId"></td>
					</tr>
					<tr>
						<th>회원 이름</th>
						<td><input type="text" name="memberName" id="memberName"></td>
					</tr>
					<tr>
						<th>비밀번호</th>
						<td><input type="password" name="password" id="password"></td>
					</tr>
					<tr>
						<th>회원 권한</th>
						<td><input type="text" name="memberauth" id="memberauth"></td>
					</tr>
				</table>
				<input type="submit" value="등록하기"> 
				<input type="reset" value="취소하기" >


			</div>

		</form>
	</div>
</div>


</body>
</html>