package com.quiz.quizservice.controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import com.quiz.quizservice.Services.QuizService;
import com.quiz.quizservice.entities.Quiz;

@RestController
@RequestMapping("/quiz")
public class QuizController {
	
	private final QuizService quizservice;

	public QuizController(QuizService quizservice) {
		this.quizservice = quizservice;
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Quiz create(@RequestBody Quiz quiz) {	
		return quizservice.add(quiz);
	}
	
	@GetMapping
	public List<Quiz> getall(){
		return quizservice.get();
	}
	
	@GetMapping("/{id}")
	public Quiz getone(@PathVariable Long id) {
		return quizservice.get(id);
	}
}
