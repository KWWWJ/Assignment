<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link href="style/main.css" rel="stylesheet" type="text/css">
<link href="style/display/playerAction.css" rel="stylesheet" type="text/css">
<meta charset="UTF-8">
<title>Action</title>
</head>
<body>
	<div id="root">
		<div class="display">
			<div class="in-box">
				<div class="script-box">
					<button type="button" class="button-move" onclick="location.href='./move'"><h3>이동하기</h3></button>
					<button type="button" class="button-bag" onclick="location.href='./bag'"><h3>배낭열기</h3></button>
					<button type="button" class="button-rest" onclick="location.href='./rest'"><h3>휴식하기</h3></button>
					<button type="button" class="button-status" onclick="location.href='./status'"><h3>상태확인하기</h3></button>
				</div>
			</div>
		</div>
	</div>
</body>
</html>