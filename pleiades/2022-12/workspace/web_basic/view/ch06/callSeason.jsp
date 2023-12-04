<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page import = "ch03.Season" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	Season season = new Season();
	String seasonName = season.getSeason();
	out.println("季節は" + seasonName + "です。");
	%>
</body>
</html>