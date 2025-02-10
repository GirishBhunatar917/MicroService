package com.quiz.quizservice.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Questions {
	
	
	Long Questionid;
	
	String Question;
	
	
	private Long quizId;

}
