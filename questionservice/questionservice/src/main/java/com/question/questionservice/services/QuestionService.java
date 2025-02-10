package com.question.questionservice.services;

import java.util.List;

import com.question.questionservice.entities.Questions;

public interface QuestionService {
	
	
	Questions add(Questions question);
	
	List<Questions> getall();
	
	Questions get(Long id);
	

	List<Questions> getQuestionsofquiz(Long quizId);

}
