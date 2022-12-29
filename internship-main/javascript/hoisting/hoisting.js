// 함수 안에 있는 선언들을 모두 끌어 올려서 해당 함수 유효 범위의 최상단에 선언하는 것.


function student() {
	console.log('1. name => ', name);
	var name = '길동이';
	console.log('2. name => ', name);

	function name() {
		console.log('이름은 name 입니다.');
	}
	console.log('3 name => ', name);
}


function getName(name) {
	return "이름은 " + name + "입니다.";
}

const story = getName("이엘온");
console.log(story)



// function student() {
// 	var name;
// 	var name = function name() {
// 		console.log('이름은 name 입니다.');
// 	}
// 	console.log('1. name => ', name);
// 	name = '길동이';
// 	console.log('2. name => ', name);
// 	console.log('3. name => ', name);
// }


//student();
//student();
//student();
//student();

function student(){
	console.log('11. name => ', name);
	var name = '길동이';
	console.log('22. name => ', name)

	function name() {
		console.log('이름은 name 입니다.');
	}
	console.log('33 name => ', name);
}

console.log(student());




const stu = student;

stu();

