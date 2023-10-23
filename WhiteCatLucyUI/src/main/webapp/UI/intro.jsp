<%@ page language="java" contentType="text/html; charset=UTF-8"
	import="java.util.List"
	import="java.util.ArrayList"
	isELIgnored="false" pageEncoding="UTF-8"%>
<%--
	ArrayList<String> intro = (ArrayList<String>)session.getAttribute("box");
--%>
<%
	String test = (String)session.getAttribute("test");
	ArrayList<String> nowTest = (ArrayList<String>)session.getAttribute("list");
%>
<!DOCTYPE html>
<html>
<head>
<link href="style/main.css" rel="stylesheet" type="text/css">
<link href="style/display/intro.css" rel="stylesheet" type="text/css">
<meta charset="UTF-8">
<title>Intro</title>
<script type="text/javascript" >
	var script = [ ${nowTest} ]
</script>
</head>
<body>
	<div id="root">
		<div class="display">
			<div class="in-box">
				<div class="script-box">
					<h3 class="now" id="script">스크립트</h3>
					<div id="addButton" class="butten-hover">
						<img class="image" alt="발바닥이미지" src="image/whitefoot.png">
					</div>
				</div>
			</div>
		</div>
	</div>
	<script type="text/javascript" src="./JSfile/intro.js"></script>
</body>
</html>