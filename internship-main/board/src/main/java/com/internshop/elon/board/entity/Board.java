package com.internshop.elon.board.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import java.util.Date;


/**
 * The type Board.
 */
@Getter
@Builder
@AllArgsConstructor
public class Board {
	private long id;
	private String title;

	public void createId() {
		this.id = new Date().getTime();
	}
}
