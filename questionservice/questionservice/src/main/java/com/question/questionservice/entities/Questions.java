package com.question.questionservice.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Questions {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	Long Questionid;
	
	String Question;
	
	
	private Long quizId;

}
