var script =["루시는 느긋한 집으로 돌아왔습니다."]
var count = 0;

const addBtn = document.getElementById("addButton");
const ScriptBox = document.getElementById("script");

ScriptBox.innerHTML =  script[count++];

addBtn.onclick = function(){
		console.log(count)
	if(count < script.length){
		ScriptBox.innerHTML = script[count++];
	}else{
		location.href="./homeEvent";
	}
}
