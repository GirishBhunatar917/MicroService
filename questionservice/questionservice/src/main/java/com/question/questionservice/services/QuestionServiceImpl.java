package com.question.questionservice.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.question.questionservice.Exceptions.ResourceNotFoundException;
import com.question.questionservice.Repositories.QuestionRepository;
import com.question.questionservice.entities.Questions;

@Service
public class QuestionServiceImpl implements QuestionService {
	
	private QuestionRepository questionrepo;

	public QuestionServiceImpl(QuestionRepository questionrepo) {
		this.questionrepo = questionrepo;
	}

	@Override
	public Questions add(Questions question) {
		
		return questionrepo.save(question);
	}

	@Override
	public List<Questions> getall() {
		
		return questionrepo.findAll();
	}

	@Override
	public Questions get(Long Questionid) {
		
		return questionrepo.findById(Questionid).orElseThrow(()->new ResourceNotFoundException("Quiz not found with id"+Questionid));
	}

	@Override
	public List<Questions> getQuestionsofquiz(Long quizId) {
		
		return questionrepo.findByQuizId(quizId);
	}

	

}
