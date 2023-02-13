package com.scalerschemadesign.model;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class BatchModuleExamStudent extends BaseModel {
	
	@ManyToOne
	private BatchModuleExam batchModuleExam;

	@ManyToOne
	private Student student;
	
	private int marks;
	private String result;
	
}
