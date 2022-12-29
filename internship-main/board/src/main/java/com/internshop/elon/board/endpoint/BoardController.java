package com.internshop.elon.board.endpoint;

import com.internshop.elon.board.endpoint.support.BoardDTO;
import com.internshop.elon.board.entity.Board;
import com.internshop.elon.board.repository.BoardRepository;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * step1. 게시글 목록을 조회 한다.
 * step2. 게시글을 저장한다.
 */
@RequestMapping("/api/board")
@RestController
public class BoardController {
	private final BoardRepository boardRepository;


	public BoardController(BoardRepository boardRepository) {
		this.boardRepository = boardRepository;
	}

	@GetMapping("/list")
	public List<BoardDTO.SearchRes> selectList(BoardDTO.SearchReq request){
		List<Board> list = boardRepository.selectBoardList(request);
		List<BoardDTO.SearchRes> result = new ArrayList<>();
		for (Board board : list) {
			result.add(new BoardDTO.SearchRes(board.getId(), board.getTitle()));
		}
		return result;
	}

	@PostMapping
	public void createBoard(@RequestBody BoardDTO.SaveReq request) {
		Board board = Board.builder().title(request.getTitle()).build();
		boardRepository.createBoard(board);
	}
}
