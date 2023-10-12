<%@ page language="java" contentType="text/html; charset=UTF-8"
	isELIgnored="false" 
    pageEncoding="UTF-8"%>
    

<!DOCTYPE html>
<html>
<head>
<link href="style/main.css" rel="stylesheet" type="text/css">
<link href="style/button.css" rel="stylesheet" type="text/css">
<meta charset="UTF-8">
<title>Intro</title>
</head>
<body>
	<div class="display">
		<div class="scriptBox">
			<h3>${box[0] }</h3>
			<div class="butten-hover" type="button" onclick="">
				<img class="image" alt="발바닥이미지" src="image/whitefoot.png" >
			</div>
		</div>
		
	</div>
		<button type="button" class="button-temporary" onclick="location.href='./tutoral.jsp' ">임시 이동버튼</button>
</body>
</html>