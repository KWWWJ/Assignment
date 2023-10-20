var script = ["버튼 위치 변화 확인용 스크립트. 줄 변화마다 위치가 옮겨지면 position으로 다시 변경"]
var count = 0;

const addBtn = document.getElementById("addButton");
const ScriptBox = document.getElementById("script");

ScriptBox.innerHTML =  script[count++];

addBtn.onclick = function(){
		console.log(count)
	if(count < script.length){
		ScriptBox.innerHTML = script[count++];
	}else{
		location.href="./tutorial";
	}
}

