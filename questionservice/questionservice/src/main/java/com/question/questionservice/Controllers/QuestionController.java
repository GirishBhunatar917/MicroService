package com.question.questionservice.Controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.question.questionservice.entities.Questions;
import com.question.questionservice.services.QuestionService;


@RestController
@RequestMapping("/Question")
public class QuestionController {
	
	
	private QuestionService questionservice;

	public QuestionController(QuestionService questionservice) {
		this.questionservice = questionservice;
	}
	
	@PostMapping
	Questions Create(@RequestBody Questions question) {
		return questionservice.add(question);
		
	}
	
	@GetMapping
	List<Questions> getall(Questions question) {
		return questionservice.getall();
		
	}
	
	@GetMapping("/{Questionid}")
	public Questions get(@PathVariable Long Questionid) {
		return questionservice.get(Questionid);
	}
	
	//get all questions of specific quiz
	@GetMapping("/quiz/{quizId}")
	public List<Questions> getQuestionsofquiz(@PathVariable Long quizId){
		return questionservice.getQuestionsofquiz(quizId);
		
	}
	
	
	

}
