<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link href="style/main.css" rel="stylesheet" type="text/css">
<link href="style/alley/battle.css" rel="stylesheet" type="text/css">
<meta charset="UTF-8">
<title>Battle</title>
</head>
<body>
	<div id="root">
		<div class="display">
			<div class="in-box">
				<div class="scriptBox"> <h3>어떻게 할까?</h3> 
					<button type="button" class="button-move button-effect" onclick="location.href='./alleyBattleScript1'">일반공격</button>
					<button type="button" class="button-bag button-effect" onclick="location.href='./alleyBattleBag'">아이템 사용하기</button>
					<button type="button" class="button-rest button-effect" onclick="location.href='./alleyBattleScript1'">스킬</button>
				</div>
				<button type="button" onclick="location.href='./alleyBattleResult'">전투 넘김</button>
			</div>
		</div>
	</div>
</body>
</html>