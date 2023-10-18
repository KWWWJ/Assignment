var script = ["이벤트 스크립트"]
var count = 0;

const addBtn = document.getElementById("addButton");
const ScriptBox = document.getElementById("script");

ScriptBox.innerHTML =  script[count++];

addBtn.onclick = function(){
		console.log(count)
	if(count < script.length){
		ScriptBox.innerHTML = script[count++];
	}else{
		location.href="./playerActionScript";
	}
}

/*
import{event} from "./Event.js"

if(event == 1){	
	var script = ["alley 이벤트"]
}
if(event == 2){
	var script = ["darkForest 이밴트"]
}
if(event == 3){
	var script = ["home 이밴트"]
}
if(event == 4){
	var script = ["jewelcave 이밴트"]
}
if(event == 5){
	var script = ["cloud 이밴트"]
}
if(event == 6){
	var script = ["road 이밴트"]
}
*/
