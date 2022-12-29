

// 함수 선언문
function printName(){
	console.log('print name')
}
printName();

// 익명 함수 표현식
var printName = function(){
	console.log('print name')
}
printName();

// 기명 함수 표현식
var printName = function print() {
	console.log('print name')
}
printName();
