var script =["루시는 신비한 보석으로 아름답게 반짝이는 수정을 툭툭 쳐보고있습니다."]
var count = 0;

const addBtn = document.getElementById("addButton");
const ScriptBox = document.getElementById("script");

ScriptBox.innerHTML =  script[count++];

addBtn.onclick = function(){
		console.log(count)
	if(count < script.length){
		ScriptBox.innerHTML = script[count++];
	}else{
		location.href="./jewelCaveEvent";
	}
}
