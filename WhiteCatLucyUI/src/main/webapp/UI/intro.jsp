<%@ page language="java" contentType="text/html; charset=UTF-8"
	import="java.util.List"
	import="java.util.ArrayList"
	isELIgnored="false" pageEncoding="UTF-8"%>
<%
	ArrayList nowScript = (ArrayList<String>)request.getAttribute("box");;
	String arr = "\"루시는 하얀고양이다\", \"루시는 소파에 엎드려있다\"";
%>
<!DOCTYPE html>
<html>
<head>
<link href="style/main.css" rel="stylesheet" type="text/css">
<link href="style/display/intro.css" rel="stylesheet" type="text/css">
<link href="style/button.css" rel="stylesheet" type="text/css">
<meta charset="UTF-8">
<title>Intro</title>
<script type="text/javascript" >
	var script = [ ${arr} ]
	//"루시는 하얀고양이다", "루시는 소파에 엎드려있다"
</script>
</head>
<body>
	<div class="display">
		<div class="scriptBox">
			<h3 class="now" id="script">스크립트</h3>
			<div id="addButton" class="butten-hover">
				<img class="image" alt="발바닥이미지" src="image/whitefoot.png">
			</div>
		</div>
	</div>
	<script type="text/javascript" src="./JSfile/intro.js"></script>
</body>
</html>