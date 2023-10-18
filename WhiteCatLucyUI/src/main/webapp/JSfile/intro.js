var script = [" 하이얀 털을 가진 고양이 루시는 따듯하고 푹신한 소파위에 몸을 말고 깊은 잠에 빠져들었습니다.", 
" 어쨰서인지 자신이 꿈을 꾸고있다는 것을 알아차렸으면서도 꿈에서 꺠어나지 않았지만 위험하다는 느낌은 들지 않았습니다.", 
" 언제나 보던 부얶과 거실, 굴러다니는 실뭉치, 반짝거리는 유리구슬이 있었으니까요.",
" 루시는 유난히 무거운 몸을 뒤척이며 일어났고, 부얶에서 솔솔 흘러드는 맛있는 냄새에 이끌려 휘청이며 발걸음을 옮겼습니다."]
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