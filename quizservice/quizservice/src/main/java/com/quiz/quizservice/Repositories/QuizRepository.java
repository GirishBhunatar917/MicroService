package com.quiz.quizservice.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.quiz.quizservice.entities.Quiz;

public interface QuizRepository extends JpaRepository<Quiz,Long>{

}
