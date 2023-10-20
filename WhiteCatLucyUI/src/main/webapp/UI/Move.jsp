<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link href="style/main.css" rel="stylesheet" type="text/css">
<link href="style/display/move.css" rel="stylesheet" type="text/css">
<meta charset="UTF-8">
<title>Move</title>
</head>
<body>
<div id="root">
		<div class="display">
			<div class="in-box">
				<div class="script-box">
					<button type="button" class="button-alley button-effect" onclick="location.href='./alley'"><h3>골목</h3></button>
					<button type="button" class="button-darkforest button-effect" onclick="location.href='./darkForest'"><h3>검은 숲</h3></button>
					<button type="button" class="button-home button-effect" onclick="location.href='./home'"><h3>집</h3></button>
					<button type="button" class="button-jewelcave button-effect" onclick="location.href='./jewelCave'"><h3>보석동굴</h3></button>
					<button type="button" class="button-cloud button-effect" onclick="location.href='./cloud'"><h3>환상적인 구름</h3></button>
					<button type="button" class="button-endroad button-effect" onclick="location.href='./road'"><h3>끝의 길</h3></button>
				</div>
				<button type="button" class="button-back button-effect" onclick="location.href='./playerAction' ">돌아가기</button>
			</div>
		</div>
	</div>
</body>
</html>