
var count = 0;

const addBtn = document.getElementById("addButton");
const ScriptBox = document.getElementById("script");

ScriptBox.innerHTML =  script[count++];

addBtn.onclick = function(){
		console.log(count)
	if(count < script.length){
		ScriptBox.innerHTML = script[count++];
	}else{
		location.href="./playerAction.jsp";
	}
}




// var script = [];
// script[0] = "루시는 하얀고양이다";
// script[1] = "루시는 소파에 엎드려있다";
// var count = 0;
// function reading(){
// 	return script[count];
// }
// 
// const addBtn = document.getElementById("addButton");
// const ScriptBox = document.getElementById("Script");

// addBtn.addEventListener("click", function(){
// 	const list = document.createElement("h3");
	
// 	if(count == 0){
// 		list.innerText = reading();
// 		ScriptBox.appendChild(list);
// 		count++;
// 	}
// 	else if(count < script.length){
// 		let next = document.getElementsByClassName("now")[0];
// 		next.innerText= reading();
// 		count++;
// 	}
// 	else {
// 		location.href="./UI/tutorial.jsp";
// 	}
	
 		 
	

// })