<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
</head>
<body>
<div class="loginfrm" id="loginfrm" align="center">
<form id="log" action="memberLogin.do">
<table>
<tr>
<th>아이디</th>
<td><input type="text" id="uid" name="uid"></td>
</tr>
<tr>
<th>패스워드</th>
<td><input type="password" id="upw" name="upw"></td>
</tr>
<tr>
<td></td>
<td>
<input id="login" type="submit" value="로그인">
</td>
</tr>
</table>
</form>
</div>
</body>
</html>