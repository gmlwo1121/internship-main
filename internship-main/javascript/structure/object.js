// json
const user = {
	name : '영희',
	age : 20,
	bobby : ['축구', '농구', 20,
		function hi(){console.log('say hello')}],
	introduce : function(){
		console.log('저는 20살 영희 입니다.');
	}
}

console.log(user.name);
console.log(user['name']);
console.log(user.age);
console.log(user.introduce());
