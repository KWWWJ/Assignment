var script = [];
script[0] = "루시는 하얀 고양이다.\n";
script[1] = "루시는 소파위에 엎드려있다.\n";

var count = 0;
function scriptReading(){
	document.write(script[count]);
	count++;
}




function printScript(){
	//const next = document.getElementById('next');
	//document.getElementById("result").innerText = scriptReading();
	for(step = 0; step<script.length; step++){
		setTimeout(scriptReading,2000);
	}	
}
/*
function loadScript(src, callback) {
  // <script> 태그를 만들고 페이지에 태그를 추가합니다.
  // 태그가 페이지에 추가되면 src에 있는 스크립트를 로딩하고 실행합니다.
  let script = document.createElement('script');
  script.src = src;
  
  script.onload = () => callback(script);
  
  document.head.append(script);
}
loadScript('/typing.js', scriptReading())
scriptReading();
*/
/*
document.addEventListener('DOMContentLoaded', function() {
	var button = document.createElement('button');
	button.type = 'button';
	button.innerHTML = 'Press me';
	button.className = 'btn-styled';
	 	
	button.onclick = function() {
	    document.getElementById("result").innerText = scriptReading();
	};
	 
	var container = document.getElementById('container');
	container.appendChild(button);
	    
	}, false);
	
*/

