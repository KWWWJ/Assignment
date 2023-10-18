var script = []
var count = 0;
const random = Math.floor(Math.random()*100);

const addBtn = document.getElementById("addButton");
const ScriptBox = document.getElementById("script");

ScriptBox.innerHTML =  script[count++];

addBtn.onclick = function(){
		console.log(count)
	if(count < script.length){
		ScriptBox.innerHTML = script[count++];
	}else{
		if(random < 50){	
			location.href="./darkForestBattleStart";
		}
		else{
			location.href="./darkForestEventScript";
		}
	}
}

