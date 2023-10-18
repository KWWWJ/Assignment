<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String arr = "\"확인\", \"나오나?\"";
%>
<!DOCTYPE html>
<html>
<head>
<link href="style/main.css" rel="stylesheet" type="text/css">
<link href="style/display/playerActionScript.css" rel="stylesheet" type="text/css">
<link href="style/button.css" rel="stylesheet" type="text/css">
<meta charset="UTF-8">
<title>Lucy loding</title>
<script type="text/javascript">
	var script = [ ${arr} ];
	
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
<script type="text/javascript" src="./JSfile/playerActionScript.js"></script>
</body>
</html>