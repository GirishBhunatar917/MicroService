package com.quiz.quizservice.Services;

import java.util.List;

import com.quiz.quizservice.entities.Quiz;

public interface QuizService {
	
	
	Quiz add(Quiz quiz);
	
	List<Quiz> get();
	
	Quiz get(Long id);
	
	
	

}
