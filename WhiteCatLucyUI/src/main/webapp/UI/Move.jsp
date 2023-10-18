<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link href="style/main.css" rel="stylesheet" type="text/css">
<link href="style/display/move.css" rel="stylesheet" type="text/css">
<link href="style/button.css" rel="stylesheet" type="text/css">
<meta charset="UTF-8">
<title>Move</title>
</head>
<body>
<div class="display">
		<div class="scriptBox">
			<h3 class="now" id="script">어디로갈까?</h3>
			<button type="button" class="button-alley button-effect" onclick="location.href='./alley'">골목</button>
			<button type="button" class="button-darkforest button-effect" onclick="location.href='./darkForest'">검은 숲</button>
			<button type="button" class="button-home button-effect" onclick="location.href='./home'">집</button>
			<button type="button" class="button-jewelcave button-effect" onclick="location.href='./jewelCave'">보석동굴</button>
			<button type="button" class="button-cloud button-effect" onclick="location.href='./cloud'">환상적인 구름</button>
			<button type="button" class="button-endroad button-effect" onclick="location.href='./road'">끝의 길</button>
			<button type="button" class="button-back button-effect" onclick="location.href='./playerAction' ">돌아가기</button>
		</div>
	</div>
</body>
</html>