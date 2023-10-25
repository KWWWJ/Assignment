const deleteBtn = document.getElementById("this");

const newScript = document.createElement('h3');
newScript.setAttribute("id", "script");

const newDiv = document.createElement('div');
newDiv.setAttribute("id", "addButton");
newDiv.className = "butten-hover";

var script = [];
var count = 0;

function btnAction(){
	deleteBtn.remove();
	document.getElementById("new").appendChild(newScript);
	document.getElementById("new").appendChild(newDiv);
	document.getElementById("addButton").innerHTML +='<img class="image" alt="발바닥이미지" src="image/whitefoot.png">';
	
	const addBtn = document.getElementById("addButton");
	const ScriptBox = document.getElementById("script");
	
	ScriptBox.innerHTML = script[count++];
	
	addBtn.onclick = function(){
		if(count < script.length){
			ScriptBox.innerHTML = script[count++];
		}else{
			
		}
	}
}

function alley(){
	document.getElementById("chage").style.backgroundImage = "url('image/battle/alley/Standing-alley.png')";
	script =["루시는 그림자진 골목길에 들어섰습니다.",  "2번쨰 스크립트입니다", "3번쨰 스크립트입니다"]
	btnAction();
	
}
function darkForest(){
	document.getElementById("chage").style.backgroundImage = "url('image/battle/darkforest/battle-df-standing.png')";
	script =["루시는 검은나뭇잎을 입에 물고 공터를 배회합니다.",  "2번쨰 스크립트입니다", "3번쨰 스크립트입니다"]
	btnAction();
}
function home(){
	document.getElementById("chage").style.backgroundImage = "url('image/battle/home/Standing-home.png')";
	script =["루시는 느긋한 집으로 돌아왔습니다.",  "2번쨰 스크립트입니다", "3번쨰 스크립트입니다"]
	btnAction();
}
function jewelCave(){
	document.getElementById("chage").style.backgroundImage = "url('image/battle/jewelcave/Standing-jc.png')";
	script =["루시는 신비한 보석으로 아름답게 반짝이는 수정을 툭툭 쳐보고있습니다.",  "2번쨰 스크립트입니다", "3번쨰 스크립트입니다"]
	btnAction();
}
function cloud(){
	document.getElementById("chage").style.backgroundImage = "url('image/battle/cloud/Standing.png')";
	script =["루시는 구름에서 떨어질까 걱정이 됩니다.",  "2번쨰 스크립트입니다", "3번쨰 스크립트입니다"]
	btnAction();
}
function road(){
	document.getElementById("chage").style.backgroundImage = "url('image/battle/road/battleStanding-basic.png')";
	script =["루시는 차가운 길바닥을 거닐며 갈색 나뭇잎이 휘날리는 것을 가만히 지켜봅니다.",  "2번쨰 스크립트입니다", "3번쨰 스크립트입니다"]
	btnAction();
}




