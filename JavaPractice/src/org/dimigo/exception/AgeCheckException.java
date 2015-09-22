package org.dimigo.exception;

public class AgeCheckException extends Exception {
		public AgeCheckException() {}
		public AgeCheckException(Movie movie) throws Exception {
			super(movie.getTitle() + " 은/는 " + movie.getLimitAge() + "이상 관람가 입니다.");
		}
}
