/**
 * 화면을 rendering 한다.
 * @param data
 */
function render(datas){
	const tableBody = document.querySelector('table tbody');
	let htmlString = '';
	for(let i = 0 ; i < datas.length  ; i++ ){
		const data = datas[i]
		htmlString += `<tr><td>${data.id}</td><td>${data.title}</td></tr>`;
	}

	tableBody.innerHTML = htmlString;
}

/**
 * api 를 통해 보드 데이터를 가져온다.
 */
function getBoardData(){
	fetch('/api/board/list')
	.then(res => res.json())
	.then(render);
}


// 초기화 함수
function init(){
	// 초기 데이터로딩
	console.log('init')
	getBoardData();
}
init();

