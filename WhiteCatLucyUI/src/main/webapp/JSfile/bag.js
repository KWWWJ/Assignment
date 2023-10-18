var script = ["아이템 설명"]
var count = 0;

const addBtn = document.getElementById("addButton");
const ScriptBox = document.getElementById("script");

ScriptBox.innerHTML =  script[count++];

addBtn.onclick = function(){
	//이후 아이템 목록의 설명이 나타나는 방식으로 수정 예정
		console.log(count)
	if(count < script.length){
		ScriptBox.innerHTML = script[count++];
	}else{
		location.href="./playerAction";
	}
}

