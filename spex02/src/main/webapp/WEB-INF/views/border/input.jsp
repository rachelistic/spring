<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<style>
table {width:600px;}
td {padding:10px;}
input{width:98%; height:3rem;}
textarea{width:98%;}

</style>
<meta charset="UTF-8">
<title>INPUT</title>
</head>
<body>
<div align="center">
<div><h1>글쓰기</h1></div>
<div>
<form id ="frm" name="frm" action="borderinput" method="post">
<table>
<tr>
<th width="50">순번</th>
<td><input type="text" id="borderId" name="borderId"></td>
</tr>
<tr>
<th width="50">제목</th>
<td><input type="text" id="borderTitle" name="borderTitle"></td>
</tr>
<tr>
<th width="50">작성자</th>
<td><input type="text" id="borderWriter" name="borderWriter"></td>
</tr>
<tr>
<th width="50">내용</th>
<td>
<textarea id="borderContent" name="borderContent" rows="5" cols="20"></textarea>
</td>
</tr>
<!-- <tr>
<th width="50">날짜</th>
<td><input type="date" id="borderDate" name="borderDate"></td>
</tr>
<tr> -->
<td></td>
<td><input type="submit" value="저장하기"></td>
</tr>



</table>



</form>
</div>
</div>
</body>
</html>