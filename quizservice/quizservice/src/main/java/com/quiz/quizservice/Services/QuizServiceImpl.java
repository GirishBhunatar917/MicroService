package com.quiz.quizservice.Services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.quiz.quizservice.Exceptions.ResourceNotFoundException;
import com.quiz.quizservice.Repositories.QuizRepository;
import com.quiz.quizservice.entities.Quiz;

@Service
public class QuizServiceImpl implements QuizService {

	private final QuizRepository quizrepository;
	
	private QuestionClient questionclient; 
	
	

	public QuizServiceImpl(QuizRepository quizrepository, QuestionClient questionclient) {
		super();
		this.quizrepository = quizrepository;
		this.questionclient = questionclient;
	}

	@Override
	public Quiz add(Quiz quiz) {
		return quizrepository.save(quiz);
	}

	@Override
	public List<Quiz> get() {
		List<Quiz> quizzes= quizrepository.findAll();
		
		List<Quiz> newQuizList= quizzes.stream().map(quiz->{
			quiz.setQuestions(questionclient.getQuestionsofquiz(quiz.getId()));
			return quiz;
			
		}
				).collect(Collectors.toList());
		return newQuizList;
		
		
	}

	@Override
	public Quiz get(Long id) {
		Quiz quiz=quizrepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Quiz not found with id " + id));
		
		quiz.setQuestions(questionclient.getQuestionsofquiz(quiz.getId()));
		return quiz;
	}
}
