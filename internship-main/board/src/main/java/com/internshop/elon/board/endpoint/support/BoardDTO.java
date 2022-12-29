package com.internshop.elon.board.endpoint.support;

import lombok.Getter;
import lombok.Setter;

public class BoardDTO {

	@Getter
	@Setter
	public static class SearchReq {
		private String title; // 제목
	}


	@Getter
	@Setter
	public static class SearchRes {
		private long id;
		private String title; // 제목

		public SearchRes(long id, String title) {
			this.id = id;
			this.title = title;
		}
	}

	@Getter
	@Setter
	public static class SaveReq {
		private String title; // 제목
	}
}
