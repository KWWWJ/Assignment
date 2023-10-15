
var count = 0;
var what = 0;

const addBtn = document.getElementById("addButton");
const ScriptBox = document.getElementById("script");

ScriptBox.innerHTML =  script[count++];

addBtn.onclick = function(){
		console.log(count)
	if(count < script.length){
		ScriptBox.innerHTML = script[count++];
	}else{
		//location.href="./PlayerActionScript.jsp";
		//각 맵으로 이동하는 링크를 if로 달아주기
	}
	
	if(what = 1){location.href="./move"}
	if(what = 2){location.href="./bag"}
	if(what = 3){location.href="./rest"}
	if(what = 4){location.href="./status"}
	
	
}