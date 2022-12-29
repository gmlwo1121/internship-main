package com.internshop.elon.board.repository;


import com.internshop.elon.board.endpoint.support.BoardDTO;
import com.internshop.elon.board.entity.Board;

import javax.validation.constraints.AssertTrue;
import java.util.List;

class BoardRepositoryTest {



	public static void main(String[] args) {
		BoardRepository repository = new BoardRepository();
		List<Board> boardList = repository.selectBoardList(new BoardDTO.SearchReq());
		if( boardList.size() == 0){
			System.out.println("정상");
		}else{
			System.out.println("비정상");
		}

		Board board = Board.builder()
				.title("테스트 게시글")
				.build();
		repository.createBoard(board);

		boardList = repository.selectBoardList(new BoardDTO.SearchReq());
		if( boardList.size() == 1 && boardList.get(0).getTitle().equals("테스트 게시글")){
			System.out.println("정상");
		}else{
			System.out.println("비정상");
		}
	}


}
