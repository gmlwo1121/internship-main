package com.internshop.elon.board.service;


import com.internshop.elon.board.repository.BoardRepository;
import org.springframework.stereotype.Service;

@Service
public class BoardServiceImpl implements BoardService{
	private final BoardRepository boardRepository;

	public BoardServiceImpl(BoardRepository boardRepository) {
		this.boardRepository = boardRepository;
	}

}
