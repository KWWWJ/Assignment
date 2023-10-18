var script =["루시는 구름에서 떨어질까 걱정이 됩니다."]
var count = 0;

const addBtn = document.getElementById("addButton");
const ScriptBox = document.getElementById("script");

ScriptBox.innerHTML =  script[count++];

addBtn.onclick = function(){
		console.log(count)
	if(count < script.length){
		ScriptBox.innerHTML = script[count++];
	}else{
		location.href="./cloudEvent";
	}
}
