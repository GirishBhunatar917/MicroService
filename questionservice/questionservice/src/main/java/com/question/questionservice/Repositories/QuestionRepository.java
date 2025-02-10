package com.question.questionservice.Repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.question.questionservice.entities.Questions;

public interface QuestionRepository extends JpaRepository<Questions, Long> {
    List<Questions> findByQuizId(Long quizId);
}
