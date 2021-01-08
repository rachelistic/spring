<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>welcome</title>
</head>
<body>
<div align="center">
<c:if test="${sauth eq 'NA'}">
<h1>등록되지 않은 사용자이거나 패스워드를 잘못 입력하셨습니다.</h1>
<button onclick="location.href='memberLoginForm.do'">로그인페이지로</button>
</c:if>
<c:if test="${sauth ne 'NA'}">
<h1>반갑습니다 ${sname}님. </h1>
<button onclick="location.href='memberList.do'">회원보기</button>
<button onclick="location.href='memberLogout.do'">로그아웃</button>

</c:if>


</div> 
</body>
</html>