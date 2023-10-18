<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link href="style/main.css" rel="stylesheet" type="text/css">
<link href="style/display/playerAction.css" rel="stylesheet" type="text/css">
<link href="style/button.css" rel="stylesheet" type="text/css">
<meta charset="UTF-8">
<title>Action</title>
</head>
<body>
<div class="display">
		<div class="scriptBox">
			<h3 class="now" id="script">무엇을할까?</h3>
			<div id="addButton">
				<button type="button" class="button-move button-effect" onclick="location.href='./move'">이동하기</button>
				<button type="button" class="button-bag button-effect" onclick="location.href='./bag'">배낭열기</button>
				<button type="button" class="button-rest button-effect" onclick="location.href='./rest'">휴식하기</button>
				<button type="button" class="button-rest button-effect" onclick="location.href='./status'">상태확인하기</button>
			</div>
		</div>
	</div>
</body>
</html>