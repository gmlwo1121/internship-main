package com.internshop.elon.board.endpoint;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * step1. 목록에 대한 화면을 정의한다.
 * step2. 글쓰기에 대한 화면을 정의한다.
 * step3. 상세보기에 대한 화면을 정의한다.
 * step4. 수정하기에 대한 화면을 정의한다.
 */

/**
 * 게시판에 대한 화면을 매핑하는 컨트롤러
 */
@Controller
public class ViewController {
	/**
	 * step1. 목록에 대한 화면을 정의한다.
	 * @return
	 */
	@GetMapping
	public String index(){
		return "index";
	}

	/**
	 * step2. 글쓰기에 대한 화면을 정의한다.
	 * @return
	 */
	@GetMapping("/write")
	public String write(){
		return "write";
	}

}
