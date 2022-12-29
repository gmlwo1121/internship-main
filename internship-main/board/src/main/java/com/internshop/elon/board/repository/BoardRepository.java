package com.internshop.elon.board.repository;

import com.internshop.elon.board.endpoint.support.BoardDTO;
import com.internshop.elon.board.entity.Board;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/**
 * step1. 게시글 목록 조회한다.
 * step2. 게시글을 조회한다.
 * step3. 게시글을 저장한다.
 * step4. 게시글을 수정한다.
 * step5. 게시글을 삭제한다.
 */
@Component
public class BoardRepository {
	private List<Board> boardList = new LinkedList<>();

	public BoardRepository() {
		Board board = Board.builder().title("테스트 게시글 1").build();
		board.createId();
		boardList.add(board);
		board = Board.builder().title("테스트 게시글 2").build();
		board.createId();
		boardList.add(board);
	}

	/**
	 * step1. 게시글 목록 조회한다.
	 * @param request
	 * @return
	 */
	public List<Board>  selectBoardList(BoardDTO.SearchReq request){
		return boardList;
	}

	/**
	 * step1. 게시글을 저장한다.
	 * @param board
	 * @return
	 */
	public void createBoard(Board board){
		// 아이디를 생성한다.
		// 데이터를 저장한다.
		board.createId();
		boardList.add(board);
	}

}
