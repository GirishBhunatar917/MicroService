package com.quiz.quizservice.Services;

import java.util.List;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.quiz.quizservice.entities.Questions;

@FeignClient(url="http://localhost:8082",value="Question-Client")
public interface QuestionClient {
	
	@GetMapping("/Question/quiz/{quizId}")
	List<Questions> getQuestionsofquiz(@PathVariable Long quizId);

}
