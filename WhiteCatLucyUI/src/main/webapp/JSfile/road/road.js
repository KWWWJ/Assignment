var script =["루시는 차가운 길바닥을 거닐며 갈색 나뭇잎이 휘날리는 것을 가만히 지켜봅니다."]
var count = 0;

const addBtn = document.getElementById("addButton");
const ScriptBox = document.getElementById("script");

ScriptBox.innerHTML =  script[count++];

addBtn.onclick = function(){
		console.log(count)
	if(count < script.length){
		ScriptBox.innerHTML = script[count++];
	}else{
		location.href="./roadEvent";
	}
}

