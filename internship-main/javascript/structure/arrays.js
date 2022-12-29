const mon = "mon";
const tue = "tue";
const wed = "wed";
const thu = "thu";
const fri = "fri";
const sat = "sat";
const sun = "sun";

/*
const sayHello = function(){
	console.log('5')
	console.log('hello~')
	console.log('6')
}
const callback = function(hello){
	console.log('3');
	hello()
	console.log('4');
}
//console.log(daysOfWeek)
console.log('1')
callback(    sayHello    );
console.log('2')
//console.log(daysOfWeek[7]())
console.log(console)
*/


// 배열 추가 삭제 수정
const daysOfWeek = [mon, tue, wed, thu, fri, sat, sun];

// 함수사용 X
// 지정한 위치에 요소 추가 하거나 수정
daysOfWeek[7] = 123; // 추가
daysOfWeek[10] = 123; // 배열 10번쨰에 추가돼며 배정되지않은 요소는 전부 undefined
daysOfWeek[5] = 123; // 수정

// Array[Array.length] 배열의 끝에 요소를 추가
daysOfWeek[daysOfWeek.length] = "hello" ;
// Array.length-1 배열의 끝에 요소를 삭제
daysOfWeek.length = daysOfWeek.length - 1 ;


// 추가 함수 Array.push(), Array.unshift()
// 배열의 끝에 요소를 추가
daysOfWeek.push("일요일");
// 배열의 앞쪽에 요소를 추가
daysOfWeek.unshift('일요일');

// 삭제 함수 Array.shift(), Array.pop(), delete Array[index]
// 배열의 앞쪽에 요소를 삭제
daysOfWeek.shift();
// 삭제된 요소를 가져오는것도 가능
const removeShift = daysOfWeek.shift();
// 배열의 끝에 요소를 삭제
daysOfWeek.pop();
// 삭제된 요소를 가져오는것도 가능
const removePop = daysOfWeek.pop();
// delete 배열을 삭제할 경우 값만 삭제 되며 undefined 으로 남는다
delete daysOfWeek[1];

// 배열 수정
// Array.slice(start, end) 원하는 인덱스 구간만큼 잘라서 배열 객체 생성
daysOfWeek.slice("일요일");
// Array.concat() 두개의 배열 객체를 하나로 결합
daysOfWeek.concat("일요일");
// Array.filter() 특정 만족값만 모아 새로운 배열 생성
daysOfWeek.filter("일요일");

// Array.splice(index , delete , items)
// (위치, 제거할 요소 수, 추가할 요소)
// index 에서 delete 만큼 제거
daysOfWeek.splice(3,2);
// 삭제된 요소를 가져오는것도 가능
const removeSplice = daysOfWeek.splice(3,2);
// index 에 items 추가
daysOfWeek.splice(3,0,"일요일","토요일");
// index 에서 delete 만큼 제거한 후 그자리에 items 추가
daysOfWeek.splice(3,2,"일요일","토요일");













