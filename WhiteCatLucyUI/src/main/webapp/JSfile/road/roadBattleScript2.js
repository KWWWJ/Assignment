var script = []
var count = 0;
var hp = 1;

const addBtn = document.getElementById("addButton");
const ScriptBox = document.getElementById("script");

ScriptBox.innerHTML =  script[count++];

addBtn.onclick = function(){
		console.log(count)
	if(count < script.length){
		ScriptBox.innerHTML = script[count++];
	}else{
		if(hp < 1){
			location.href="./roadBattleResult";
		}
		else{
			location.href="./roadBattle";
		}
	}
}


