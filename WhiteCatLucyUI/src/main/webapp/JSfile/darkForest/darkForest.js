var script =["루시는 검은나뭇잎을 입에 물고 공터를 배회합니다."]
var count = 0;

const addBtn = document.getElementById("addButton");
const ScriptBox = document.getElementById("script");

ScriptBox.innerHTML =  script[count++];

addBtn.onclick = function(){
		console.log(count)
	if(count < script.length){
		ScriptBox.innerHTML = script[count++];
	}else{
		location.href="./darkForestEvent";
	}
}
